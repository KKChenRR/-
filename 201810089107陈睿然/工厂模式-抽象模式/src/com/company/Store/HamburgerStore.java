package com.company.Store;

import com.company.Hamburger.Hamburger;

/**
 * 汉堡店抽象类
 */
public abstract class HamburgerStore {


    public Hamburger orderHamburger(String type){
       Hamburger hamburger;

       hamburger = createHamburger(type);

       hamburger.prepare();
       hamburger.bake();
       hamburger.compose();
       hamburger.box();

       return hamburger;
   }

   protected abstract Hamburger createHamburger(String type);
}
