package models;

public class Cigar {

    private int id;
    private String name;
    private String brand;
    private String shape;
    private float size;
    private int quantity;
    private float price;


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public String getShape(){
        return shape;
    }

    public void setSize(float size){
        this.size = size;
    }

    public float getSize(){
        return size;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return price;
    }
}
