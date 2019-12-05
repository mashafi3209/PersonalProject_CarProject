package sample;

/**
 *Enum for Sedan type
 */
public enum SedanType implements VheicleType{
  /**
   * Sedan type Muscle Car
   */
  MuscleCar,
  /**
   * Sedan type Convertable Car
   */
  Convertable,
  /**
   * Sedan type Fullsize Car
   */
  FullSize,
  /**
   * Sedan type Midsize Car
   */
  MidSize,
  /**
   * Sedan type Compact Car
   */
  Compact;

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
