import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Имя: ");
        String I = in.nextLine();
        System.out.println("Укажите ваш год рождения: ");
        int E = in.nextInt();
        int R = 2024-E;
        System.out.println(" "+I+" вам "+R+" года");
        in.close();
    }
}