import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcAverage calc = new CalcAverage();
        System.out.println("Sayı Girişi Yapınız : ");
        System.out.println(calc.average(scanner.nextInt()));
    }
}