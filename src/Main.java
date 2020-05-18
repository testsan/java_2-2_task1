public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketCost = 10_000;    // стоимость билета
        int bonusMiles = service.calculate(ticketCost); // бонусные мили
        System.out.println(bonusMiles);
    }
}
