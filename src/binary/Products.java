package binary;

import java.io.Serializable;

public class Products implements Serializable {
    private int id;
    private String name;
    private String Brand;
    private double price;
    private String describe;

    public Products() {
    }

    public Products(int id, String name, String brand, double price, String describe) {
        this.id = id;
        this.name = name;
        Brand = brand;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Brand='" + Brand + '\'' +
                ", price=" + price +
                ", describe='" + describe + '\'' +
                '}';
    }
}
