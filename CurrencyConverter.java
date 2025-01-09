import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double exchangeRateUSDToRupee = 83.47;
        double exchangeRateRupeeToUSD = 0.0119804;
        double exchangeRateEuroToRupee = 89.10;
        double exchangeRateRupeeToEuro = 0.0113;

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Select the conversion you want to perform:");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        double amount, result;
        
        switch (choice) {
            case 1:
                System.out.print("Enter the amount in USD: ");
                amount = scanner.nextDouble();
                result = amount * exchangeRateUSDToRupee;
                System.out.println("Converted amount in Rupee: " + result);
                break;
            case 2:
                System.out.print("Enter the amount in Rupee: ");
                amount = scanner.nextDouble();
                result = amount * exchangeRateRupeeToUSD;
                System.out.println("Converted amount in USD: " + result);
                break;
            case 3:
                System.out.print("Enter the amount in Euro: ");
                amount = scanner.nextDouble();
                result = amount * exchangeRateEuroToRupee;
                System.out.println("Converted amount in Rupee: " + result);
                break;
            case 4:
                System.out.print("Enter the amount in Rupee: ");
                amount = scanner.nextDouble();
                result = amount * exchangeRateRupeeToEuro;
                System.out.println("Converted amount in Euro: " + result);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option (1/2/3/4).");
        }

        scanner.close();
    }
}
