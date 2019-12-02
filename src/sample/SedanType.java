package sample;

/**
 *
 */
public enum SedanType implements VheicleType{
  MuscleCar,Convertable,FullSize,MidSize,Compact;

  /**
   *
   * @return
   */
  @Override
  public Class<? extends Vehicle> getType() {
    return Sedan.class;
  }

  /**
   *
   * @return
   */
  @Override
  public String getName() {
    return "Sedan";
  }
}
