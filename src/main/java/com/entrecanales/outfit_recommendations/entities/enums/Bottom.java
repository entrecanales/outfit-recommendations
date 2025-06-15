package com.entrecanales.outfit_recommendations.entities.enums;

public class Bottom {

    //region ENUM

    enum BottomType {
        TROUSERS,
        SWEATPANTS,
        JEANS,
        CHINOS,
        CARGO_PANTS,
        CIRCLE_SKIRT,
        WRAP_SKIRT,
        MINI_SKIRT
    }

    //endregion

    //region Attributes
    
    private BottomType bottomType;

    private ColorsEnum color;

    //endregion

    //region Constructor

    public Bottom() {}

    public Bottom(BottomType t, ColorsEnum c) {
        bottomType = t;
        color = c;
    }

    //endregion

    //region Getters and Setters

    public BottomType getBottomsType() {
        return bottomType;
    }

    public void setBottomsType(BottomType type) {
        this.bottomType = type;
    }

    public ColorsEnum getColor() {
        return color;
    }

    public void setColor(ColorsEnum color) {
        this.color = color;
    }

    //endregion
    
} 
