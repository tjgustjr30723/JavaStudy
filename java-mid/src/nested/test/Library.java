package nested.test;

import java.awt.print.Book;

public class Library {
    private int count = 0;
    private Book[] books;
    Library (int quantity) {
        this.books = new Book[quantity];
    }
    public void addBook(String title, String author) {
        if (count < books.length) {
            books[count] = new Book(title, author);
            count++;
        }
        else System.out.println("도서관 저장 공간이 부족합니다.");
    }
    public void showBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println("도서 제목: "+books[i].title+ ", 저자: " + books[i].getAuthor());
        }
    }

     private class Book {
        private String title;
        private String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
    }
}
