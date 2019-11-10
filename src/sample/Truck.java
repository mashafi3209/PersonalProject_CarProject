package sample;

import java.sql.SQLOutput;

public class Truck extends TrucksCharecteristics implements PerformanceSpecs {
  TrucksCharecteristics trucksCharecteristics;
  int horsePower;




  @Override
  public int getHorsePower() {
    return 0;
  }

  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }

  Truck(int year, String make, String model, VheicleType type,Color color,
      int noOfWheel, EngineType engineType, GearType gearType, Doors noOfDoors, TruckType truckType, WheelDrive wheelDrive, int horsePower) {
    super(year, make, model, type,color,
    noOfWheel, engineType, gearType, noOfDoors, truckType, wheelDrive);
    setHorsePower(horsePower);


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
  public String toString() {
    System.out.println(super.toString()+
        "\n it has horse power of " + horsePower);
    return null;
  }


}
