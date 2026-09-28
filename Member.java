package se.iths.christian.Bibliotekshanterare;

/**
 En medlem i biblioteket. Modelleras som en record eftersom olika datatyper kan lagras.
 */
public record Member(int id, String name) {

    public Member {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Medlemmens namn får inte vara tomt.");
        }
        name = name.trim();
    }
}
