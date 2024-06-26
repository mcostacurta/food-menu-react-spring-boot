package com.menu.menu.conrtoller;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menu.menu.ResourceInvalidException;
import com.menu.menu.ResourceNotFoundException;
import com.menu.menu.food.Food;
import com.menu.menu.food.FoodMapper;
import com.menu.menu.food.FoodRepository;
import com.menu.menu.food.FoodRequestDTO;
import com.menu.menu.food.FoodResponseDTO;

@RestController
@RequestMapping("food")
public class FoodConrtoller {

    @Autowired
    private FoodRepository repository;

    @GetMapping()
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodMapper::toResponseDTO).collect(Collectors.toList());

        return foodList;
    }
    
    //get by id using path param
    @GetMapping("{id}") 
    public FoodResponseDTO getById(@PathVariable UUID id) {
        if (id == null) {
            throw new ResourceInvalidException("Invalid data , please verify the parameters!");
        }

        Food food = repository.findById(id).get();
        if (food == null) {
            throw new ResourceNotFoundException("Food not found with id: " + id);
        }
        return FoodMapper.toResponseDTO(food);
    }

    //save food
    @PostMapping
    public ResponseEntity<Food> save(@RequestBody FoodRequestDTO request) {
        if (
        request.title() == null || 
        request.title().isEmpty() ||
        request.price() == null || 
        request.price() <= 0 || 
        request.image() == null || 
        request.image().isEmpty())
        {
            throw new ResourceInvalidException("Invalid data , please verify the body content!");
        }
        Food food = FoodMapper.toEntity(request);
        Food savedFood = repository.save(food);
        return ResponseEntity.ok().body(savedFood);
    }
}
