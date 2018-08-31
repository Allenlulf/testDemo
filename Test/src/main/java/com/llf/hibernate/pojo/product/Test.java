package com.llf.hibernate.pojo.product;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.llf.hibernate.pojo.Category;
import com.llf.hibernate.pojo.Product;
import com.llf.hibernate.pojo.User;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        //增加三个用户
        Set<User> users=new HashSet<>();
        for(int i=1;i<=3;i++){
        	User u=new User();
        	u.setName("User"+i);
        	users.add(u);
        	s.save(u);	
        }
        //商品1被用户123购买
        Product p=(Product) s.get(Product.class, 1);
        p.setUsers(users);
        s.save(p);
        s.getTransaction().commit();
        s.close();
        sf.close();
	}
}
