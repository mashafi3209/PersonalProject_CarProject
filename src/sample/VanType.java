package sample;

/**
 *Enum for VanType
 */
public enum VanType implements VheicleType{
  MuscleCar,Convertable,FullSize,MidSize,Compact;

  /**
   *
   * @return to Van class as type
   */
  @Override
  public Class<? extends Vehicle> getType() {
    return Van.class;
  }

  /**
   *Getter for name of the Van type.
   *
   * @return
   */
  @Override
  public String getName() {
    return "Van";
  }
}
