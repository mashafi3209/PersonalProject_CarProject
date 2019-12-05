

package sample;
/**
 * Enum for doors
 */
public enum Doors {
  /**
   * Two doors
   */
  Two("has two doors"),
  /**
   * four doors
   */
  Four("has four doors"),
  /**
   * two doors and back sliding door
   */
  Two_Door_And_A_Sliding_Door("two front doors with a sliding door"),
  /**
   * two door plus two sliding door
   */
  Two_Door_And_Two_Sliding_Door("two front doors with two sliding doors"),
  /**
   * Only two front doors with a back entreance
   */
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

