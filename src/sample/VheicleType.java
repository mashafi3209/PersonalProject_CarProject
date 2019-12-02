package sample;
//Interface for different types of vheicle type
public interface VheicleType {

  public Class<? extends Vehicle> getType();
  public String getName();

}