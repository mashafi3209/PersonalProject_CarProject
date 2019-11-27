package sample;

import java.sql.SQLOutput;

public class Truck extends TrucksCharecteristics implements PerformanceSpecs {
  int horsePower;




  @Override
  public int getHorsePower() {
    return 0;
  }

  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }

  Truck(int year, String make, String model, VheicleType type,Color color, PowerSource powerSource,
      int noOfWheel, EngineType engineType, GearType gearType, Doors noOfDoors, TruckType truckType, WheelDrive wheelDrive, int horsePower) {
    super(year, make, model, type,color, powerSource,
    noOfWheel, engineType, gearType, noOfDoors, truckType, wheelDrive);
    setHorsePower(horsePower);


  }


  @Override
  public String toString() {
    System.out.println(super.toString()+
        "\n it has horse power of " + horsePower);
    return null;
  }


}
