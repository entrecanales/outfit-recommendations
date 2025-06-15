package com.entrecanales.outfit_recommendations.entities.enums;

public class Top {

    //region ENUM

    enum TopsType {
        TSHIRT,
        SHIRT,
        BLOUSE,
        CROP_TOP,
        TANK_TOP
    }

    //endregion

    //region Attributes

    private TopsType topType;

    private ColorsEnum color;

    //endregion

    //region Constructor

    public Top() {}
    public Top(TopsType t, ColorsEnum c) {
        topType = t;
        color = c;
    }

    //endregion

    //region Getters and Setters

    public TopsType getTopType() {
        return topType;
    }

    public void setTopType(TopsType topType) {
        this.topType = topType;
    }

    public ColorsEnum getColor() {
        return color;
    }

    public void setColor(ColorsEnum color) {
        this.color = color;
    }

    //endregion

}
