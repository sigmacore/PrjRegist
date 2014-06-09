/**
 * 
 */
package com.reg.dao;

/**
 * @author hao
 *
 */
public interface Dao<T> {
	
	boolean save(T t);
	
	boolean update(T t);
	
	boolean delete(int cId);
	
	T findById(int cId);
	
	T findByName(String fname, String lname, String cname);

}
