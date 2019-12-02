package sample;
/**
 * Enum for Engine type
 */
public enum EngineType {
  FOUR_CYLINDER("V4",29.90),
  SIX_CYLINDER("V6",20.35),
  EIGHT_CYLINDER("V8",16.90),
  TWELVE_CYLINDER("V12",14.99);

  private String code;
  private double mpg;

  /**
   * Constructor
   * @param code get the code name for the engine for shortform
   * @param mpg Retrive the MPG value for the engine type
   */
  EngineType(String code, double mpg) {
    this.code = code;
    this.mpg = mpg;
  }

  /**
   * Getter for property 'code'.
   *
   * @return Value for property 'code'.
   */
  public String getCode() {
    return code;
  }

  /**
   * @return
   */
  public double getMpg(){
    return mpg;
  }

}
