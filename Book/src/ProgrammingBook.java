public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language) {
        this.language = language;
    }

    public ProgrammingBook(String code, String name, int price, String author) {
        super(code, name, price, author);
    }

    @Override
    public double getAMount(){
        return getPrice()*0.9;
    }

    public ProgrammingBook(String code, String name, int price, String author, String language) {
        super(code, name, price, author);
        this.language = language;
    }

    public ProgrammingBook(String code, String name, int price, String author, String language, String framework) {
        super(code, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}