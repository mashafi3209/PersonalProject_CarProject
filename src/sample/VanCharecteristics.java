package sample;



/**
 *
 */
public abstract class VanCharecteristics extends Vehicle implements VanProperties {
  EngineType engineType;
  GearType gearType;
  VanType vanType;
  Doors noOfDoors;
  NoOfSeats noOfSeats;

 /* Doors doors;
 */



  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }



  public void setGearType(GearType gearType) {
    this.gearType = gearType;
  }

  public void setVanType(VanType vanType) {
    this.vanType = vanType;
  }

  public void setNoOfDoors(Doors noOfDoors) {
    this.noOfDoors = noOfDoors;
  }

  public void setNoOfSeats(NoOfSeats noOfSeats) {
    this.noOfSeats = noOfSeats;
  }

  public VanCharecteristics(int year, String make, String model,Color color, PowerSource powerSource,EngineType engineType, GearType gearType,
      VanType vanType, Doors noOfDoors, NoOfSeats noOfSeats) {
    super(year, make, model, color, powerSource);
    setEngineType(engineType);
    setGearType(gearType);
    setVanType(vanType);
    setNoOfDoors(noOfDoors);
    setNoOfSeats(noOfSeats);

  }

  public NoOfSeats getNoOfSeats() {
    return noOfSeats;
  }

  public Doors getNoOfDoors() {
    return noOfDoors;
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


  @Override
  public String toString() {
    return ("\n"+super.toString()+ "\nThis is a "+ vanType + " van. \nIt has "+gearType + " gear. \nIt "+ noOfDoors.getDoors()
        +"\nIt "+noOfSeats.getTypeOfSeats() + " which is known as " + noOfSeats.getSeatsFormation()
        + "\n The Engine on this van is " + engineType.getCode());
  }

  @Override
  public PowerSource getPower() {
    return null;
  }
}
