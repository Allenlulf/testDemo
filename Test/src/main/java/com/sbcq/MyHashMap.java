package com.sbcq;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> implements MyMap<K, V> {

	// 定义数组大小 16
	// 结合着下面的扩容因子来解释一波：假如数组用了 4 usesize/defaulLenth =4/16=0.25 即使用率<0.75,不会扩容
	private static int defaulLenth = 1 << 4;
	// 扩容标准 所使用的useSize / 数组长度 >0.75
	// defaulAddSizeFactor 过大 造成扩容概率变低 存储小 但是就是存与取的效率降低
	// 0.9 有限的数组长度空间位置内会形成链表 在存与取值中都必须进行大量的遍历和判断(逻辑)
	// 过小 内存使用比较多，使用率不高，造成浪费
	private static double defaulAddSizeFactor = 0.75;

	// 使用数组位置的总数
	private int useSize;

	// 定义Map 骨架 只要 数组之一 数组
	private Entry<K, V>[] table = null;

	// Spring 门面模式运用
	public MyHashMap() {
		this(defaulLenth, defaulAddSizeFactor);
	}

	public MyHashMap(int length, double defaulAddSizeFactor) {
		if (length < 0)
			throw new IllegalArgumentException("参数不能为负数" + length);
		if (defaulAddSizeFactor <= 0 || Double.isNaN(defaulAddSizeFactor)) {
			throw new IllegalArgumentException("扩容标准必须是大于0的数字" + defaulAddSizeFactor);
		}
		this.defaulLenth = length;
		this.defaulAddSizeFactor = defaulAddSizeFactor;
		table = new Entry[defaulLenth];
	}

	@Override
	public V put(K k, V v) {
		// 存储是判断是否需要扩容
		if (useSize > defaulAddSizeFactor * defaulLenth) {
			up2Size();
		}
		// 获取数组下标
		int index = getIndex(k, table.length);
		Entry<K, V> entry = table[index];
		// 判断这个entry是否为空，为空意味着未被散列到
		if (entry == null) {
			table[index] = new Entry(k, v, null);
			useSize++;
		} else if (entry != null) {
			// 形成了链表结构
			table[index] = new Entry(k, v, entry);
		}
		return table[index].getValue();
	}

	// 寻找数组的下标
	private int getIndex(K k, int length) {
		int m = length - 1;
		int index = hash(k.hashCode()) & m;
		return index;
	}

	// 自定义写自己的hash算法
	private int hash(int hashCode) {
		hashCode = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
		return hashCode ^ ((hashCode >>> 7) ^ (hashCode >>> 4));
	}

	// 扩容
	private void up2Size() {
		// 如何扩容，无非就是新建一个2倍空间的数组
		Entry<K, V>[] newTable = new Entry[2 * defaulLenth];
		// 老数组的内容拿到新数组中
		againHash(newTable);
	}

	// 将老数组内容散列到新数组中
	private void againHash(MyHashMap<K, V>.Entry<K, V>[] newTable) {
		List<Entry<K, V>> entryList = new ArrayList<MyHashMap<K, V>.Entry<K, V>>();
		// for循环 即老数组内容被全部遍历到了entryList中
		for (int i = 0; i < table.length; i++) {
			if (table[i] == null) {
				continue;
			}
			// 继续找存到数组上的entry对象
			foundEntryByNext(table[i], entryList);
		}
		// 设置entryList
		if (entryList.size() > 0) {
			useSize = 0;
			defaulLenth = 2 * defaulLenth;
			for (Entry<K, V> entry : entryList) {
				if (entry.next != null) {
					entry.next = null;
				}
				put(entry.getKey(), entry.getValue());
			}
		}
	}

	private void foundEntryByNext(MyHashMap<K, V>.Entry<K, V> entry, List<MyHashMap<K, V>.Entry<K, V>> entryList) {
		// 形成了链表结构
		if (entry != null && entry.next != null) {
			entryList.add(entry);
			// 递归，不断地一层层取存entry
			foundEntryByNext(entry.next, entryList);
		} else {
			// 没有链表的情况
			entryList.add(entry);
		}
	}

	public int getUseSize() {
		return useSize;
	}

	@Override
	public V get(K k) {
		// hashCode (new Person(10,'llf'))--->hash---getindex--->最终位置
		int index = getIndex(k, table.length);
		if (table[index] == null) {
			throw new NullPointerException();
		}
		return findByValueByEqualKey(k, table[index]);
	}

	private V findByValueByEqualKey(K k, MyHashMap<K, V>.Entry<K, V> entry) {
		if (k == entry.getKey() || k.equals(entry.getKey())) {
			return entry.getValue();
		} else if (entry.next != null) {
			return findByValueByEqualKey(k, entry.next);
		}
		return null;
	}

	// 创建一个内部存储的对象类型

	class Entry<K, V> implements MyMap.Entry<K, V> {
		K k;
		V v;
		// 指向那被this挤压辖区的Entry对象
		Entry<K, V> next;

		public Entry(K k, V v, Entry<K, V> next) {
			this.k = k;
			this.v = v;
			this.next = next;
		}

		@Override
		public K getKey() {
			return k;
		}

		@Override
		public V getValue() {
			return v;
		}
	}
}