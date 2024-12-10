package com.myRestaurant.manager.Entities;

import jakarta.persistence.*;
import lombok.Data;
import com.myRestaurant.manager.Entities.DishType;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "menu")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishId;

    @Column(name = "dish_name", nullable = false)
    private String dishName;

    @Enumerated(EnumType.STRING)
    @Column(name = "dish_type", nullable = false)
    private DishType dishType;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "image_path")
    private String imagePath;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public DishType getDishType() {
		return dishType;
	}

	public void setDishType(DishType dishType) {
		this.dishType = dishType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
    
}