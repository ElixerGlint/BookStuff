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

        
    }
}
