package sample;

/**
 *
 */
public enum VanType implements VheicleType{
  MuscleCar,Convertable,FullSize,MidSize,Compact;

  /**
   *
   * @return
   */
  @Override
  public Class<? extends Vehicle> getType() {
    return Van.class;
  }

  /**
   *
   * @return
   */
  @Override
  public String getName() {
    return "Van";
  }
}
