public class Main {
    public static void main(String[] args) {



        //ООП. Урок 2 (инкапсуляция). Домашнее задание 1.
        // Задача 1

        System.out.println("ООП. Урок 2 (инкапсуляция). Домашнее задание 1, Задача 1");

        Human Maxim = new Human(null, "Минск.", "1998","бренд-менеджер.");
        Human Anya= new Human("Аня.", "Москва.", "1234", "методист образовательных программ.");
        Human Katya = new Human("Катя.", " Калининград ", "-3244", "продакт-менеджер.");
        Human Artem = new Human("Артем.", null, null,"директор по развитию бизнеса.");

        System.out.println(Maxim);
        System.out.println(Anya);
        System.out.println(Katya);
        System.out.println(Artem);

        System.out.println();
        System.out.println();

        //ООП. Урок 2 (инкапсуляция). Домашнее задание 1.
        // Задача 2

        System.out.println("ООП. Урок 2 (инкапсуляция). Домашнее задание 1, Задача 2");

        Flower Роза  = new Flower ("Роза обыкновенная ", 35.454645, " из Голландии ", "",0);
        Flower Хризантема = new Flower ("Хризантема",15,"","USA",5);
        Flower Пион = new Flower ( "Пион ",-3,1);
        Flower Гипсофила = new Flower ( "Гипсофила",0, "Турция","Ger",10);
        System.out.println(Пион);
    }
}