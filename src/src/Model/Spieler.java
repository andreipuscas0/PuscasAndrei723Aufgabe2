package Model;

public class Spieler {
    private String name;
    private int age;
    private String position;
    public int marktwert;

    public Spieler(String name, int age, String position, int marktwert) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.marktwert = marktwert;
    }
}
