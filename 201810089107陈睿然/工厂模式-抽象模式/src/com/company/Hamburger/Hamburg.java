package com.company.Hamburger;
import com.company.IngredientFactory.HamburgerIngredientFactory;

/**
 * 新奥尔良汉堡包
 */
public class Hamburg extends Hamburger {
    HamburgerIngredientFactory ingredientFactory;

    public Hamburg(HamburgerIngredientFactory ingredientFactory){
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
