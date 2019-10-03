package com.company;

import com.company.HamburgerType.Hamburger;
import com.company.Store.EnglandHamburgerStore;
import com.company.Store.HamburgerStore;
import com.company.Store.HuaGuangHamburgerStore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HamburgerStore huaguangStore=new HuaGuangHamburgerStore();
        HamburgerStore englandStore =new EnglandHamburgerStore();

        Hamburger hamburger = huaguangStore.orderHamburger("Cheese");
        System.out.println("Crr ordered a "+hamburger.getName()+"\n");

        hamburger = englandStore.orderHamburger("Chicken");
        System.out.println("Oc ordered a "+hamburger.getName()+"\n");

    }
}
