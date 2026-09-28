package se.iths.christian.Bibliotekshanterare;

public class Bilbiotekshanterare {


    public class Main {

        private static final int MAX_BOOKS = 100;
        private static final int MAX_MEMBERS = 50;

        private static final Library library = new Library(MAX_BOOKS, MAX_MEMBERS);

        public static void main(String[] args) {
            boolean running = true;
            while (running) {
                printMenu();
                int choice = Integer.parseInt(IO.readln("Välj (0-6): "));
                switch (choice) {
                    case 1 -> addBook();
                    case 2 -> addMember();
                    case 3 -> borrowBook();
                    case 4 -> returnBook();
                    case 5 -> searchBooks();
                    case 6 -> showAllBooks();
                    case 0 -> running = false;
                    default -> IO.println("Ogiltigt menyval. Ange en siffra mellan 0 och 6.");
                }
            }
            IO.println("Hej då!");
        }

        private static void printMenu() {origin/main
            IO.println("""
                
        ===== BIBLIOTEK =====
        1. Lägg till bok
        2. Registrera medlem
        3. Låna bok
        4. Lämna tillbaka bok
        5. Sök bok (titel/författare)
        6. Visa alla böcker och status
        0. Avsluta
        """);
        }
    }
}