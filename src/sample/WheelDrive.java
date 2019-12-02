package sample;

/**
 *
 */
public enum WheelDrive {

  ALL_WHEEL_DRIVE("AWD"),
  FRONT_WHEEL_DRIVE("FWD"),
  REAR_WHEEL_DRIVE("RWD"),
  FOUR_WHEEL_DRIVE("4WD");

  private String code;

  /**
   *
   * @param code
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