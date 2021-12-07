package mainPackage;

import java.util.Objects;

public class Food implements  Consumable{
    private String name;

    public String getName(){return name;}

    public Food(String name){this.name = name;}

    @Override
    public String toString() { return name; }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Food)){
            return false;
        }
        else if (name == null || ((Food)obj).name == null){
            return false;
        }
        return name.equals(((Food)obj).name);
    }



}