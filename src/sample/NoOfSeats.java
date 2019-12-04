package sample;

/**
 * Enum for No of Seat design
 * Each enum has a description and seat formation name
 */
public enum NoOfSeats {
two("has two front seats but no back","two sitter"),
  five("has two front seats and three back","five sitter"),
  seven("has two front seats, five back","seven sitter");

public String typeOfSeats;
public String seatsFormation;

  /**
   * Constructor
   * @param typeOfSeats gets the description of the seat pattern in the car
   * @param seatsFormation displays the short form
   */
  NoOfSeats(String typeOfSeats, String seatsFormation) {
    this.typeOfSeats = typeOfSeats;
    this.seatsFormation = seatsFormation;
  }

  /**
   * Getter for property 'typeOfSeats'.
   *
   * @return Value for property 'typeOfSeats'.
   */
  public String getTypeOfSeats() {
    return typeOfSeats;
  }


  /**
   * Getter for property 'seatsFormation'.
   *
   * @return Value for property 'seatsFormation'.
   */
  public String getSeatsFormation() {
    return seatsFormation;
  }
}
