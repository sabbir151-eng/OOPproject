package myproject;
import java.util.*;
public class UnboxingDemo {
	public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        int x = a;

        Double b = Double.valueOf(10.5);
        double y = b;

        Character c = Character.valueOf('Z');
        char z = c;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
