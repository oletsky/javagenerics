package javatraining.oletsky.generics;

import java.util.ArrayList;
import java.util.HashSet;

public class RawAssignmentTrick {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<Integer>();
        intSet.add(10);
        HashSet hackSet = intSet;
        HashSet<String> strSet = hackSet;
        strSet.add("10");
        strSet.add("Not An Integer");
        System.out.println(intSet);
        //[Not An Integer, 10, 10]
        //Order may be different
    }
}
