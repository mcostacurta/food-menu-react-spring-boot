package com.menu.menu.food;

import java.util.UUID;

public record FoodResponseDTO(UUID id, String title, String image, Integer price) {
    
}
