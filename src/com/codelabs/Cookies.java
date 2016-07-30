package com.codelabs;

/**
 * Created by adammb on 7/21/16.
 */
public class Cookies {
    //atribut
    private static Cookies cookies;

    //method
    //konstruktor
    private Cookies(){
        System.out.println("Hai, saya cookies.");
    }

    //ini hook
    public static synchronized Cookies getCookies(){
        if(cookies==null){
            cookies=new Cookies();
        }

        return cookies;
    }

    public void lakukanSesuatu(){
        System.out.println("Cookies ini bundar.");
    }
}
