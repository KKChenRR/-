package com.company.IngredientFactory;


import com.company.Ingredient.Bread.Bread;
import com.company.Ingredient.Bread.WhiteBread;
import com.company.Ingredient.Cheese.Cheese;
import com.company.Ingredient.Cheese.Gruyere;
import com.company.Ingredient.Meat.Chicken;
import com.company.Ingredient.Meat.Meat;
import com.company.Ingredient.Sauce.Ketchup;
import com.company.Ingredient.Sauce.Sauce;

public class TsingHuaIngredientFactory implements HamburgerIngredientFactory {

    @Override
    public Bread CreateBread() {
        return new WhiteBread();
    }

    @Override
    public Cheese CreateCheese() {
        return new Gruyere();
    }

    @Override
    public Meat CreateMeat() {
        return new Chicken();
    }

    @Override
    public Sauce CreateSauce() {
        return new Ketchup();
    }

}
