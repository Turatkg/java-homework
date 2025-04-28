import java.util.Scanner;

public class WeatherClothes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Температураны киргизиңиз: ");
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("Аба ысык. Жеңил кийим кийиниңиз.");
        } else if (temperature >= 0 && temperature <= 30) {
            System.out.println("Кадимки кийим кийиниңиз.");
        } else {
            System.out.println("Аба суук. Жылуу кийим кийиниңиз.");
        }

        scanner.close();
    }
}
