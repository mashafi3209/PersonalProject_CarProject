package sample;

public class Suv extends SuvCharecteristics implements SuvProperties{


  public Suv(int year, String make, String model,
      Color color, PowerSource powerSource, EngineType engineType, GearType gearType, Doors noOfDoors,
      SuvType suvType, NoOfSeats noOfSeats) {
    super(year, make, model, color, powerSource, engineType, gearType, noOfDoors, suvType, noOfSeats);
  }

  @Override
  public VheicleType getType() {
    return suvType;
  }

  public double getMPG() {
    return engineType.getMpg();

  }


  @Override
  public String toString() {
    return (super.toString())+ "\nThe MPG for Suv is " + getMPG();

  }
}
