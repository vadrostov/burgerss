package com.vadimrostov.service;

import com.vadimrostov.domain.MenuItem;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Алиса on 09.01.2017.
 */

@Service
public interface MenuService {

    public void save(MenuItem menuItem);

    public List<MenuItem> loadmenu();

    public MenuItem getMenuItem(Long id);
}
