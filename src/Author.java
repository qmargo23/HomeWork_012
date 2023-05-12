public class Author {

    /* 2 - Создайте класс Author, который содержит в себе
     данные об имени и фамилии автора.*/
    private final String name;
    private final String lastName;

    /* 3 Напишите конструкторы для обоих классов, заполняющие все поля.*/
    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    /* 4 Создайте геттеры для всех полей автора и всех полей книги.*/
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    // метод получения Автора Книги...
    public String toString() {
        return getLastName() + "  " + getName();
    }
}
