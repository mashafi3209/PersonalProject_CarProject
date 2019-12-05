package sample;

/**
 *Enum class for Truck type
 */
public enum TruckType implements VheicleType {
  /**
   * Enum for Semi Truck
   */
  Semi,
  /**
   * Enum for PickUp Truck
   */
  PickUp,
  /**
   * Enum for tow Truck
   */
  TowTruck;

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
