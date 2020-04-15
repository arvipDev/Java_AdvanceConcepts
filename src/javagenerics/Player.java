package javagenerics;

public abstract class Player {
    private String name;
    private int jerseyNumber;
    private int age;

    public Player(String name, int jerseyNumber, int age) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
