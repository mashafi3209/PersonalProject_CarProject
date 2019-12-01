package sample;

public enum SuvType implements VheicleType{
  Subcompact,Compact,Mid_Size,Full_Size;

  /** {@inheritDoc} */
  @Override
  public Class<? extends Vehicle> getType() {
    return Sedan.class;
  }

  /** {@inheritDoc} */
  @Override
  public String getName() {
    return "SUV";
  }
}

