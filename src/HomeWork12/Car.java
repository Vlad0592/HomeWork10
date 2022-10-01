package HomeWork12;

public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getProductionYear() {return this.productionYear;}

    public String getColor() {return this.color;}

    public String getProductionCountry() {return this.productionCountry;}


    @Override
    public String toString() {
        return   brand +   model + engineVolume + color  + productionYear + productionCountry;
    }

    public Car(String brand1, String model1, double engineVolume1, String color1, int productionYear1, String productionCountry1) {
        this.brand = brand1;
        this.model = model1;
        this.engineVolume = engineVolume1;
        this.color = color1;
        this.productionYear = productionYear1;
        this.productionCountry = productionCountry1;

    }
}
