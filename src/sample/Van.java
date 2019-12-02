package sample;

public class Van extends VanCharecteristics implements VanProperties{


  public Van(int year, String make, String model,
      Color color, PowerSource powerSource, EngineType engineType, GearType gearType,
      VanType vanType, Doors noOfDoors, NoOfSeats noOfSeats) {
    super(year, make, model, color, powerSource, engineType, gearType, vanType, noOfDoors,noOfSeats);
  }

  @Override
  public VheicleType getType() {
    return vanType;
  }

  public double getMPG() {
    return engineType.getMpg();

  }


  @Override
  public String toString() {
    return (super.toString())+ "The mpg for Van is " + getMPG();

  }

}
