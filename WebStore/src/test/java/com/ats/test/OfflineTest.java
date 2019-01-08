package com.ats.test;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.ats.dao.ProductsDaoImplemented;
import com.ats.dao.ShopUserDaoImplemented;
import com.ats.model.*;
import com.ats.util.SessionUtil;

public class OfflineTest {

	public static void main(String[] args) {
		
		/*
		ProductsDaoImplemented pdao = new ProductsDaoImplemented();
		
		Products p1 = new Products();
		p1.setProductId(5);
		p1.setProductName("PRODUCT5");
		p1.setCategory("CAT2");
		p1.setPrice(1);
		p1.setQuantity(20);
		
	//	pdao.add(p1);
		pdao.getById(9);
		*/
		
		ShopUser u1 = new ShopUser();
		u1.setFirstName("JOHN");
		u1.setLastName("SMITH");
		u1.setOrders(null);
		u1.setPassword("PASSWORD");
		u1.setUsername("JOHN_SMITH");
		
		ShopUserDaoImplemented udao = new ShopUserDaoImplemented();/**/
		//udao.add(u1);
		udao.checkById(u1.getUsername());
		udao.getById(u1.getUsername());
		//udao.deleteById(u1.getUsername());
		udao.getPastOrders(u1.getUsername());
		
	}

}
