public class adriver {
    public static void main(String[] args) throws Exception {
        String[] titles = { "Rainbow Six", "Diary of Wimpy Kid", "One of us is lying", "Nyxia", "hitchhikers guide" };
        Book[] shelf = new Book[10];
        for (int i = 0; i < titles.length; i++) {
            if (i < shelf.length) {
                shelf[i] = new Book(titles[i]);
            }
        }

        shelf[2].setAuthors(new String[] { "Karen", "Leelah" });
        System.out.println(shelf[2].getAuthors()[1]); //gets the second authors name

        

        for(Book book:shelf) {
            System.err.println(book);
        }

        bringToFront(shelf,shelf[4]);
        System.out.println("CHANGE");
        for(Book book:shelf) {
            System.err.println(book);
        }
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
}
