package sample;

/**
 * Sedan Class
 */
public class Sedan extends SedanCharecteristics implements SedanProperties{

  /**
   *
   * @param year Year of the sedan
   * @param make make of the sedan
   * @param model model of the sedan
   * @param color color of the sedan
   * @param powerSource powersource of the sedan
   * @param gearType gearType of the sedan
   * @param sedanType sedantype of the sedan
   */
  public Sedan(int year, String make, String model,
      Color color, PowerSource powerSource, GearType gearType,
      SedanType sedanType) {
    super(year, make, model, color, powerSource, gearType, sedanType);
  }

  /**
   *Getter for sedan type
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
