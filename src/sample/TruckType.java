package sample;

public enum TruckType implements VheicleType {
  Semi,PickUp,TowTruck;

  /** {@inheritDoc} */
  @Override
  public Class<? extends Vehicle> getType() {
    return Truck.class;
  }

  /** {@inheritDoc} */
  @Override
  public String getName() {
    return "Truck";
  }
}
