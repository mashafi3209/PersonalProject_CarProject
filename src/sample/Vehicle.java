package sample;

public abstract class Vehicle implements CProperties{

  int year;
  String make;
  String model;
  Color color;
  PowerSource powerSource;
  Vehicle(int year, String make, String model,Color color, PowerSource powerSource){
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    this.powerSource  = powerSource;
  }


  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public abstract VheicleType getType();



  public PowerSource getPowerSource() {
    return powerSource;
  }

  public void setPowerSource(PowerSource powerSource) {
    this.powerSource = powerSource;
  }

  @Override
  public String toString()
  {

    return("\nThis is a "+getType().getName() + "\nIt is made by " + make +"\nIt is know as " + model +
        ".\nIt came out in the year of " +year +"\nThe color of the vehicle is " + color + "\nThis vehicle runs on "+ powerSource + " mode");

  }
}
