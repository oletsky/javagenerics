package javatraining.oletsky.generics;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Demonstrates covariance of generics and type substitutions
 */

public class GenericCovariance {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.set(2,"zzz");
        System.out.println("List is: ");
        System.out.println(list);
        // ArrayList<Object> ol = list; //Impossible

        //Subtype substitutions - for getters
        ArrayList<? extends Object> objList= list;
        //objList.set(0,"new"); //Impossible
        String s = (String) objList.get(0);
        System.out.println(s);

        //Supertype substitutions - for setters
        ArrayList<? super String> strList = list;
        // String s1 = strList.get(0); //Impossible
        strList.set(0,"qqqq");

        System.out.println("New list is: ");
        System.out.println(list);
    }

}


