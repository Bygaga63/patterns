public abstract class CofeeDecorator implements Cofee{
    private Cofee cofee;

    public CofeeDecorator(Cofee cofee) {
        this.cofee = cofee;
    }

    @Override
    public int cost() {
        return cofee.cost();
    }

    @Override
    public String ingredients() {
        return cofee.ingredients();
    }
}
