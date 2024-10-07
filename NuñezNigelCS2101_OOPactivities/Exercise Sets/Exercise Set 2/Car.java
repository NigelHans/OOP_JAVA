public class Car {
    //Properties
    private String color;
    private double price;
    private char size;

    //Constructor
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    //Getter for Color, Price, and Size
    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

      public char getSize() {
        return size;
    }

    //Setter for Color, Price, and Size
    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        if (size == 'S' || size == 'M' || size == 'L') {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Size must be 'S', 'M', or 'L'");
        }
    }

    public String toString() {
        String sizeDescriptor = "";
        switch (size) {
            case 'S': sizeDescriptor = "small"; 
            break;
            case 'M': sizeDescriptor = "medium"; 
            break;
            case 'L': sizeDescriptor = "large"; 
            break;
        }

        return "Car (" + color + ") - P" + String.format("%.2f", price) + " - " + sizeDescriptor;
    }

    //Examples
    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'M');
        Car car2 = new Car("blue", 50000.00, 'L');
        
        System.out.println(car1);
        System.out.println(car2);
    }
}
