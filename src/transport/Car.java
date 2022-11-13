package transport;
import lombok.Getter;
import static java.lang.Character.isDigit;

@Getter
public class Car{
    private final String brand;
    private final String model;
    private final String productionCountry;
    private String color;
    private final int productionYear;
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seats;
    private String typeTyre;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double engineVolume, boolean transmission, String bodyType, String regNumber, int seats,
               boolean typeTyre, Key key, Insurance insurance){
        boolean regNumberCorrect = false;
        if (brand.length() <= 0 || brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.length() <= 0 || model == null){
            this.model = "Что за покомон ?";
        } else {
            this.model = model;
        }
        if (productionYear <= 0){
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry.length() <= 0 || productionCountry == null){
            this.productionCountry = "Ваканда";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color.length() <= 0 || color == null){
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (seats <= 0){
            this.seats = 2;
        } else {
            this.seats = seats;
        }
        if(regNumber.length() == 9 && regNumber != null) {
        for (int i = 0; i < regNumber.length(); i++){
            switch (i) {
                case 0 : regNumberCorrect = !isDigit(regNumber.toCharArray()[i]);
                    break;
                case 1 :
                case 2 :
                case 3 : regNumberCorrect = isDigit(regNumber.toCharArray()[i]);
                    break;
                case 4 :
                case 5 : regNumberCorrect = !isDigit(regNumber.toCharArray()[i]);
                    break;
                case 6 :
                case 7 :
                case 8 : regNumberCorrect = isDigit(regNumber.toCharArray()[i]);
                    break;
            }
            if(!regNumberCorrect){
                break;
            }
        }
        }
        this.regNumber = regNumberCorrect ? regNumber : "Некоректный номер";
        this.transmission = transmission ? "МКП" : "АКП";
        if (bodyType.length() <= 0 || bodyType == null){
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        this.typeTyre = typeTyre ? "летняя" : "зимняя";
        this.key = key;
        this.insurance = insurance;

    }
    public static class Key {
        private String remoteStart;
        private String keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart ? "Удаленным запуском двигателя" : "Обычным запуском двигателя";
            this.keylessAccess = keylessAccess ? "Доступом к авто без ключа" : "Доступом к авто с ключем";
        }
        @Override
        public String toString() {
            return "Автомобиль с : " + remoteStart + " и " + keylessAccess;
        }
    }
    public static class Insurance {
        private int validity;
        private double costInsurance;
        private String numberInsurance;
        public Insurance(int validity, double costInsurance, String numberInsurance){

            if (validity < java.time.LocalDate.now().getYear()) {
                this.validity = validity;
            }
            if (costInsurance < 0){
                this.costInsurance = 0;
            } else {
                this.costInsurance = costInsurance;
            }
            boolean correctNumberInsurance = false;
            if(numberInsurance.length() == 9 && numberInsurance != null) {
                for (int i = 0; i < numberInsurance.length(); i++){
                    switch (i) {
                        case 0 : correctNumberInsurance = !isDigit(numberInsurance.toCharArray()[i]);
                        case 1 :
                            break;
                        case 2 :
                        case 3 :
                        case 4 :
                        case 5 :
                        case 6 :
                        case 7 :
                        case 8 : correctNumberInsurance = isDigit(numberInsurance.toCharArray()[i]);
                            break;
                    }
                    if(!correctNumberInsurance){
                        break;
                    }
                }
            }
            this.numberInsurance = correctNumberInsurance ? numberInsurance : "Некоректный номер страховки";
        }
    @Override
    public String toString() {
        return "Номер стразовки : " + numberInsurance + ". Срок действия страховки до : " + validity +
                ". Стоимость страховки : " + costInsurance + ".";
    }
    }
    public Car setColor(String color) {
        this.color = color;
        return this;
    }
    public Car setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        return this;
    }
    public Car setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }
    public Car setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }

    public Car setTypeTyre(String typeTyre) {
        this.typeTyre = typeTyre;
        return this;
    }
    @Override
    public String toString() {
        return "Бренд: " + brand + " Модель: " + model + ". Год выпуска: " + productionYear + ". Сборка: "
                + productionCountry + ". Цвет " + color + ". Объем двигателя - " + engineVolume + " литра. "
                + "Тип коробки передач: " + transmission + ". Тип кузова: "
                + bodyType + ". Регистрационный номер автомобиля: " + regNumber + ". Количество мест: "
                + seats + ". На автомобиле установленна " + typeTyre + " резина. " + getKey() + ". " + getInsurance();
    }
    public static void printAllCar(Car[] car) {
        for (Car car1 : car) {
            if (car1 != null) {
                System.out.println(car1.toString());
            }
        }
    }


}
