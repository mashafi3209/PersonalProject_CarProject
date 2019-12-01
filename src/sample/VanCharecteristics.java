/*
package sample;

public abstract class VanCharecteristics extends Vehicle implements VanProperties {
  EngineType engineType;
  GearType gearType;
  Doors noOfDoors;
  VanType vanType;
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

  public void setVanType(VanType vanType) {
    this.vanType = vanType;
  }

  public void setNoOfSeats(NoOfSeats noOfSeats) {
    this.noOfSeats = noOfSeats;
  }


  VanCharecteristics(int year, String make, String model,Color color, PowerSource powerSource,EngineType engineType, GearType gearType, Doors noOfDoors,
      VanType vanType, NoOfSeats noOfSeats) {
    super(year, make, model, color, powerSource);
    setEngineType(engineType);
    setNoOfDoors(noOfDoors);
    setGearType(gearType);
    setNoOfSeats(noOfSeats);

  }



  public EngineType getEngineType() {
    return engineType;
  }




  public GearType getGearType() {
    return gearType;
  }


  public Doors getNoOfDoors() {
    return noOfDoors;
  }


  public VanType getVanType() {
    return vanType;
  }



  public NoOfSeats getNoOfSeats() {
    return noOfSeats;
  }

  @Override
  public String toString() {

    return (super.toString()+ "\nThis is a "+ vanType + " vanType. \nThe van has "+ noOfDoors.getDoors() + " doors \nIt "+noOfSeats.getTypeOfSeats() +
        " which is known as commonly " +noOfSeats.getSeatsFormation()+
         "\n It has a "+gearType + " gear. \n The Engine on this van is " + engineType.getCode() +
        "\n The Engine on this truck is " + engineType.getMpg());
  }

}
*/
