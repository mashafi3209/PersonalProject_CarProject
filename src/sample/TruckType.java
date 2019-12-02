package sample;

/**
 *
 */
public enum TruckType implements VheicleType {
  Semi,PickUp,TowTruck;

  /**
   *
   * @return
   */
  @Override
  public Class<? extends Vehicle> getType() {
    return Truck.class;
  }

  /**
   *
   * @return
   */
  @Override
  public String getName() {
    return "Truck";
  }
}
