package sample;

public class Truck extends Vehicle  {
  TrucksCharecteristics trucksCharecteristics;


  Truck(int year, String make, String model, Color color, TrucksCharecteristics trucksCharecteristics) {
    super(year, make, model, VheicleType.TRUCK, color);
    this.trucksCharecteristics = trucksCharecteristics;

  }

  /*@Override
  public int noOfWheel() {
    return noOfWheel;
  }

  @Override
  public String engineType() {
    return engineType;
  }

  @Override
  public String wheelDrive() {
    return wheelDrive;
  }*/
  @Override
  public String toString(){
    System.out.println(super.toString() + trucksCharecteristics);
    return null;
  }


}
