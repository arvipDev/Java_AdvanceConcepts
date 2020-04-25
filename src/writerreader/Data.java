package writerreader;

import java.io.Serializable;

public class Data implements Serializable {
    private int age;
    private String name;

    public Data (int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
