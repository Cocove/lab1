package mainPackage;

public class Cheese extends Food{
    public Cheese(){super("сыр");}

    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }
}
