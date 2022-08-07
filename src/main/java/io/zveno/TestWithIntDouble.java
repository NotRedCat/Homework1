package io.zveno;

public class TestWithIntDouble {
    void  MaxIntegerOrDouble(){
        int maxInt = Integer.MAX_VALUE;
        int intForTest= maxInt +1;
        System.out.println(intForTest+" переполнение Integer");
        double maxDouble = Double.MAX_VALUE;
        double doubleForTest = maxDouble * 3;
        System.out.println(doubleForTest+ " переполнение Double");
        }


}
