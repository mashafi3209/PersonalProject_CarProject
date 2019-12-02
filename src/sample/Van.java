package sample;

/**
 *
 */
public class Van extends VanCharecteristics implements VanProperties{


  public Van(int year, String make, String model,
      Color color, PowerSource powerSource, EngineType engineType, GearType gearType,
      VanType vanType, Doors noOfDoors, NoOfSeats noOfSeats) {
    super(year, make, model, color, powerSource, engineType, gearType, vanType, noOfDoors,noOfSeats);
  }

  /**
   *
   * @return
   */
  @Override
  public VheicleType getType() {
    return vanType;
  }

  /**
   * Getter for property 'MPG'.
   *
   * @return Value for property 'MPG'.
   */
  public double getMPG() {
    return engineType.getMpg();

  }


  /**
   *
   * @return
   */
  @Override
  public String toString() {
    return (super.toString())+ "\nThe mpg for the van is " + getMPG();

  }

}
