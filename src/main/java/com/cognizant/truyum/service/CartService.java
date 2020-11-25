package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.CartDao;
import com.cognizant.truyum.dao.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;

@Service
/**
 * 
 * @author Admin
 *
 */
public class CartService {
    /**
     * An instance to store object of
     * {@link com.cognizant.truyum.dao.CartDaoCollectionImpl} class
     * 
     */
    private CartDao cartDao;

    /**
     * This invokes the
     * {@link com.cognizant.truyum.dao.CartDaoCollectionImpl#getAllCartItems(long)}
     * and returns the same
     * 
     * @param userId
     * @return
     * @throws CartEmptyException
     */
    public List<MenuItem> getAllCartItems(final long userId) throws CartEmptyException {
        return cartDao.getAllCartItems(userId);
    }

    @Autowired
    public void setCartDao(final CartDao cartDao) {
        this.cartDao = cartDao;
    }

    /**
     * 
     * @param userId
     * @param menuItemId
     */
    public void addCartItem(final long userId, final long menuItemId) {
        cartDao.addCartItem(userId, menuItemId);
    }

    /**
     * 
     * @param userId
     * @param menuItemId
     */
    public void removeCartItem(final long userId, final long menuItemId) {
        cartDao.removeCartItem(userId, menuItemId);
    }
}
