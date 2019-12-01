package sample;

public enum SedanType implements VheicleType{
  MuscleCar,Convertable,FullSize,MidSize,Compact;

  @Override
  public Class<? extends Vehicle> getType() {
    return Sedan.class;
  }

  @Override
  public String getName() {
    return "Sedan";
  }
}