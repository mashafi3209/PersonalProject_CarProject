package sample;

/**
 *
 */
public enum VanType implements VheicleType{
  MuscleCar,Convertable,FullSize,MidSize,Compact;

  /** {@inheritDoc} */
  @Override
  public Class<? extends Vehicle> getType() {
    return Van.class;
  }

  /** {@inheritDoc} */
  @Override
  public String getName() {
    return "Van";
  }
}
