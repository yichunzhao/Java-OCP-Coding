package AdvancedClassDesign.Overloading;

/**
 * Does a return type plays a role in the overloading?
 * <p>
 * The purpose of overloading is to reuse the method signature. The overloading uses different parameter list to
 * distinguish from each others, nothing else.
 * <p>
 * So, you cannot use a return type as a marker to distinguish another overloading.
 */

public class OverLoadingReturnType {

    double method(int a, double b) {
        return a + b;
    }

    int method(double b, int a) {
        if (b > a) return a;
        return 0;
    }

    public static void main(String[] args) {
        int a = 10;
        double b = 10.1;

        OverLoadingReturnType worker = new OverLoadingReturnType();

        System.out.println("input a,b :" + worker.method(a, b));

        System.out.println("input b,a :" + worker.method(b, a));

    }

}
