package sample;

/**
 *Enum for wheel drive
 */
public enum WheelDrive {
  /**
   * Enum for ALl wheel drive
   */
  ALL_WHEEL_DRIVE("AWD"),
  /**
   *Enum for front  wheel drive
   */

  FRONT_WHEEL_DRIVE("FWD"),
  /**
   * Enum for Rear wheel drive
   */
  REAR_WHEEL_DRIVE("RWD"),
  /**
   * Enum for fourl wheel drive
   */
  FOUR_WHEEL_DRIVE("4WD");

  private String code;

  /**
   *Contstructor for WheelDrive
   *
   * @param code for shortcut
   */
  WheelDrive(String code) {
    this.code = code;
  }

  /**
   * Getter for property 'code'.
   *
   * @return Value for property 'code'.
   */
  public String getCode() {
    return code;
  }
}