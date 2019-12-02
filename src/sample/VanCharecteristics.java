package sample;



/**
 *Abstract class VanCharecteristics
 */
public abstract class VanCharecteristics extends Vehicle implements VanProperties {
  EngineType engineType;
  GearType gearType;
  VanType vanType;
  Doors noOfDoors;
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
   * Setter for property 'vanType'.
   *
   * @param vanType Value to set for property 'vanType'.
   */
  public void setVanType(VanType vanType) {
    this.vanType = vanType;
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
   * Setter for property 'noOfSeats'.
   *
   * @param noOfSeats Value to set for property 'noOfSeats'.
   */
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

  /**
   * Getter for property 'noOfSeats'.
   *
   * @return Value for property 'noOfSeats'.
   */
  public NoOfSeats getNoOfSeats() {
    return noOfSeats;
  }

  /**
   * Getter for property 'noOfDoors'.
   *
   * @return Value for property 'noOfDoors'.
   */
  public Doors getNoOfDoors() {
    return noOfDoors;
  }

  /** {@inheritDoc} */
  @Override
  public String getEngineType() {
    return null;
  }


  /** {@inheritDoc} */
  @Override
  public String getGearType() {
    return null;
  }

  /** {@inheritDoc} */
  @Override
  public String getVanType() {
    return null;
  }


  /** {@inheritDoc} */
  @Override
  public String toString() {
    return ("\n"+super.toString()+ "\nThis is a "+ vanType + " van. \nIt has "+gearType + " gear. \nIt "+ noOfDoors.getDoors()
        +"\nIt "+noOfSeats.getTypeOfSeats() + " which is known as " + noOfSeats.getSeatsFormation()
        + "\nThe Engine on this van is " + engineType.getCode());
  }

  /** {@inheritDoc} */
  @Override
  public PowerSource getPower() {
    return null;
  }
}
