package sample;
/**
 * Enum for Engine type
 */
public enum EngineType {
  /**
   * Enum for engine with four cylinder
   */
  FOUR_CYLINDER("V4",29.90),
  /**
   * Enum for engine with six cylinder
   */
  SIX_CYLINDER("V6",20.35),
  /**
   * Enum for engine with eight cylinder
   */
  EIGHT_CYLINDER("V8",16.90),
  /**
   * Enum for engine with twelve cylinder
   */
  TWELVE_CYLINDER("V12",14.99),

  /**
   * Enum for engine made for electric car
   */
  Brushless_DC_Motor("BLDC",500.00);

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
