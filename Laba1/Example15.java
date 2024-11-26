package Laba1;

import java.util.Scanner;

public class Example15
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите 1-е число");
        int E = in.nextInt();
        System.out.println("Укажите 2-е число");
        int D = in.nextInt();
        int W = E+D;
        int R = E-D;
        System.out.println(""+E+"+"+D+"="+W+", "+E+"-"+D+"="+R+"");
        in.close();
    }
}
