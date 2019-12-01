package sample;

public class Sedan extends SedanCharecteristics{


  public Sedan(int year, String make, String model,
      Color color, PowerSource powerSource, EngineType engineType, GearType gearType, Doors noOfDoors,
      SedanType sedanType) {
    super(year, make, model, color, powerSource, engineType, gearType, noOfDoors, sedanType);
  }

  @Override
  public VheicleType getType() {
    return sedanType;
  }

  public double getMPG() {
    return engineType.getMpg();

  }


  @Override
  public String toString() {
    return (super.toString())+ "\n he mpg for Sedan is " + getMPG();

  }
}
