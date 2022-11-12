import transport.Car;

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
        //
        Car[] car = new Car[5];
        car[0] = new Car("Lada", "", 2015, "", "желтый", 1.7,
                false,"Седан","М655AS32",3,   false);
        //car[1] = new transport.Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черного", 3.0);
        //car[2] = new transport.Car("BMW", "Z8", 2021,"Германии", "черный", 3.0);
        //car[3] = new transport.Car("Kia", "Sportage 4 поколение", 2018, "Южной Корее", "красного", 2.4);
        //car[4] = new transport.Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевого", 1.6);
        //Вывод результатов
        System.out.println("================================================================");
        //System.out.println(human[0]);
        //human[0].setJob("Мамкин Стример");
        //System.out.println(human[0]);
        Human.printAllHuman(human);
        System.out.println("================================================================");
        Flower.printAllFlowers(flower);
        System.out.println("================================================================");
        //System.out.println(car[0].toString());
        transport.Car.printAllCar(car);

    }
}