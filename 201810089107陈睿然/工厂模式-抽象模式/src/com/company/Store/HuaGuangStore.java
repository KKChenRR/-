package com.company.Store;

import com.company.Hamburger.Hamburger;
import com.company.Hamburger.Cheeseburger;
import com.company.Hamburger.ChickenMcNuggets;
import com.company.Hamburger.Hamburg;
import com.company.IngredientFactory.HamburgerIngredientFactory;
import com.company.IngredientFactory.HuaGuangHamburgerIngredientFactory;


/**
 * 华广商店
 */
public class HuaGuangStore extends HamburgerStore {
    @Override
    protected Hamburger createHamburger(String type) {

        Hamburger hamburger = null;
        HamburgerIngredientFactory ingredientFactory = new HuaGuangHamburgerIngredientFactory();

        if (type.equals("Cheese")) {
            hamburger =new Cheeseburger(ingredientFactory);
            hamburger.setName("芝士汉堡包");
        } else if (type.equals("Chicken")) {
            hamburger =new ChickenMcNuggets(ingredientFactory);
            hamburger.setName("吉士汉堡包");
        } else if (type.equals("Hamburg")) {
            hamburger = new Hamburg(ingredientFactory);
            hamburger.setName("新奥尔良汉堡包");
        }
        return hamburger;
    }
}
