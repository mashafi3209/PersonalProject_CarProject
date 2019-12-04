package sample;

public class Sedan extends SedanCharecteristics implements SedanProperties{

  /**
   *
   * @param year
   * @param make
   * @param model
   * @param color
   * @param powerSource
   * @param gearType
   * @param sedanType
   */
  public Sedan(int year, String make, String model,
      Color color, PowerSource powerSource, GearType gearType,
      SedanType sedanType) {
    super(year, make, model, color, powerSource, gearType, sedanType);
  }

  /**
   *
   * */
  @Override
  public VheicleType getType() {
    return sedanType;
  }



  /**
   *
   *To String Method to print the mileage
   *
   * */
  @Override
  public String toString() {
    return (super.toString());

  }
}
