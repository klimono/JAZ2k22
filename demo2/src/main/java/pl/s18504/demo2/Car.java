package pl.s18504.demo2;

public class Car {
    private int id;
    private int productionYear;
    private String brand;
    private String model;
    private String color;

    public Car(int id, int productionYear, String brand, String model, String color){
        this.id = id;
        this.productionYear = productionYear;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(int id,  String color){
        this.id = id;
        this.productionYear = 2137;
        this.brand = "papa";
        this.model = "mobil";
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
