import java.util.Arrays;

class Book {
    private String title;
    private int pubYear; // publication year
    private String[] authors;

    private static int count;

    Book() {
        this("TBD");
    }

    Book(String title) {
        this(title, -1);
    }

    Book(String title, int pubYear) {
        this(title, pubYear, "");
    }

    Book(String title, int pubYear, String author) {
        this(title, pubYear, new String[] { author });
    }

    Book(String title, int pubYear, String[] authors) {
        setTitle(title);
        setPubYear(pubYear);
        setAuthors(authors);
        ++count;
    }

    public static boolean bringToFront(Book[] shelf, Book b) {
        int location = -1;
        for(int i = 0; i < shelf.length; i++) {
            if(shelf[i] == b) {
                location = i;
                break;
            }
        }
        if(location == -1) {
            return false; //ERROR
        }
        
        Book temp = shelf[0];
        shelf[0] = b;
        shelf[location] = temp;

        return true;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", pubYear=" + pubYear + ", authors=" + Arrays.toString(authors) + "]";
    }

    String getTitle() {
        return title;
    }

    int getPubYear() {
        return pubYear;
    }

    String getAuthor() {
        return authors[0];
    }

    String[] getAuthors() {
        return authors;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    void setAuthor(String author) {
        setAuthors(new String[] { author });
    }

    void setAuthors(String[] authors) {
        this.authors = authors;
    }

    static void showCount() {
        System.out.println("count = " + count);
    }
}
