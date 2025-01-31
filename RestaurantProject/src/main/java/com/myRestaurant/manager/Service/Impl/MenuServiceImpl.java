package com.myRestaurant.manager.Service.Impl;

import com.myRestaurant.manager.Entities.Menu;
import com.myRestaurant.manager.Entities.DishType;
import com.myRestaurant.manager.Repository.MenuRepository;
import com.myRestaurant.manager.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> getMenuItemsByType(String type) {
        try {
            DishType dishType = DishType.valueOf(type);
            return menuRepository.findByDishType(dishType);
        } catch (IllegalArgumentException e) {
            return List.of(); // Trả về danh sách rỗng nếu type không hợp lệ
        }
    }
}