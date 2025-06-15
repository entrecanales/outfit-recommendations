package com.entrecanales.outfit_recommendations.entities.requests;

import com.entrecanales.outfit_recommendations.entities.enums.Bottom;
import com.entrecanales.outfit_recommendations.entities.enums.Shoes;
import com.entrecanales.outfit_recommendations.entities.enums.Top;

public class OutfitRecommendationRequest {

    //region Atributos

    private Top top;
    private Bottom bottom;
    private Shoes shoes;

    //endregion

    //region Getters and Setters

    public Top getTop() {
        return top;
    }

    public void setTop(Top top) {
        this.top = top;
    }

    public Bottom getBottom() {
        return bottom;
    }

    public void setBottom(Bottom bottom) {
        this.bottom = bottom;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    //endregion

}
