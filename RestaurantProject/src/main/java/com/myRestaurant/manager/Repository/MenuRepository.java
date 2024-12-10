package com.myRestaurant.manager.Repository;

import com.myRestaurant.manager.Entities.Menu;
import com.myRestaurant.manager.Entities.DishType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<Menu> findByDishType(DishType dishType);
}