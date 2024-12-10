package com.myRestaurant.manager.Service;

import com.myRestaurant.manager.Entities.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenuItemsByType(String type);
}