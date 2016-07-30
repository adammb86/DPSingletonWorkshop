package com.codelabs;

import java.util.ArrayList;

public class CookiesDemo {

    public static void main(String[] args) {
	// write your code here
        Cookies cookies=Cookies.getCookies();
        //perintah ini akan mendapatkan objek yang sama
        Cookies cookies2=Cookies.getCookies();

        //dua perintah ini sama
        cookies.lakukanSesuatu();
        cookies2.lakukanSesuatu();

        //pakai try-catch
        ArrayList<Cookies2> x=new ArrayList<Cookies2>();
    }
}
