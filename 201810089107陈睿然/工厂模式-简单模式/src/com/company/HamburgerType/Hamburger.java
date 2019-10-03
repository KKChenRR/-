package com.company.HamburgerType;

import java.util.ArrayList;

/**
 * 从一个抽象汉堡开始，所有的具体汉堡都需要派生自这个类
 */
public abstract class Hamburger {
    //每个汉堡都具有名称、面包类型、肉类型
    String name;
    String bread;
    String meat;
    ArrayList toppings = new ArrayList();


    //此抽象类提供了默认的基本做法，用来进行烘烤、组合、装盒
    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing bread...");
        System.out.println("Adding meat...");
        System.out.println("Adding toppings: ");
        for(int i=0;i<toppings.size();i++){
            System.out.println("   "+toppings.get(i));
        }
    }


    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }


    public void compose(){
        System.out.println("Composing the hamburger");
    }


    public void box(){
        System.out.println("Place hamburger in official HamburgerStore box");
    }

    public String getName(){
        return name;
    }
}
