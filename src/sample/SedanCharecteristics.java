package sample;



/**
 *
 */
public abstract class SedanCharecteristics extends Vehicle implements SedanProperties {
  EngineType engineType;
  GearType gearType;
  SedanType sedanType;


  /**
   * Setter for property 'engineType'.
   *
   * @param engineType Value to set for property 'engineType'.
   */
  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }



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
   * @param engineType
   * @param gearType
   * @param sedanType
   */

  public SedanCharecteristics(int year, String make, String model,Color color, PowerSource powerSource,EngineType engineType, GearType gearType,
      SedanType sedanType) {
    super(year, make, model, color, powerSource);
   setEngineType(engineType);
    setGearType(gearType);
    setSedanType(sedanType);

  }

  /**
   *
   * @return
   */
  @Override
  public String getEngineType() {
    return null;
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
    return ("\n"+super.toString()+ "\nThis is a "+ sedanType + " sedan. \nIt has "+gearType + " gear. "
        + "\nThe Engine on this sedan is " + engineType.getCode() );
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
