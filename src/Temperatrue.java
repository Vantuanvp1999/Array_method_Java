import java.util.Scanner;

public class Temperatrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("menu");
            System.out.println("1. celsius to fahrenheit");
            System.out.println("2. fahrenheit to celsius");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter the temperature in celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Temperature in Fahrenheit: "+celsiusToFarenheit(celsius));
                    break;
                }
                case 2:{
                    System.out.println("Enter the temperature in fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Temperature in celsius: "+fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 0:{
                    System.exit(0);
                }

            }
        }while(choice != 0);
    }
    public static double celsiusToFarenheit(double celsius) {
        double fahrenheit= (celsius * 9/5) + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32)*5/9;
        return celsius;
    }
}
