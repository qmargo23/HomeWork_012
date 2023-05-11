public class Author {
    /* 2 - Создайте класс Author, который содержит в себе
     данные об имени и фамилии автора.*/
    private String name;
    private String lastName;

    /* 3 Напишите конструкторы для обоих классов, заполняющие все поля.*/
    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    /* 4 Создайте геттеры для всех полей автора и всех полей книги.*/
    public String getAuthorName() {
        return this.name;
    }
    public String getAuthorLastName() {
        return this.lastName;
    }
    // метод получения Автора Книги...
    public String getWriter() {
        return (getAuthorLastName() + "  " + getAuthorName());
    }
}
