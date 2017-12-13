import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое чило");
        int q=scanner.nextInt();
        System.out.println("Введите второе число");
        int w =scanner.nextInt();
        int result1 =q/w;
        int result2 =q%w;
        System.out.println(result1+" и "+result2+" в остатке");
    }
}
