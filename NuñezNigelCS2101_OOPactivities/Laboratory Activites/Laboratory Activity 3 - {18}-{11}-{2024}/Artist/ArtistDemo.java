public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Vincent van Gogh", "Dutch", 37, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Jose Rizal", "Filipino", 35, "Writing", WritingStyle.POETRY);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Derek Hough", "American", 39, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}