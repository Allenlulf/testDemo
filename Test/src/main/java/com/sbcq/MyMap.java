package com.sbcq;

/**
 * 面向接口编程
 * 
 * @author lulf
 * @param <K>
 * @param <V>
 */
public interface MyMap<K, V> {
	// MyMap 基本功能是快速存
	public V put(K k, V v);

	// 快速取
	public V get(K k);

	// 定义一个内部的接口
	public interface Entry<K, V> {
		public K getKey();

		public V getValue();
	}
}