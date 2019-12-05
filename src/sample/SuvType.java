package sample;

/**
 *Enum for Suv Type
 */
public enum SuvType implements VheicleType{
  /**
   * Enum for subcompact SUV
   */
  Subcompact,
  /**
   * Enum for Compact SUV
   */
  Compact,
  /**
   * Enum for Mid_Size SUV
   */Mid_Size,
  /**
   * Enum for fullsize suv
   */Full_Size;

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
    return "SUV";
  }
}

