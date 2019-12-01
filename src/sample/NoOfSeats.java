package sample;

public enum NoOfSeats {
two("has two front seats but no back","two sitter"),
  five("has two front seats and three back","five sitter"),
  seven("has two front seats, five back","seven sitter");

public String typeOfSeats;
public String seatsFormation;

  NoOfSeats(String typeOfSeats, String seatsFormation) {
    this.typeOfSeats = typeOfSeats;
    this.seatsFormation = seatsFormation;
  }

  public String getTypeOfSeats() {
    return typeOfSeats;
  }


  public String getSeatsFormation() {
    return seatsFormation;
  }
}
