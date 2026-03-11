import java.lang.Math;

public class JavaLangMath {
    public static void main(String[] args) {
        float a = 9, b = 8;

        System.out.println("Maximum number of a and b = " + Math.max(a, b));
        System.out.println("Square root of a = " + Math.sqrt(a));
        System.out.println("Power of a and b = " + Math.pow(a, b));
        System.out.println("log of a = " + Math.log(a));
        System.out.println("log10 of a = " + Math.log10(a));
        System.out.println("log10 of b = " + Math.log10(b));
        System.out.println("log1p of a = " + Math.log1p(a));
        System.out.println("exp of a = " + Math.exp(a));
        System.out.println("expm1 of a = " + Math.expm1(a));
    }
}