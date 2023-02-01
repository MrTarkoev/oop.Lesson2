public class Flower {

    public static final String defaultCountry = "Россия";
    public static final String defaultName = "Не указано";
    public static final double defaultCost = 1.0;
    public static final String defaultColor = "Белый";
    public static  final  int defaultLifeSpan = 3;
    private String name;
    private  String flowerColor;
    private String country;
    private double cost;

    int lifeSpan;

    Flower(String name, double cost ){
        this(name, cost, defaultColor, defaultCountry, defaultLifeSpan );
    }
    Flower(String name, double cost, String flowerColor, String country, int lifeSpan) {
        if (name != null) {
            if (!name.isEmpty()) {
                this.name = name;
            }
        }
        setCost(cost);
        setCountry(country);
        setFlowerColor(flowerColor);
    }

    Flower(String name, double cost ,String flowerColor){
        this(name, cost,flowerColor, defaultCountry,defaultLifeSpan);
    }
   Flower(String name,  String country ,double cost){
       this(name, cost, defaultColor,country,defaultLifeSpan);
   }
    Flower(String name, double cost, int lifeSpan ){
        this(name,cost,defaultColor,defaultCountry,lifeSpan);
    }
   Flower(String name, double cost,String flowerColor, String country ){
        this(name, cost,flowerColor,country,defaultLifeSpan);
   }
   Flower(String name, double cost, int lifeSpan, String flowerColor){
        this(name, cost,flowerColor,defaultCountry,lifeSpan);
   }
   Flower(String name, double cost,String country, int lifeSpan ){
    this(name, cost, defaultColor,country,lifeSpan );
   }





    public double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        double tempCost= cost<=0.0? defaultCost: cost;
        this.cost =  Math.round(tempCost * 100.0) / 100.0;
    }


    public String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        if (country != null) {
            if(!country.isEmpty()){
                this.country = country;
            }
        } else {
            this.country = defaultCountry;
        }
    }


    public String getFlowerColor() {
        return flowerColor;
    }

    private void setFlowerColor(String flowerColor) {
        if (flowerColor != null) {
            if(!flowerColor.isEmpty()){
                this.flowerColor = flowerColor;
            }
        } else {
            this.country = defaultColor;
        }

    }
    @Override
    public String toString() {
        return name + " из " + country + " стоимость штуки " + cost + " срок стояния " + lifeSpan;

    }


}


