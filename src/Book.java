import java.util.Objects;

public class Book {
    /* 1 - Создайте класс Book, который содержит в себе данные о названии,
             авторе и годе публикации книги. Типы полей должны быть String,
              Author (его мы создадим в п. 2) и int.*/
    private String bookName;
    private Author author;
    private int year;
    /* 3 Напишите конструкторы для обоих классов, заполняющие все поля.*/
    public Book(String bookName, Author author, int year){
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }
    /* 4 Создайте геттеры для всех полей автора и всех полей книги.*/
    public String getBookName() {
        return this.bookName;
    }
    public int getBookYear() {
        return this.year;
    }
    public Author getAuthor() {
        return this.author;
    }

    /* 5 Создайте сеттер для поля «Год публикации» у книги.*/
    public void setBookYear(int year) {
        this.year = year;
    }
}
