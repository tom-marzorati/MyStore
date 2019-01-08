package com.ats.dao;

import com.ats.model.Products;

public interface ProductsDaoInterface {
	
	public Products getById(int id);
	public void add(Products p);
	public void update(Products p);
	public void deleteById(int id);
	public boolean checkById(int id);

}
