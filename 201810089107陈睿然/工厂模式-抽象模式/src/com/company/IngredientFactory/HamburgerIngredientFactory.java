package com.company.IngredientFactory;
import com.company.Ingredient.Bread.Bread;
import com.company.Ingredient.Cheese.Cheese;
import com.company.Ingredient.Meat.Meat;
import com.company.Ingredient.Sauce.Sauce;


/**
 * 工厂抽象类
 */
public interface HamburgerIngredientFactory {
    Bread CreateBread();
    Cheese CreateCheese();
    Meat CreateMeat();
    Sauce CreateSauce();
}
