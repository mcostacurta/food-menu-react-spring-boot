package com.menu.menu.food;

public class FoodMapper {
    public static FoodResponseDTO toResponseDTO(Food food) {
        return new FoodResponseDTO(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

    public static FoodRequestDTO toRequestDTO(Food food) {
        return new FoodRequestDTO(food.getTitle(), food.getImage(), food.getPrice());
    }

    public static Food toEntity(FoodRequestDTO request) {
        return new Food(null, request.title(), request.image(), request.price());
    }

    public static Food toEntity(FoodResponseDTO response) {
        return new Food(response.id(), response.title(), response.image(), response.price());
    }

    
    
}
