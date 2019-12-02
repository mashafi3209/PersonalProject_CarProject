package sample;



/**
 *
 */
public abstract class SedanCharecteristics extends Vehicle implements SedanProperties {
  EngineType engineType;
  GearType gearType;
  SedanType sedanType;


  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }



  public void setGearType(GearType gearType) {
    this.gearType = gearType;
  }

  public void setSedanType(SedanType sedanType) {
    this.sedanType = sedanType;
  }



  public SedanCharecteristics(int year, String make, String model,Color color, PowerSource powerSource,EngineType engineType, GearType gearType,
      SedanType sedanType) {
    super(year, make, model, color, powerSource);
   setEngineType(engineType);
    setGearType(gearType);
    setSedanType(sedanType);

  }

  @Override
  public String getEngineType() {
    return null;
  }


  @Override
  public String getGearType() {
    return null;
  }

  @Override
  public String getSedanType() {
    return null;
  }




  @Override
  public String toString() {
    return ("\n"+super.toString()+ "\nThis is a "+ sedanType + " sedan. \nIt has "+gearType + " gear. "
        + "\n The Engine on this sedan is " + engineType.getCode() );
  }

  @Override
  public PowerSource getPower() {
    return null;
  }
}
