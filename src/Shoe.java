import java.util.Arrays;
import java.util.List;

public class Shoe {
    //1.  Define the class
    //2.  Determine the things to track (i.e. the instance variables)
    //3.  Add private instance variables
    //4.  Add the constructor
    //5.  Add get/set methods
    //6.  Add any custom methods as required
    private double price;
    private String brandName, purpose;
    private double size;

    public Shoe(double price, String brandName, String purpose, double size) {
        setPrice(price);
        setBrandName(brandName);
        setPurpose(purpose);
        setSize(size);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("price must be greater than 0");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        List<String> brands = Arrays.asList("Nike","Adidas","Blundstone",
                            "Skechers","Puma","Vans");
        if (brands.contains(brandName))
            this.brandName = brandName;
        else
            throw new IllegalArgumentException("Valid brand names are:"+brands);
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        List<String> purposes = Arrays.asList("running","work","display",
                                    "hiking","skateboarding","dress","casual");
        if (purposes.contains(purpose))
            this.purpose = purpose;
        else
            throw new IllegalArgumentException("purpose must be one of: "+purposes);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        size =size*10;
        int remainder = (int) size%5;
        if (remainder!=0)
            throw new IllegalArgumentException("only whole or half sizes allowed");

        size = size/10;
        if (size > 1 && size <= 24)
            this.size = size;
        else
            throw new IllegalArgumentException("Size must be in the range 1-24");
    }

    public String toString()
    {
        return String.format("%s, %s, $%.2f", purpose,brandName,price);
    }
}
