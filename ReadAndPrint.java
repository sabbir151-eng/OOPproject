package myproject;
import java.util.*;

public class ReadAndPrint {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] elements = new int[5];
	        for (int i = 0; i < elements.length; i++) {
	            elements[i] = scanner.nextInt();
	        }
	        for (int element : elements) {
	            System.out.println(element);
	        }
	    }

}
