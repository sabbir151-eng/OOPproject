package myproject;
import java.util.*;

public class BoxingDemo {
	 public static void main(String[] args) {
	        int a = 10;
	        Integer boxedA = Integer.valueOf(a);

	        char c = 'X';
	        Character boxedC = Character.valueOf(c);

	        double d = 5.5;
	        Double boxedD = Double.valueOf(d);

	        System.out.println(boxedA);
	        System.out.println(boxedC);
	        System.out.println(boxedD);
	    }
}
