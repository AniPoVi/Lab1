package Laba1;

import java.util.Scanner;

public class Example13
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите первое число");
        int E = in.nextInt();
        System.out.println("Укажите второе число");
        int W = in.nextInt();
        int R = E + W;
        System.out.println(""+E+"+"+W+"="+R+"");
        in.close();
    }
}
