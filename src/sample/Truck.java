package sample;

public class Truck extends TrucksCharecteristics implements PerformanceSpecs {
  int horsePower;




  /** {@inheritDoc} */
  @Override
  public int getHorsePower() {
    return 0;
  }

  /** {@inheritDoc} */
  @Override
  public double getMPG() {
    return engineType.getMpg();

  }

  /**
   * Setter for property 'horsePower'.
   *
   * @param horsePower Value to set for property 'horsePower'.
   */
  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }

  Truck(int year, String make, String model,Color color, PowerSource powerSource,
      int noOfWheel, EngineType engineType, GearType gearType, Doors noOfDoors, TruckType truckType, WheelDrive wheelDrive, NoOfSeats noOfSeats, int horsePower) {
    super(year, make, model,color, powerSource,
    noOfWheel, engineType, gearType, noOfDoors, truckType, wheelDrive, noOfSeats);
    setHorsePower(horsePower);


  }

  /** {@inheritDoc} */
  @Override
  public VheicleType getType() {
    return truckType;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return super.toString()+
        "\nIt has horse power of " + horsePower + "\nThe MPG for that vheicle is " + getMPG();
  }


}
