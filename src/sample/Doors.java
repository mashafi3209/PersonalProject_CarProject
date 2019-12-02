

package sample;
/**
 * Enum for doors
 */
public enum Doors {

  Two("has two doors"),
  Four("has four doors"),
  Two_Door_And_A_Sliding_Door("two front doors with a sliding door"),
  Two_Door_And_Two_Sliding_Door("two front doors with two sliding doors"),
  Two_Front_Doors_And_A_Back_Door("two front doors with a back door"),
  ;

  private String doors;

  /**
   * Constructor
   * @param doors get the doors full description from the enum
   */
  Doors(String doors){
    this.doors = doors;
  }



  /**
   * Getter for property 'doors'.
   *
   * @return Value for property 'doors'.
   */
  public String getDoors() {
    return doors;
  }
}

