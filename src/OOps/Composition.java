class Book {
    Chapter chapter = new Chapter();
}
class Chapter {
    String title;
    String content;
}

class Composition {
    Book myBook = new Book();
    myBook.chapter.title = "Java Programming";
    myBook.chapter.content = "This chapter covers the basics of Java programming.";

    System.out.println("Reading Chapter: " + myBook.chapter.title);
    System.out.println("Content: " + myBook.chapter.content);
}