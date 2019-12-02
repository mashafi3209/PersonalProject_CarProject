package sample;

public enum VanType implements VheicleType{
  MuscleCar,Convertable,FullSize,MidSize,Compact;

  @Override
  public Class<? extends Vehicle> getType() {
    return Van.class;
  }

  @Override
  public String getName() {
    return "Van";
  }
}
