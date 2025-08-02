package myproject;
import java.util.*;

public class StaticValuesPrinter {
	static int[] values = {10, 20, 30, 40, 50};

    public static void main(String[] args) {
        for (int value : values) {
            System.out.println(value);
        }
    }

}
