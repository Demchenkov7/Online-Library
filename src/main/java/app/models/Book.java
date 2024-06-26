package app.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Book {
    private int id;
    @NotEmpty(message = "Назавние не может быть пустым")
    private String title;
    @NotEmpty(message = "Автор не должен быть пустым")
    private String author;

    @Min(value = 1500, message = "Год выпуска книги должен быть после 1500")
    @Max(value = 2024, message = "Год выпуска книги должен быть меньше 2024")
    private int year;

    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
