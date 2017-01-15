package com.vadimrostov.service;

import com.vadimrostov.dao.MenuItemDAO;
import com.vadimrostov.domain.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алиса on 09.01.2017.
 */

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuItemDAO menuItemDAO;

    @Override
    public void save(MenuItem menuItem) {
        menuItemDAO.save(menuItem);
    }

    @Override
    public List<MenuItem> loadmenu() {
        return menuItemDAO.loadlist();
    }

    @Override
    public MenuItem getMenuItem(Long id) {
        return menuItemDAO.get(id);
    }
}
