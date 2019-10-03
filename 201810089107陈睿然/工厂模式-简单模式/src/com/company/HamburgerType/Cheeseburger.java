package com.company.HamburgerType;

/**
 * 芝士汉堡包
 */
public class Cheeseburger extends Hamburger {
    public Cheeseburger(){
        name="Cheese Hamburger";
        bread="White Bread";
        meat="Pork";

        toppings.add("Grated Reggiano Cheese");//上面覆盖的是意大利reggiano高级奶酪
    }
}
