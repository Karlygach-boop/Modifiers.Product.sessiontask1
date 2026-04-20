import java.time.LocalDate;

public class Book extends Product{
    private String authorFullName;

    public Book(String name, String description, int price, LocalDate createDate, String type,
                int productCount, String authorFullName) {
        super(name, description, price, createDate, type, productCount);
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }


}
