package javagenerics;

public class FootballPlayer extends Player {

    private String name;
    private int jerseyNumber;
    private int age;

    public FootballPlayer(String name, int jerseyNumber, int age) {
        super(name, jerseyNumber, age);
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public int getAge() {
        return age;
    }
}
