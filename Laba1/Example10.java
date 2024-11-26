import java.util.Scanner;
public class Example10
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите ваш год рождения: ");
        int E = in.nextInt();
        int R = 2024-E;
        System.out.println("Вам: "+R+" года");
        in.close();
    }
}
