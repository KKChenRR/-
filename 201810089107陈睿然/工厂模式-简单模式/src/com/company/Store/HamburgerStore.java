package com.company.Store;

import com.company.HamburgerType.Hamburger;
import com.company.SimpleHamburgerFactory;

/**
 * 简单汉堡工厂
 */
public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type){
        Hamburger hamburger;

        hamburger=createHamburger(type);

        hamburger.prepare();
        hamburger.bake();
        hamburger.compose();
        hamburger.box();
        return hamburger;
    }
    protected abstract Hamburger createHamburger(String type);
}
