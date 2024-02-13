public class Book {
    private String bookName;
    private String yazar;

    public Book(String bookName,String yazar){
        this.bookName=bookName;
        this.yazar=yazar;
    }

    public String getBookName() {
        return bookName;
    }

    public String getYazar() {
        return yazar;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }
}
