package sample;

public enum EngineType {
  FOUR_CYLINDER("V4",29.90),
  SIX_CYLINDER("V6",20.35),
  EIGHT_CYLINDER("V8",16.90),
  TWELVE_CYLINDER("V12",14.99);

  private String code;
  private double mpg;

  EngineType(String code, double mpg) {
    this.code = code;
    this.mpg = mpg;
  }

  public String getCode() {
    return code;
  }
  public double getMpg(){
    return mpg;
  }

}
