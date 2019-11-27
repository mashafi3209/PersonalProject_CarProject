package sample;

public class Sedan extends SedanCharecteristics implements SedanProperties{


  public Sedan(int year, String make, String model, VheicleType type,
      Color color, PowerSource powerSource, EngineType engineType, GearType gearType, Doors noOfDoors,
      SedanType sedanType) {
    super(year, make, model, type, color, powerSource, engineType, gearType, noOfDoors, sedanType);
  }
  @Override
  public String toString() {
    System.out.println(super.toString());
    return null;
  }
}
