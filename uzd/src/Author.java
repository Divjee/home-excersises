import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Author { //Divje
    String name;
    String lastName;
    LocalDate dateOfBirth;

    static final int BOOKS_IN_THE_WORLD = 129864880;

    ArrayList<String> books = new ArrayList<>();

    public Author(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getAge() {
        long l = 2022L - this.dateOfBirth.getYear();
        return l;
    }

    public boolean hasWrittenBook(String bookis) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(bookis)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public String getFullName() {
        String a = this.name + " " + this.lastName;
        return a;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public String info(){
        String[] a = {this.name,this.lastName, String.valueOf(this.dateOfBirth), String.valueOf(books)};

       return Arrays.toString(a);

    }

    public void printAllInfo(){
        long l = 2022L - this.dateOfBirth.getYear();
        System.out.println("Author "+ this.name +" "+this.lastName);
        System.out.println("His age is " + l + " at the moment");
        System.out.println("He has written " + books.size() + " books");
    }
}
