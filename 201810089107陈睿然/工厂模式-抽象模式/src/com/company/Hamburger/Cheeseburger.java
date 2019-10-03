package com.company.Hamburger;

import com.company.Ingredient.Bread.Bread;
import com.company.Ingredient.Bread.WhiteBread;
import com.company.Ingredient.Cheese.Cheddar;
import com.company.Ingredient.Cheese.Cheese;
import com.company.Ingredient.Meat.Chicken;
import com.company.Ingredient.Meat.Meat;
import com.company.Ingredient.Sauce.Ketchup;
import com.company.Ingredient.Sauce.Sauce;
import com.company.IngredientFactory.HamburgerIngredientFactory;

/**
 * 芝士汉堡
 */

public class Cheeseburger extends Hamburger {
    //原材料是由工厂制作
    HamburgerIngredientFactory ingredientFactory;

    public Cheeseburger(HamburgerIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }
    @Override
    public void prepare(){
        System.out.println("Preparing "+name);
        bread = ingredientFactory.CreateBread();
        cheese = ingredientFactory.CreateCheese();
        meat = ingredientFactory.CreateMeat();
        sauce = ingredientFactory.CreateSauce();
    }

}
