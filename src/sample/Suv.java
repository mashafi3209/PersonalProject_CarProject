package sample;

/**
 *
 */
public class Suv extends SuvCharecteristics implements SuvProperties{

  /**
   *
   * @param year
   * @param make
   * @param model
   * @param color
   * @param powerSource
   * @param engineType
   * @param gearType
   * @param noOfDoors
   * @param suvType
   * @param noOfSeats
   */
  public Suv(int year, String make, String model,
      Color color, PowerSource powerSource, EngineType engineType, GearType gearType, Doors noOfDoors,
      SuvType suvType, NoOfSeats noOfSeats) {
    super(year, make, model, color, powerSource, engineType, gearType, noOfDoors, suvType, noOfSeats);
  }

  /**
   *
   * @return
   */
  @Override
  public VheicleType getType() {
    return suvType;
  }

  /**
   * Getter for property 'MPG'.
   *
   * @return Value for property 'MPG'.
   */
  public double getMPG() {
    return engineType.getMpg();

  }


  /** {@inheritDoc} */
  @Override
  public String toString() {
    return (super.toString())+ "\nThe MPG for Suv is " + getMPG();

  }
}
