package sample;
/**
 *Interface for different types of vheicle type
 */

public interface VheicleType {

  /**
   * Getter for property 'type'.
   *
   * @return Value for property 'type'.
   */
  public Class<? extends Vehicle> getType();
  /**
   * Getter for property 'name'.
   *
   * @return Value for property 'name'.
   */
  public String getName();

}