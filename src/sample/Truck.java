package sample;

public class Truck extends TrucksCharecteristics implements PerformanceSpecs {
  int horsePower;




  @Override
  public int getHorsePower() {
    return 0;
  }

  @Override
  public double getMPG() {
    return engineType.getMpg();

  }

  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }

  Truck(int year, String make, String model,Color color, PowerSource powerSource,
      int noOfWheel, EngineType engineType, GearType gearType, Doors noOfDoors, TruckType truckType, WheelDrive wheelDrive, NoOfSeats noOfSeats, int horsePower) {
    super(year, make, model,color, powerSource,
    noOfWheel, engineType, gearType, noOfDoors, truckType, wheelDrive, noOfSeats);
    setHorsePower(horsePower);


  }

  @Override
  public VheicleType getType() {
    return truckType;
  }

  @Override
  public String toString() {
    return super.toString()+
        "\n it has horse power of " + horsePower + "\n The MPG for that vheicle is " + getMPG();
  }


}
