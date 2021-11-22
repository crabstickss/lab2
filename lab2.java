import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
    Scanner num = new Scanner (System.in);
    System.out.println("Введите x:");
    while (!num.hasNextInt()) {
        System.out.println("Ошибка, попробуйте ввести число снова.");
        num.next();
    }
    int x = num.nextInt();
    System.out.println("Введите n:");
    while (!num.hasNextInt()) {
        System.out.println("Ошибка, попробуйте вве сти число снова.");
        num.next();
    }
    int n = num.nextInt();
    int result = 1;
    for(int i = 1; i <= n; i++) result = result * x;
    System.out.println("Результат: " + result);
    }
}
