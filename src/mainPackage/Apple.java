package mainPackage;

import java.util.Objects;

public class Apple extends Food{
    private String size;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Apple)) {
            return false;
        } else if (size == null || ((Apple) obj).size == null) {  // размер не задан
            return false;
        }
        else if (!(size.equals(((Apple) obj).size))) {
            return false;
        }
        return super.equals(obj);
    }

    public String getSize(){return size;}

    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }

    public Apple(String size) {
        super ("Яблоко");
        this.size = size;

    }

    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

}
