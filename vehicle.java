public class vehicle {
    String brand;
    int year;
    public vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void display(){
        IO.println("Brand: " + brand + ", Year: " + year);
    }
    public void honk(){
        IO.println("vehicle is honking!");
    }
}
