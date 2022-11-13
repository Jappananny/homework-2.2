import java.text.DecimalFormat;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    //DecimalFormat formattedDouble = new DecimalFormat("#0.00");
    //String result  = formattedDouble.format(cost);
    // ! мне кажется тут надо как-то определять что бы дальше использовать
    private final int lifeSpan;


    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        if (flowerColor.length() <= 0 || flowerColor == null) {
            this.flowerColor = "белый но не Саша";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country.length() <= 0 || country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerName() {
        return this.flowerName;
    }

    public String getFlowerColor() {
        return this.flowerColor;
    }

    public String getCountry() {
        return this.country;
    }

    public double getCost() {
        return this.cost;
    }

    public int getLifeSpan() {
        return this.lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Цветок " + getFlowerName() + ". Цвет " + getFlowerColor() + ". Страна произрастания " + getCountry() +
                ". Стоимость ед. " + getCost() + " руб. Срок жизни цветка " + getLifeSpan() + " дней.";
    }

    public static void printAllFlowers(Flower[] flower) {
        for (Flower flower1 : flower) {
            if (flower1 != null) {
                System.out.println(flower1.toString());
            }
        }
    }
}