public class Main {
    public static void main(String[] args) {
        Human[] human = new Human[5];
        human[0] = new Human("Максим",1987,"Минск","бренд-менеджером");
        human[1] = new Human("Аня",-7,"","");
        human[2] = new Human("Катя", 1994,"Калининград", "продакт-менеджером");
        human[3] = new Human("Артем", 1995, "Москва", "директором по развитию бизнеса");
        human[4] = new Human("Владимир",2001, "Казань", "безработный");
        //
        Flower[] flower = new Flower[5];
        flower[0] = new Flower("Роза","красный","Голландия",35.59000,0);
        flower[1] = new Flower("Хризантема","","",15,5);
        flower[2] = new Flower("Пион","","Англия",69.9,1);
        flower[3] = new Flower("Гипсофила","","Турция",19.5,10);
        //Вывод результатов
        System.out.println("================================================================");
        //System.out.println(human[0]);
        //human[0].setJob("Мамкин Стример");
        //System.out.println(human[0]);
        Human.printAllHuman(human);
        System.out.println("================================================================");
        Flower.printAllFlowers(flower);
    }
}