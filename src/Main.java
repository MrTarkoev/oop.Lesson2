public class Main {
    public static void main(String[] args) {
        //ООП. Урок 2 (инкапсуляция). Домашнее задание 1.
        // Задача 1,2, дополнительное задание

        System.out.println("ООП. Урок 2 (инкапсуляция). Домашнее задание 1, Задача 1,2, дополнительное задание");

        Human Maxim = new Human(null, "Минск.", "1998","бренд-менеджер.");
        Human Anya= new Human("Аня.", "Москва.", "1234", "методист образовательных программ.");
        Human Katya = new Human("Катя.", " Калининград ", "-3244", "продакт-менеджер.");
        Human Artem = new Human("Артем.", null, null,"директор по развитию бизнеса.");

        System.out.println(Maxim);
        System.out.println(Anya);
        System.out.println(Katya);
        System.out.println(Artem);

    }
}