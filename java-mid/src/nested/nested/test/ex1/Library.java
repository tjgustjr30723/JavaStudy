package nested.nested.test.ex1;

public class Library {
    private int book;
    Book[] storge;
    int count = 0;
    public Library(int book) {
        this.book = book;
        this.storge = new Book[book];
    }
    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
    public void addBook(String title, String author) {
        if (count == book) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
        else {
            storge[count] = new Book(title, author);
            count++;
        }
    }
    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " +storge[i].title+", 저자: " +storge[i].author);
        }
    }
}
