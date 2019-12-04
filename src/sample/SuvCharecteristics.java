package sample;

/**
 *
 */
public abstract class SuvCharecteristics extends Vehicle implements SuvProperties {
  EngineType engineType;
  GearType gearType;
  Doors noOfDoors;
  SuvType suvType;
  WheelDrive wheelDrive;
  NoOfSeats noOfSeats;

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
   * Setter for property 'noOfDoors'.
   *
   * @param noOfDoors Value to set for property 'noOfDoors'.
   */
  public void setNoOfDoors(Doors noOfDoors) {
    this.noOfDoors = noOfDoors;
  }

  /**
   * Setter for property 'suvType'.
   *
   * @param suvType Value to set for property 'suvType'.
   */
  public void setSuvType(SuvType suvType) {
    this.suvType = suvType;
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
   * @param engineType
   * @param gearType
   * @param noOfDoors
   * @param suvType
   * @param noOfSeats
   */
  public SuvCharecteristics(int year, String make, String model,Color color, PowerSource powerSource,EngineType engineType, GearType gearType, Doors noOfDoors,
      SuvType suvType,WheelDrive wheelDrive, NoOfSeats noOfSeats) {
    super(year, make, model, color, powerSource);
    setEngineType(engineType);
    setNoOfDoors(noOfDoors);
    setGearType(gearType);
    setSuvType(suvType);
    setWheelDrive(wheelDrive);
    setNoOfSeats(noOfSeats);
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
  public String getSuvType() {
    return null;
  }

  /**
   * Getter for property 'wheelDrive'.
   *
   * @return Value for property 'wheelDrive'.
   */
  public WheelDrive getWheelDrive() {
    return wheelDrive;
  }


  /**
   * Getter for property 'noOfSeats'.
   *
   * @return Value for property 'noOfSeats'.
   */
  public NoOfSeats getNoOfSeats() {
    return noOfSeats;
  }

  /**
   *
   * @return
   */
  @Override
  public String toString() {

    return ("\n"+super.toString()+ "\nThis is a "+ suvType + " Suv. \nThe Suv has "+ noOfDoors + " doors.\nIt has "+gearType + " gear. "+
        "\nIt is a "+ wheelDrive.getCode() +" SUV.\nIt "+ noOfSeats.getTypeOfSeats() + " seat which is known as "
        + noOfSeats.getSeatsFormation() + "\nThe Engine on this SUV is " + engineType.getCode() );
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
