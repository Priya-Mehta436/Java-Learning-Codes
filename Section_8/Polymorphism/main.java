package Section_8.Polymorphism;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Movie theMovie = Movie.getMovie("Adventure", "Stars Wars");
        // theMovie.watchMovie();

    
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
