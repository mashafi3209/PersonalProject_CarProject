package sample;

/**
 *
 */
public enum SuvType implements VheicleType{
  Subcompact,Compact,Mid_Size,Full_Size;

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

