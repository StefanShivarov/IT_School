package myonlineshop;

public class test_20 {

    public static void main(String[] args) {

        Book childrenBook = new ChildrenBook(15, "PW press", 1987, 8);
        Book comicBook = new ComicBook(14, "PW press", 1924, "Batman");

        System.out.println(childrenBook.toString());
        System.out.println(comicBook.toString());
    }
}
