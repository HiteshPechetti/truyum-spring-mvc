package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;

@Service("menuItemService")
/**
 * 
 * @author Admin
 *
 */
public class MenuItemService {
    
    @Autowired
    /**
     * 
     */
    private MenuItemDao menuItemDao;

    
    public void setMenuItemDao(final MenuItemDao menuItemDao) {
        this.menuItemDao = menuItemDao;
    }

    public MenuItemDao getMenuItemDao() {
        return menuItemDao;
    }

    /**
     * 
     * @return
     */
    public List<MenuItem> getMenuItemListAdmin() {

        return menuItemDao.getMenuItemListAdmin();
    }

    /**
     * 
     * @return
     */
    public List<MenuItem> getMenuItemListCustomer() {

        return menuItemDao.getMenuItemListCustomer();
    }

    /**
     * 
     * @param menuItemId
     * @return
     */
    public MenuItem getMenuItem(final long menuItemId) {

        return menuItemDao.getMenuItem(menuItemId);
    }

    /**
     * 
     * @param menuItem
     */
    public void editMenuItem(final MenuItem menuItem) {
        menuItemDao.modifyMenuItem(menuItem);
    }

}
