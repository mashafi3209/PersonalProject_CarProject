package sample;

/**
 *
 */
public class Van extends VanCharecteristics implements VanProperties{
  /**
   *
   * @param year from Vehicle class as super
   * @param make from Vehicle class as super
   * @param model from Vehicle class as super
   * @param color from Vehicle class as super
   * @param powerSource from Vehicle class as super
   * @param engineType from VanCharacteristics class
   * @param gearType from VanCharacteristics class
   * @param noOfDoors from VanCharacteristics class
   * @param vanType from VanCharacteristics class
   * @param noOfSeats from VanCharacteristics class
   */

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
