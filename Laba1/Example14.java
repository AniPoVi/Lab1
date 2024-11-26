package Laba1;

import java.util.Scanner;

public class Example14
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите число");
        int E = in.nextInt();
        int W = E+1;
        int R = E-1;
        System.out.println(""+E+", "+W+", "+E+", "+R+"");
        in.close();
    }
}
