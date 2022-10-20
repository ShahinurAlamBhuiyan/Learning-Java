 class book {
    String bookName;
    double bookPrice;

    book(String bookName, double bookprice)    {
        this.bookName = bookName;
        this.bookPrice = bookprice;
    }
    void print() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: " + bookPrice);
    }
}