package sample;



/**
 *Abstract class for sedan charectersistics
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
   * @param year year of the sedan
   * @param make make of the sedan
   * @param model model of the sedan
   * @param color color of the sedan
   * @param powerSource powersource of the sedan
   * @param gearType gearType of the sedan
   * @param sedanType type of the sedan
   */
//Constructor for SedanCharecteristics
  public SedanCharecteristics(int year, String make, String model,Color color, PowerSource powerSource, GearType gearType,
      SedanType sedanType) {
    super(year, make, model, color, powerSource);
    setGearType(gearType);
    setSedanType(sedanType);

  }


  /**
   *getter for gearType
   * @return
   */
  @Override
  public String getGearType() {
    return null;
  }

  /**
   * getter for SedanType
   * @return
   */
  @Override
  public String getSedanType() {
    return null;
  }


  /**
   *
   * @return string of the sedan type and its gear type
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
