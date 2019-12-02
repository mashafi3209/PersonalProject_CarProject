package sample;

public abstract class SuvCharecteristics extends Vehicle implements SuvProperties {
  EngineType engineType;
  GearType gearType;
  Doors noOfDoors;
  SuvType suvType;
  NoOfSeats noOfSeats;

  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }

  public void setGearType(GearType gearType) {
    this.gearType = gearType;
  }

  public void setNoOfDoors(Doors noOfDoors) {
    this.noOfDoors = noOfDoors;
  }

  public void setSuvType(SuvType suvType) {
    this.suvType = suvType;
  }

  public void setNoOfSeats(NoOfSeats noOfSeats) {
    this.noOfSeats = noOfSeats;
  }

  public SuvCharecteristics(int year, String make, String model,Color color, PowerSource powerSource,EngineType engineType, GearType gearType, Doors noOfDoors,
      SuvType suvType, NoOfSeats noOfSeats) {
    super(year, make, model, color, powerSource);
    setEngineType(engineType);
    setNoOfDoors(noOfDoors);
    setGearType(gearType);
    setSuvType(suvType);
    setNoOfSeats(noOfSeats);
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
  public String getSuvType() {
    return null;
  }


  public NoOfSeats getNoOfSeats() {
    return noOfSeats;
  }

  @Override
  public String toString() {

    return ("\n"+super.toString()+ "\nThis is a "+ suvType + " Suv. \nThe Suv has "+ noOfDoors + " doors.\n It has "+gearType + " gear. "+
        "\nIt "+ noOfSeats.getTypeOfSeats() + " seat which is known as " + noOfSeats.getSeatsFormation()

        + "\n The Engine on this SUV is " + engineType.getCode() );
  }

  @Override
  public PowerSource getPower() {
    return null;
  }
}
