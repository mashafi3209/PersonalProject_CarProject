package sample;

public abstract class Vehicle implements CProperties{

  int year;
  String make;
  String model;
  VheicleType type;
  Color color;
  Vehicle(int year, String make, String model, VheicleType type,Color color){
    this.year = year;
    this.make = make;
    this.model = model;
    this.type = type;
    this.color = color;

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

  public VheicleType getType() {
    return type;
  }

  public void setType(VheicleType type) {
    this.type = type;
  }
  @Override
  public String toString()
  {
    return("This is a "+type + "\n It is made by " + make +"\n It is know as " + model +".\n It came out in the year of " +year +"\n The coolor of the vehicle is " + color);
  }
}
