package com.company.HamburgerType;

/**
 * 吉士汉堡包
 */
public class ChickenMcNuggets extends Hamburger {
    public ChickenMcNuggets(){
        name="ChickenMcNuggets";
        bread="Wheat Bread";
        meat="Chicken";

        toppings.add("Shredded American Chicken");//上面覆盖的是意大利reggiano高级奶酪
    }
}
