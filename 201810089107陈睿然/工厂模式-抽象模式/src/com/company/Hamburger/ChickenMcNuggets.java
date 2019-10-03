package com.company.Hamburger;
import com.company.IngredientFactory.HamburgerIngredientFactory;


/**
 * 吉士汉堡包
 */
public class ChickenMcNuggets extends Hamburger {
    HamburgerIngredientFactory ingredientFactory;

    public ChickenMcNuggets(HamburgerIngredientFactory ingredientFactory){
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
