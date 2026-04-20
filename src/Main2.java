import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    static Scanner scanner = new Scanner(System.in);
    static User user = null;
    static Product[] products = null;

    static void main() {
        Electronics e1 = new Electronics("Samsung", "Laptop",
                50000, LocalDate.of(2025, 07, 01), "i5", 4, "SamsungBrand",
                "Black", true, 256);
        Electronics e2 = new Electronics("Iphone", "Smartphone",
                1000, LocalDate.of(2023, 12, 01), "15 pro max", 5, "Apple",
                "White", true, 512);
        Electronics e3 = new Electronics("LG", "Washing mashine",
                30000, LocalDate.of(2024, 02, 25), "lg333", 6, "LGBrand",
                "Grey", true, 7);

        Book b1 = new Book("Harry Potter", "Fantasy", 1500, LocalDate.of(2005, 10, 22),
                "Book", 7, "Joanne Kathleen Rowling");
        Book b2 = new Book("The Lord of the Ring", "Fantasy", 2500,
                LocalDate.of(2004, 7, 17),
                "Book", 8, "J.R.R.Tolkien");
        Book b3 = new Book("Первый учитель", "Повесть", 2000,
                LocalDate.of(1962, 11, 9),
                "Book", 9, "Чингиз Айтматов");
        products = new Product[]{e1, e2, e3, b1, b2, b3};

        while (true) {
            System.out.println("1-Register");
            System.out.println("2-Login");
            System.out.println("3-Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("First Name: ");
                    String firstName = scanner.next();
                    System.out.println("Last Name: ");
                    String lastName = scanner.next();
                    System.out.print("Email: ");
                    String email = scanner.next();
                    System.out.println("Password: ");
                    String password = scanner.next();
                    user = new User(firstName, lastName, email, password);
                    System.out.println("To enter the system try to login");
                    break;
                case 2:
                    if(user == null){
                        System.out.println("Register firstly!");
                        break;
                    }
                    System.out.println("Enter your credentials");
                    System.out.println("Enter your email: ");
                    String email1 = scanner.next();
                    System.out.println("Enter password:");
                    String password1 = scanner.next();
                    if (email1.equalsIgnoreCase(user.getEmail()) && password1.equalsIgnoreCase(user.getPassword())) {
                        System.out.println("You successfully logined");
                        while (true) {
                            System.out.println("1. Buy product");
                            System.out.println("2. Look at the products in a MALL");
                            System.out.println("3. Look at all Electronics only");
                            System.out.println("4. Loot at all Books only");
                            System.out.println("5. Exit");

                            int choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1: {
                                    for (int i = 0; i < products.length; i++) {
                                        System.out.println(i + ". " + products[i].getName());
                                        System.out.println("Price:" + products[i].getPrice());
                                        System.out.println("Created Date:" + products[i].getCreateDate());
                                        System.out.println("________________________");
                                    }
                                    System.out.println("Enter which product you want to buy:");
                                    int productChoice = scanner.nextInt();
                                    user.buyProduct(products[productChoice]);
                                    System.out.println("You successfully bought the product!");
                                    break;
                                }
                                case 2:
                                    for (int i = 0; i < products.length; i++) {
                                        System.out.println(i + ". " + products[i].getName());
                                        System.out.println("Price:" + products[i].getPrice());
                                        System.out.println("Created Date:" + products[i].getCreateDate());
                                        System.out.println("________________________");
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < products.length; i++) {
                                        if (products[i] instanceof Electronics) {
                                            System.out.println("Name:" + products[i].getName());
                                            System.out.println("Brand:" + ((Electronics) products[i]).getBrand());
                                            System.out.println("Price:" + products[i].getPrice());
                                            System.out.println("______________");

                                        }
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < products.length; i++) {
                                        if (products[i] instanceof Book) {
                                            System.out.println("Name:" + products[i].getName());
                                            System.out.println("Brand:" + ((Book) products[i]).getAuthorFullName());
                                            System.out.println("Price:" + products[i].getPrice());
                                            System.out.println("______________");

                                        }
                                    }
                                    break;
                                case 5:
                                    System.exit(0);
                            }
                        }
                    }else{
                        System.out.println("Wrong Credentials! Try Again!");
                    }

                    break;
                case 3:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}
