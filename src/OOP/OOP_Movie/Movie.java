package OOP.OOP_Movie;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instancetype = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instancetype + " film");
    }
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'M' -> new Adventure(title);
            case 'P' -> new Adventure(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}