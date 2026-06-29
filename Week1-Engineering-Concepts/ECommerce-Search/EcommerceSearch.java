import java.util.Scanner;

public class EcommerceSearch {

    public static void main(String[] args) {

        String[] products = {
                "Laptop",
                "Phone",
                "Watch",
                "Shoes",
                "Tablet"
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product to search:");
        String searchItem = sc.nextLine();

        boolean found = false;

        for (String product : products) {

            if (product.equalsIgnoreCase(searchItem)) {

                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchItem + " is available in the store.");
        } else {
            System.out.println(searchItem + " is not available.");
        }

        sc.close();
    }
}