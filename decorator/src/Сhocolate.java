public class Сhocolate extends CofeeDecorator {
    public Сhocolate(Cofee cofee) {
        super(cofee);
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }

    @Override
    public String ingredients() {
        return super.ingredients() + ", chocolate";
    }
}
