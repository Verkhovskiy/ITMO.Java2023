package Task02;

public class Book {
    private String name;
    private String author;
    private Publisher publisher;
    private Integer yearPublished;
    private Integer pages;
    private Boolean inStock;

    // CONSTRUCTORS
    public Book() {
    }
    public Book(String name, String author, Publisher publisher, Integer yearPublished, Integer pages, Boolean inStock) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.pages = pages;
        this.inStock = inStock;
    }

    // GETTERS
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public Integer getYearPublished() {
        return yearPublished;
    }
    public Integer getPages() {
        return pages;
    }
    public Boolean getInStock() {
        return inStock;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public void setYearPublished(Integer year) {
        this.yearPublished = year;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }
}
