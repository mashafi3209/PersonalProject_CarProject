package sample;

/**
 *Enum for VanType
 */
public enum VanType implements VheicleType{
  /**
   * Enum for Mini Van
   */
  Mini,
  /**
   * Enum for midsize van
   */
  MidSize,
  /**
   * Enum for Full Size Van
   */FullSize,
  /**
   * Enum for Commercial Van
   */Commercial;

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
