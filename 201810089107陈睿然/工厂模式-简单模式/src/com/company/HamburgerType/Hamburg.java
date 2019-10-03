package com.company.HamburgerType;

/**
 * 新奥尔良汉堡包
 */
public class Hamburg extends Hamburger {
    public Hamburg(){
        name="Hamburg";
        bread="White Bread";
        meat="Chicken";

        toppings.add("New Orleans Chicken");//上面覆盖的是意大利reggiano高级奶酪
    }
}
