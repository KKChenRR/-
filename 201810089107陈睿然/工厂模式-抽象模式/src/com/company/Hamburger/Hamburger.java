package com.company.Hamburger;

import com.company.Ingredient.Bread.Bread;
import com.company.Ingredient.Cheese.Cheese;
import com.company.Ingredient.Meat.Meat;
import com.company.Ingredient.Sauce.Sauce;

/**
 * 汉堡抽象类
 */
public abstract class Hamburger {
    /*
    用protected访问控制符其访问权限
    声明为protected的方法和成员变量能被同一个包里的所有类所访问
     */
    protected String name;//名字
    protected Bread bread;//面包种类
    protected Cheese cheese;//芝士种类
    protected Meat meat;//肉种类
    protected Sauce sauce;//酱种类
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");

    }


    public void compose(){
        System.out.println("Composing the hamburger");
    }

    public void box(){
        System.out.println("Place hamburger in official HamburgerStore box");
        System.out.println();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return null;
    }
}
