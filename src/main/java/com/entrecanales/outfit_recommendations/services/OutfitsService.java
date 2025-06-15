package com.entrecanales.outfit_recommendations.services;

import org.springframework.stereotype.Service;

import com.entrecanales.outfit_recommendations.entities.enums.Bottom;
import com.entrecanales.outfit_recommendations.entities.enums.Shoes;
import com.entrecanales.outfit_recommendations.entities.enums.Top;

@Service
public class OutfitsService {
    
    private final AIService aiService;

    public OutfitsService(AIService aiService) {
        this.aiService = aiService;
    }

    public String GetRecommendation(Top top, Bottom bottom, Shoes shoes) {
        String topPrompt = top != null ? "- A %s %s".formatted(top.getColor(), top.getTopType()) : "";
        String bottomPrompt = bottom != null ? "- %s %s".formatted(bottom.getColor(), bottom.getBottomsType()) : "";
        String shoesPrompt = shoes != null ? "- %s %s".formatted(shoes.getColor(), shoes.getShoeType()) : "";
        String prompt = """
                Given:
                %s
                %s
                %s
                Give me a type of clothing and color for the remaining top, bottom or shoe whatever it's missing. And just show it this way (don't say anything else):
                - Top: Green T-Shirt
                - Bottoms: Brown Cargo Pants
                - Shoes: White Sneakers
                """.formatted(topPrompt, bottomPrompt, shoesPrompt);

        return aiService.chat(prompt);
    }
}
