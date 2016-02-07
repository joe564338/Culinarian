package com.packages.joe.culinarian;

/**
 * Created by Joe on 2/4/2016.
 */
public class FoodItem {
    String fileName;
    String foodName;
    public FoodItem(String fileName, String foodName){
        this.fileName = fileName;
        this.foodName = foodName;
    }
    public String getFoodName(){
        return foodName;
    }
    public String getFileName(){
        return fileName;
    }

}
