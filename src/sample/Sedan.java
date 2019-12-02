package sample;

public class Sedan extends SedanCharecteristics implements SedanProperties{

  /**
   *
   * @param year
   * @param make
   * @param model
   * @param color
   * @param powerSource
   * @param engineType
   * @param gearType
   * @param sedanType
   */
  public Sedan(int year, String make, String model,
      Color color, PowerSource powerSource, EngineType engineType, GearType gearType,
      SedanType sedanType) {
    super(year, make, model, color, powerSource, engineType, gearType, sedanType);
  }

  /** {@inheritDoc} */
  @Override
  public VheicleType getType() {
    return sedanType;
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
    return (super.toString())+ "The mpg for Sedan is " + getMPG();

  }
}
