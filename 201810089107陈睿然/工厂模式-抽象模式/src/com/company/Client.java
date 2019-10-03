package com.company;

import com.company.Store.HamburgerStore;
import com.company.Store.HuaGuangStore;
import com.company.Store.TsingHuaStrore;
import java.util.Scanner;

/**
 * 客户服务（main）
 */

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入商店名");
        String storeName =sc.nextLine();
        if(storeName.equals("Tsinghua")){
            HamburgerStore TsinghuaStore = new TsingHuaStrore();
            System.out.println("请输入你要买的汉堡");
            String hamburgeName=sc.nextLine();
            TsinghuaStore.orderHamburger(hamburgeName);
        }
        else if(storeName.equals("HuaGuang")){
            HamburgerStore HuaGuangStore = new HuaGuangStore();
            System.out.println("请输入你要买的汉堡");
            String hamburgeName=sc.nextLine();
            HuaGuangStore.orderHamburger(hamburgeName);
        }
    }
}
