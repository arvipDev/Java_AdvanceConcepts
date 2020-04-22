package javacollections;

public class Driver implements Comparable<Driver> {

    private String name;
    private int experience;


    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public int compareTo(Driver o) {
        if (this.experience < o.getExperience()){
            return 1;
        } else if (this.experience > o.getExperience()){
            return -1;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Driver){
            return this.name.equals(((Driver) obj).getName());
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}
