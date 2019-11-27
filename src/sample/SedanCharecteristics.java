package sample;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class SedanCharecteristics extends Vehicle implements SedanProperties {
  EngineType engineType;
  GearType gearType;
  Doors noOfDoors;
  SedanType sedanType;





  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }



  public void setGearType(GearType gearType) {
    this.gearType = gearType;
  }



  public void setNoOfDoors(Doors noOfDoors) {
    this.noOfDoors = noOfDoors;
  }


  public void setSedanType(SedanType sedanType) {
    this.sedanType = sedanType;
  }
  public SedanCharecteristics(int year, String make, String model,VheicleType type,Color color, PowerSource powerSource,EngineType engineType, GearType gearType, Doors noOfDoors,
      SedanType sedanType) {
    super(year, make, model, type, color, powerSource);
   setEngineType(engineType);
    setNoOfDoors(noOfDoors);
    setGearType(gearType);
    setSedanType(sedanType);
  }

  @Override
  public String getEngineType() {
    return null;
  }

  @Override
  public int getNoOfDoors() {
    return 0;
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

    return (super.toString()+ "\nThis is a "+ sedanType + " sedan. \nThe sedan has "+ noOfDoors + " doors \n It has "+gearType + " gear. \n The Engine on this sedan is " + engineType );
  }

  @Override
  public PowerSource getPower() {
    return null;
  }
}
