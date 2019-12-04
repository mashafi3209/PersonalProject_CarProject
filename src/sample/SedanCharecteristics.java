package sample;



/**
 *
 */
public abstract class SedanCharecteristics extends Vehicle implements SedanProperties {
  GearType gearType;
  SedanType sedanType;





  /**
   * Setter for property 'gearType'.
   *
   * @param gearType Value to set for property 'gearType'.
   */
  public void setGearType(GearType gearType) {
    this.gearType = gearType;
  }

  /**
   * Setter for property 'sedanType'.
   *
   * @param sedanType Value to set for property 'sedanType'.
   */
  public void setSedanType(SedanType sedanType) {
    this.sedanType = sedanType;
  }

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

  public SedanCharecteristics(int year, String make, String model,Color color, PowerSource powerSource, GearType gearType,
      SedanType sedanType) {
    super(year, make, model, color, powerSource);
    setGearType(gearType);
    setSedanType(sedanType);

  }


  /**
   *
   * @return
   */
  @Override
  public String getGearType() {
    return null;
  }

  /**
   *
   * @return
   */
  @Override
  public String getSedanType() {
    return null;
  }


  /**
   *
   * @return
   */
  @Override
  public String toString() {
    return ("\n"+super.toString()+ "\nThis is a "+ sedanType + " sedan. \nIt has "+gearType + " gear.");
  }

  /**
   *
   * @return
   */
  @Override
  public PowerSource getPower() {
    return null;
  }
}
