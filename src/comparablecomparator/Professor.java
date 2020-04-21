package comparablecomparator;

public class Professor implements Comparable<Professor> {

    private String name;
    private int id;
    private int rank;

    public Professor(String name, int id, int rank) {
        this.name = name;
        this.id = id;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Professor o) {
        return 0;
    }
}
