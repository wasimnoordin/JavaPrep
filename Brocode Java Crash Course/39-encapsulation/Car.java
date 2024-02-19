public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        
        // not needed due to setter methods
        // this.make = make;
        // this.model = model;
        // this.year = year; 

        // just call methods instead
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

    }

    // getter methods for private variables

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // setter methods

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
