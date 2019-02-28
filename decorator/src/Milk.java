public class Milk extends CofeeDecorator {
    public Milk(Cofee cofee) {
        super(cofee);
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }

    @Override
    public String ingredients() {
        return super.ingredients() + ", milk";
    }
}
