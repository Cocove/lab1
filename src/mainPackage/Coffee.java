package mainPackage;

public class Coffee extends Food{
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Coffee)){
            return false;
        }
        if (aroma == null || ((Coffee)obj).aroma == null){
            return false;
        }
        if(!(aroma.equals(((Coffee) obj).aroma))){
            return false;
        }
        return super.equals(obj);
    }
    private String aroma;

    public String getAroma(){return aroma;}

    public void setAroma(String aroma){this.aroma = aroma;}

    public Coffee(String aroma) {
        super("Кофе");
        this.aroma = aroma;
    }

    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }

    @Override
    public String toString() {

        return super.toString() + " c начинкой '" + aroma.toUpperCase() + "'";
    }


}
