import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите месяц: ");
        String F = in.nextLine();
        System.out.println("Укажите сколько в нем дней: ");
        int E = in.nextInt();
        System.out.println("В "+ F +" "+E+" дней");
        in.close();
    }
}