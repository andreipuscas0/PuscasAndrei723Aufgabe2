package Model;

public class Spieler {
    private String name;
    private int age;
    private String position;
    public int marktwert;

    public Spieler(String name, int age, String position, int marktwert) {
        this.name = name;
        this.age = (int) age;
        this.position = position;
        this.marktwert = (int) marktwert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getMarktwert() {
        return marktwert;
    }

    public void setMarktwert(int marktwert) {
        this.marktwert = marktwert;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', age=" + age + ", position'" + position + "', marktwert=" + marktwert + "''}";
    }
}
