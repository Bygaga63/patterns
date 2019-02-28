public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Cofee capuchino = new Milk(new Сhocolate(espresso));
        System.out.println(capuchino.cost());
        System.out.println(capuchino.ingredients());
    }
}
