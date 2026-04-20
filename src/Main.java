
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    User [] users = new User[100];

    Product p1 = new Product("Белая река", "молоко", 60,
            LocalDate.of(2026, 04, 10), "Жирное", 1);
    Product p2 = new Product("Paper", "Бумаги А4", 500,
            LocalDate.of(2026, 01, 15), "Белое", 2);
    Product p3 = new Product("АААА", "Чай", 50,
            LocalDate.of(2026, 02, 01), "красное", 3);

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


    while (true) {
        System.out.println("1-Redister");
        System.out.println("2-Login");
        System.out.println("3-Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                register();
                break;
            case 2:
                login();
                break;
            case 3:
                System.out.println("Exit!");
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}

public static void register() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ID: " + Product.getIdcount());
    System.out.print("First Name: ");
    String firstName = scanner.nextLine();
    System.out.println("Last Name: ");
    String lastName = scanner.nextLine();
    System.out.print("Email: ");
    String email = scanner.nextLine();
    System.out.println("Password: ");
    String password = scanner.nextLine();

   // User [] user1 = new User[100];
    


}





