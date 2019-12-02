package sample;



/**
 *
 */
public abstract class VanCharecteristics extends Vehicle implements VanProperties {
  EngineType engineType;
  GearType gearType;
  VanType vanType;
 /* Doors doors;
  NoOfSeats noOfSeats;*/



  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }



  public void setGearType(GearType gearType) {
    this.gearType = gearType;
  }

  public void setVanType(VanType vanType) {
    this.vanType = vanType;
  }
/*

  public void setDoors(Doors doors) {
    this.doors = doors;
  }


  public void setNoOfSeats(NoOfSeats noOfSeats) {
    this.noOfSeats = noOfSeats;
  }*/

  public VanCharecteristics(int year, String make, String model,Color color, PowerSource powerSource,EngineType engineType, GearType gearType,
      VanType vanType/*, Doors doors, NoOfSeats noOfSeats*/) {
    super(year, make, model, color, powerSource);
    setEngineType(engineType);
    setGearType(gearType);
    setVanType(vanType);
  /*  setDoors(doors);
    setNoOfSeats(noOfSeats);*/
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
  public String getVanType() {
    return null;
  }

/*  public int getNoOfDoors() {
    return 0;
  }

  public String getNoOfSeats() {
    return null;
  }*/

  @Override
  public String toString() {
    return ("\n"+super.toString()+ "\nThis is a "+ vanType + " sedan. \nIt has "+gearType + " gear. "
        + "\n The Engine on this sedan is " + engineType.getCode() );
  }

  @Override
  public PowerSource getPower() {
    return null;
  }
}
