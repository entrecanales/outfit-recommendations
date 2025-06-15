package com.entrecanales.outfit_recommendations.entities.enums;

public class Shoes {

    //region ENUM

    enum ShoeType {
        SNEAKERS,
        BOOTS,
        TABIS,
        LOAFERS,
        DRESS_SHOES,
        HEELS
    }

    //endregion

    //region Attributes

    private ShoeType shoeType;

    private ColorsEnum color;

    //endregion

    //region Constructor

    public Shoes() {}

    public Shoes(ShoeType t, ColorsEnum c) {
        shoeType = t;
        color = c;
    }

    //endregion

    //region Getters and Setters

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType type) {
        this.shoeType = type;
    }

    public ColorsEnum getColor() {
        return color;
    }

    public void setColor(ColorsEnum color) {
        this.color = color;
    }

    //endregion

}
