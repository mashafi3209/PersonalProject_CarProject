package sample;

/**
 *
 */
public abstract class Vehicle implements VehicleProperties {

  /**
   *
   */
  int year;
  String make;
  String model;
  Color color;
  PowerSource powerSource;

  /**
   *
   * @param year
   * @param make
   * @param model
   * @param color
   * @param powerSource
   */
  Vehicle(int year, String make, String model,Color color, PowerSource powerSource){
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    this.powerSource  = powerSource;
  }


  /**
   * Getter for property 'color'.
   *
   * @return Value for property 'color'.
   */
  public Color getColor() {
    return color;
  }

  /**
   * Setter for property 'color'.
   *
   * @param color Value to set for property 'color'.
   */
  public void setColor(Color color) {
    this.color = color;
  }

  /** {@inheritDoc} */
  public int getYear() {
    return year;
  }

  /**
   * Setter for property 'year'.
   *
   * @param year Value to set for property 'year'.
   */
  public void setYear(int year) {
    this.year = year;
  }

  /** {@inheritDoc} */
  public String getMake() {
    return make;
  }

  /**
   * Setter for property 'make'.
   *
   * @param make Value to set for property 'make'.
   */
  public void setMake(String make) {
    this.make = make;
  }

  /** {@inheritDoc} */
  public String getModel() {
    return model;
  }

  /**
   * Setter for property 'model'.
   *
   * @param model Value to set for property 'model'.
   */
  public void setModel(String model) {
    this.model = model;
  }

  /** {@inheritDoc} */
  public abstract VheicleType getType();



  /**
   * Getter for property 'powerSource'.
   *
   * @return Value for property 'powerSource'.
   */
  public PowerSource getPowerSource() {
    return powerSource;
  }

  /**
   * Setter for property 'powerSource'.
   *
   * @param powerSource Value to set for property 'powerSource'.
   */
  public void setPowerSource(PowerSource powerSource) {
    this.powerSource = powerSource;
  }

  /**
   *
   * @return
   */
  @Override
  public String toString()
  {

    return("\nThis is a "+getType().getName() + "\nIt is made by " + make +"\nIt is know as " + model +
        ".\nIt came out in the year of " +year +"\nThe color of the vehicle is " + color + "\nThis vehicle runs on "+ powerSource + " mode");

  }
}
