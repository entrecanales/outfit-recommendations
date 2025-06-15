package com.entrecanales.outfit_recommendations.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.entrecanales.outfit_recommendations.entities.requests.OutfitRecommendationRequest;
import com.entrecanales.outfit_recommendations.services.OutfitsService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("outfits")
public class OutfitsController {

    private final OutfitsService service;

    public OutfitsController(OutfitsService service) {
        this.service = service;
    }
    
    @PostMapping("recommendation")
    public String GetRecommendation(@RequestBody OutfitRecommendationRequest request) {
        if (request == null || request.getTop() == null && request.getBottom() == null && request.getShoes() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "You need to specify at least one article of clothing");
        }
        if (request.getTop() != null && request.getBottom() != null && request.getShoes() != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "At least one article of clothing needs to be unspecified");
        }

        return service.GetRecommendation(request.getTop(), request.getBottom(), request.getShoes());
    }
    
}
