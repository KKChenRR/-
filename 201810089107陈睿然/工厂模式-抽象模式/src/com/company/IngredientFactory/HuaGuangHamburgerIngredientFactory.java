package com.company.IngredientFactory;

import com.company.Ingredient.Bread.Bread;
import com.company.Ingredient.Bread.WheatBread;
import com.company.Ingredient.Bread.WhiteBread;
import com.company.Ingredient.Cheese.Cheddar;
import com.company.Ingredient.Cheese.Cheese;
import com.company.Ingredient.Cheese.Gruyere;
import com.company.Ingredient.Meat.Chicken;
import com.company.Ingredient.Meat.Meat;
import com.company.Ingredient.Meat.Pork;
import com.company.Ingredient.Sauce.Ketchup;
import com.company.Ingredient.Sauce.Mayonnaise;
import com.company.Ingredient.Sauce.Sauce;

/**
 * 华广工厂
 */

public  class HuaGuangHamburgerIngredientFactory implements HamburgerIngredientFactory{



    @Override
    public Bread CreateBread() {
        return new WheatBread();
    }

    @Override
    public Cheese CreateCheese() {
        return new Cheddar();
    }

    @Override
    public Meat CreateMeat() {
        return new Pork();
    }

    @Override
    public Sauce CreateSauce() {
        return new Mayonnaise();
    }
}
