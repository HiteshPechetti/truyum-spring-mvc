/**
 * An Interface for aiding in the implementation of Cart Dao Classes
 * 
 */
package com.cognizant.truyum.dao;

import java.util.List;
import com.cognizant.truyum.model.MenuItem;


/**
 * 
 * @author Admin
 *
 */
public interface CartDao {
	
	/**
	 * 
	 * @param userId
	 * @param menuItemId
	 */
	public void addCartItem(long userId, long menuItemId);
	
	/**
	 * 
	 * @param userId
	 * @return
	 * @throws CartEmptyException
	 */
	
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException;
	
	/**
	 * 
	 * @param userId
	 * @param menuItemId
	 */
	public void removeCartItem(long userId, long menuItemId);
	
}
