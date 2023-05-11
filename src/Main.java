public class Main {
    /* 1 - Создайте класс Book, который содержит в себе данные о названии,
     авторе и годе публикации книги. Типы полей должны быть String,
     Author (его мы создадим в п. 2) и int.*/
    public static void main(String[] args) {
        System.out.println("Библиотечный справочник");
        /* 6 В методе main создайте несколько объектов «Книга» (достаточно двух)
        и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
        Учтите, что авторы являются обязательными и книги не могут создаваться
        без авторов.
        Метод main не должен находиться в классах Book и Author.*/
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book pushkin_01 = new Book("Руслан и Людмила",1918);// например неправильно указан год
        Book tolstoy_01 = new Book("Отрочество", 1852);

        System.out.println("Автор книги " + pushkin.getWriter());
        System.out.println("Название книги - " + pushkin_01.getBookName());
        System.out.println("Год выпуска книги - " + pushkin_01.getBookYear());
        /*7 В том же методе main измените год публикации одной из книг с помощью сеттера.*/
        pushkin_01.setBookYear(1818);
        System.out.println("изменили Год выпуска книги на - " + pushkin_01.getBookYear());
    }
}