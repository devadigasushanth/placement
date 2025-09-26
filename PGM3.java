import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.Scanner;

public class PGM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unit: ");

        int b1 = sc.nextInt();
        System.out.println("Your unit is "+b1);
        if (b1 <= 100) {
            int res = b1 * 5;
            System.out.println("the total bill is " + res);
        } else if (b1<=200) {
            int res = (100*5)+(b1-200)*7;
            System.out.println("total bill is "+res);
        }
        else{
            int res=(100*5)+(100*7)+(b1-200)*10;
            System.out.println("Total bill is "+res);
        }
    }
}