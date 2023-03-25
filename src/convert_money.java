import java.util.Scanner;

public class convert_money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcom");
        System.out.println("Enter your year of birth");
        int year = scanner .nextInt();
        System.out.println("Your age is : "+ age(year));
    }
    static  int age (int year)
    {
        return 2023 - year ;
    }
}
