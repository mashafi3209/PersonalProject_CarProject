package sample;

public class Sedan extends SedanCharecteristics implements SedanProperties{


  public Sedan(int year, String make, String model,
      Color color, PowerSource powerSource, EngineType engineType, GearType gearType,
      SedanType sedanType) {
    super(year, make, model, color, powerSource, engineType, gearType, sedanType);
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
    return (super.toString())+ "The mpg for Sedan is " + getMPG();

  }
}
