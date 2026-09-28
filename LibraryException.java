package se.iths.christian.Bibliotekshanterare;

/** Affärsfel i biblioteket (t.ex. bok saknas, redan utlånad, arrayen full). */
public class LibraryException extends Exception {

    public LibraryException(String message) {
        super(message);
    }
}
