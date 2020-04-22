package javacollections;

public class Car implements Comparable<Car>{

    private String name;
    private int model;


    public Car(String name, int model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){
            return (this.name.equals(((Car) obj).getName()) && this.model == ((Car) obj).getModel());
        }
        return false;
    }

    @Override
    public int compareTo(Car o) {
        if (this.model < o.getModel()){
            return 1;
        } else if (this.model > o.getModel()){
            return -1;
        }
        return 0;
    }



    public String getName() {
        return name;
    }

    public int getModel() {
        return model;
    }
}
