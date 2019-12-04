package sample;

/**
 *
 */
public abstract class TrucksCharecteristics extends Vehicle implements TruckProperties {
  int noOfWheel;
  EngineType engineType;
  GearType gearType;
  Doors noOfDoors;
  TruckType truckType;
  WheelDrive wheelDrive;
  NoOfSeats noOfSeats;

  /**
   * Setter for property 'noOfWheel'.
   *
   * @param noOfWheel Value to set for property 'noOfWheel'.
   */
  public void setNoOfWheel(int noOfWheel) {
    this.noOfWheel = noOfWheel;
  }

  /**
   * Setter for property 'engineType'.
   *
   * @param engineType Value to set for property 'engineType'.
   */
  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }

  /**
   * Setter for property 'wheelDrive'.
   *
   * @param wheelDrive Value to set for property 'wheelDrive'.
   */
  public void setWheelDrive(WheelDrive wheelDrive) {
    this.wheelDrive = wheelDrive;
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
   * Setter for property 'noOfDoors'.
   *
   * @param noOfDoors Value to set for property 'noOfDoors'.
   */
  public void setNoOfDoors(Doors noOfDoors) {
    this.noOfDoors = noOfDoors;
  }

  /**
   * Setter for property 'truckType'.
   *
   * @param truckType Value to set for property 'truckType'.
   */
  public void setTruckType(TruckType truckType) {
    this.truckType = truckType;
  }

  /**
   * Setter for property 'noOfSeats'.
   *
   * @param noOfSeats Value to set for property 'noOfSeats'.
   */
  public void setNoOfSeats(NoOfSeats noOfSeats) {
    this.noOfSeats = noOfSeats;
  }

  /**
   *
   * @param year
   * @param make
   * @param model
   * @param color
   * @param powerSource
   * @param noOfWheel
   * @param engineType
   * @param gearType
   * @param noOfDoors
   * @param truckType
   * @param wheelDrive
   * @param noOfSeats
   */
  TrucksCharecteristics(int year, String make, String model,Color color, PowerSource powerSource,int noOfWheel, EngineType engineType, GearType gearType, Doors noOfDoors, TruckType truckType, WheelDrive wheelDrive,NoOfSeats noOfSeats){
    super(year, make, model, color, powerSource);

    setNoOfWheel(noOfWheel);
    setEngineType(engineType);
    setGearType(gearType);
    setNoOfDoors(noOfDoors);
    setTruckType(truckType);
    setWheelDrive(wheelDrive);
    setNoOfSeats(noOfSeats);
  }

  /**
   *
   * @return
   */
  @Override
  public int getNoOfWheel() {
    return 0;
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
  public String getWheelDrive() {
    return null;
  }

  /**
   *
   * @return
   */
  @Override
  public int getNoOfDoors() {
    return 0;
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
  public String getTruckType() {
    return null;
  }

  /**
   *
   * @return
   */
  @Override
  public PowerSource getPower() {
    return null;
  }

  /**
   *
   * @return
   */
  public String getNoOfSeats() {
    return null;
  }

  /**
   *
   * @return
   */
  @Override
  public VheicleType getType() {
    return null;
  }




  /**
   *toString Method
   * */
  @Override
  public String toString() {

    return (super.toString()+ "\nThis is a "+ truckType + " truck. \nThe truck has "+ noOfDoors.getDoors() + "\nIt "+ noOfSeats.getTypeOfSeats() +
        " seat which is known as " + noOfSeats.getSeatsFormation() + "\nThe Truck has "+ noOfWheel + " wheel in it \nIt is a " + wheelDrive.getCode() +
        " Truck. \nIt has a "+gearType + " gear. \nThe Engine on this truck is " + engineType.getCode() );
  }


}
