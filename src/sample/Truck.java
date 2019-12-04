package sample;

/**
 *
 */
public class Truck extends TrucksCharecteristics implements PerformanceSpecs {
  int horsePower;
  /**
   *
   * @return
   */
  @Override
  public int getHorsePower() {
    return 0;
  }

  /**
   *
   * @return
   */
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

  /**
   *
   * @param year from Vehicle class as super
   * @param make from Vehicle class as super
   * @param model from Vehicle class as super
   * @param color from Vehicle class as super
   * @param powerSource from Vehicle class as super
   * @param noOfWheel from TruckCharecteristics class
   * @param engineType from TruckCharecteristics class
   * @param gearType from TruckCharecteristics class
   * @param noOfDoors from TruckCharecteristics class
   * @param truckType from TruckCharecteristics class
   * @param wheelDrive from TruckCharecteristics class
   * @param noOfSeats from TruckCharecteristics class
   * @param horsePower from TruckCharecteristics class
   */
  Truck(int year, String make, String model,Color color, PowerSource powerSource,
      int noOfWheel, EngineType engineType, GearType gearType, Doors noOfDoors, TruckType truckType, WheelDrive wheelDrive, NoOfSeats noOfSeats, int horsePower) {
    super(year, make, model,color, powerSource,
    noOfWheel, engineType, gearType, noOfDoors, truckType, wheelDrive, noOfSeats);
    setHorsePower(horsePower);


  }

  /**
   *
   * @return truckType
   */
  @Override
  public VheicleType getType() {
    return truckType;
  }

  /**
   *To String Method
   * @return toString from super and another statement with horsepower and mpg
   */
  @Override
  public String toString() {
    return super.toString()+
        "\nIt has horse power of " + horsePower + "\nThe MPG for that vheicle is " + getMPG();
  }


}
