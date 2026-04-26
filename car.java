public class car extends vehicle {
    String model;
    public car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }
    @Override
    public void honk() {
        IO.println("car horn: Beep beep!");
    }
    public void display() {
        super.display();
        IO.println("Model: " + model);
    }
}
