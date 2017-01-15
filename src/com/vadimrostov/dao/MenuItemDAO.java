package com.vadimrostov.dao;

import com.vadimrostov.domain.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Алиса on 09.01.2017.
 */

@Repository
public interface MenuItemDAO {

    public void save(Object o);

    public List<MenuItem> loadlist();

    public MenuItem get(Long id);}
