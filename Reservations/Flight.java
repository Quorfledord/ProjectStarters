import java.util.*;

public class Flight
{
  /** A two-dimensional array of reservations with empty seats represented by null,
   *  instantiated in the constructor */
  private Reservation[][] seats;

  /** The number of rows of seats, set by the constructor; guaranteed to be >= 1 */
  private int rows;

  /** The number of seats per row, set by the constructor; guaranteed to be >= 3 */
  private int seatsPerRow;

  /** Determines the name of each frequent flyer with a reservation
   *  @return a list of the names of the frequent flyers with reservations */
  public List<String> frequentFlyers()
  { /* to be implemented in part (a) */ }

  /** Reserves adjacent seats and returns true if possible; otherwise,
   *  does not make reservations and returns false.
   *  @param passOneName the name of a passenger seeking a reservation
   *  @param passTwoName the name of a passenger seeking a reservation
   *  @return true if adjacent seats were reserved, false if no adjacent seats are available */
  public boolean reserveAdjacentSeats(String passOneName, String passTwoName)
  { /* to be implemented in part (b) */ }

  /** Reserves a window seat and returns true if possible; otherwise,
   *  does not make a reservation and returns false
   *  @param passengerName the name of a passenger seeking a reservation
   *  @return true if a window seat was reserved, false if no window seat is available */
  public boolean reserveWindowSeat(String passengerName)
  { /* to be implemented in part (c) */ }

  /** Determines the name of each passenger without an adjacent reservation.
   *  @return a list of the names of all passengers without adjacent reservations */
  public List<String> isolatedPassengers()
  { /* to be implemented in part (d) */ }

  // There may be instance variables, constructors, and methods that are not shown.
}
