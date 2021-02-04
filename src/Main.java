public class Main {

    public static void main(String[] args) {
        int amount=123_000_00; //стоимость билета в копейках
        int deliver= 20_00; // за каждые 20 рублей в копейках
        int bonus_mile= amount/deliver;
        System.out.println("Ваши бонусные мили " + bonus_mile);
    }
}
