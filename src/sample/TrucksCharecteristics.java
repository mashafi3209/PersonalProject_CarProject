package sample;

public class TrucksCharecteristics extends Vehicle implements TruckProperties {
  int noOfWheel;
  EngineType engineType;
  GearType gearType;
  Doors noOfDoors;
  TruckType truckType;
  WheelDrive wheelDrive;

  public void setNoOfWheel(int noOfWheel) {
    this.noOfWheel = noOfWheel;
  }

  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }

  public void setWheelDrive(WheelDrive wheelDrive) {
    this.wheelDrive = wheelDrive;
  }

  public void setGearType(GearType gearType) {
    this.gearType = gearType;
  }

  public void setNoOfDoors(Doors noOfDoors) {
    this.noOfDoors = noOfDoors;
  }

  public void setTruckType(TruckType truckType) {
    this.truckType = truckType;
  }
  TrucksCharecteristics(int year, String make, String model, VheicleType type,Color color, PowerSource powerSource,int noOfWheel, EngineType engineType, GearType gearType, Doors noOfDoors, TruckType truckType, WheelDrive wheelDrive){
    super(year, make, model, type, color, powerSource);

    setNoOfWheel(noOfWheel);
    setEngineType(engineType);
    setGearType(gearType);
    setNoOfDoors(noOfDoors);
    setTruckType(truckType);
    setWheelDrive(wheelDrive);
  }

  @Override
  public int getNoOfWheel() {
    return 0;
  }

  @Override
  public String getEngineType() {
    return null;
  }

  @Override
  public String getWheelDrive() {
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
  public String getTruckType() {
    return null;
  }
  @Override
  public PowerSource getPower() {
    return null;
  }

  /*  @Override
    public String getWheelDrive() {
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
    public String getTruckType() {
      return null;
    }*/
  @Override
  public String toString() {

    return (super.toString()+ "\nThis is a "+ truckType + " truck. \nThe truck has "+ noOfDoors + " doors \n "+
        "the Truck has "+ noOfWheel + " wheel in it \n It is a " + wheelDrive + " Truck. \n It has a "+gearType + " gear. \n The Engine on this truck is " + engineType );
  }


}