package com.company.Store;

import com.company.HamburgerType.Cheeseburger;
import com.company.HamburgerType.ChickenMcNuggets;
import com.company.HamburgerType.Hamburg;
import com.company.HamburgerType.Hamburger;

public class EnglandHamburgerStore extends HamburgerStore {
    protected Hamburger createHamburger(String type) {
        if (type.equals("Cheese")) {
            return new Cheeseburger();
        } else if (type.equals("Chicken")) {
            return new ChickenMcNuggets();
        } else if (type.equals("Hamburg")) {
            return new Hamburg();
        }else return null;
    }
}
