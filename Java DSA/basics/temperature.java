package basics;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        Float temp = sc.nextFloat();
        sc.close();
        Float f = temp * (9 / 5) + 32;
        System.out.println("The temperature in Farenheit is: " + f);
    }
}
