package com.llf.yuanxing;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

//孙悟空
public class MonKyKing extends Monky implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7446387088921000645L;

	// 金箍棒
	private JinGuBang jgb;

	MonKyKing() {
		this.jgb = new JinGuBang();
		this.setHeight(1000);
		this.setName("孙悟空");
		this.setDate(new Date());
	}

	// 分身术
	public Object clone() {
		
		ByteArrayOutputStream bos=null;
		ObjectOutputStream oos=null;
		ByteArrayInputStream bis=null;
		ObjectInputStream ois = null;
		try {
			//return super.clone();
			//序列化
			bos=new ByteArrayOutputStream();
			oos=new  ObjectOutputStream(bos);
			oos.writeObject(this);
			//反序列化
			bis=new ByteArrayInputStream(bos.toByteArray());
			ois=new  ObjectInputStream(bis);
			MonKyKing copy=(MonKyKing) ois.readObject();
			copy.setDate(new Date());
			return copy;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				ois.close();
				bis.close();
				oos.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

	public void change() {
		MonKyKing mk = (MonKyKing) clone();
		System.out.println("孙猴子本尊生日：" + this.getDate().getTime());
		System.out.println("克隆孙猴子本尊生日：" + mk.getDate().getTime());
		System.out.println("本尊和克隆是否是同一个对象：" + (this == mk));
		System.out.println("本尊和克隆持有的金箍棒是否是同一个对象：" + (this.jgb == mk.jgb));
	}

	public JinGuBang getJgb() {
		return jgb;
	}

	public void setJgb(JinGuBang jgb) {
		this.jgb = jgb;
	}

}
