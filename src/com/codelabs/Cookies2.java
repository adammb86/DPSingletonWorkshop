package com.codelabs;

/**
 * Created by adammb on 7/21/16.
 */
public class Cookies2 {
    //atribut
    private static Cookies2 cookies2;

    static{
        try{
            cookies2=new Cookies2();
        }catch(RuntimeException e){
            throw new RuntimeException("Errornya tuh: "+e);
        }
    }

    //method
    private Cookies2(){
        System.out.println("Hai saya cookies2.");
    }

    public static Cookies2 getCookies2(){
        return cookies2;
    }

    public void lakukanSesuatu(){
        System.out.println("Cookies2 saya bundar.");
    }
}
