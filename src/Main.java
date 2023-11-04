public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int ticket_price = 250000;
        int one_bonus_mile_in_rubles = 20;

        int bonus_mile = ticket_price / one_bonus_mile_in_rubles;

        System.out.println("Колличество бонусных миль:" + bonus_mile);


    }
}