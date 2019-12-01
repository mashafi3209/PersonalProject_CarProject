package sample;

public enum TruckType implements VheicleType {
  Semi,PickUp,TowTruck;

  @Override
  public Class<? extends Vehicle> getType() {
    return Truck.class;
  }

  @Override
  public String getName() {
    return "Truck";
  }
}
