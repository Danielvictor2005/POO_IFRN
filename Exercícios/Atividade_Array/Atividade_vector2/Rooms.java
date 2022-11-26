import java.util.Scanner;

public class Rooms {

  // VARIABLE AND OBJECT INITIALIZATION BLOCK

  // Inicialization of object Scanner
  Scanner leitorX = new Scanner(System.in);

  // Three arrays
  private int[] rooms = new int[3];
  private String[] emails = new String[rooms.length];
  private String[] names = new String[rooms.length];

  // Two variables of control
  private int numberRoom = 0;
  private int numberForStudents = 0;
  private String nameStudent;
  private String emailStudent;

  // SPECIAL METHODS BLOCK

  public void setRooms() {

    setNumberOfStudents();

    for (int i = 0; i < numberForStudents; i++) {

      System.out.printf("\nRent %d:\n", i + 1);
      registerStudents();

      rooms[numberRoom] = numberRoom;
      names[numberRoom] = nameStudent;
      emails[numberRoom] = emailStudent;
    }
    showDataRooms();
  }

  private void registerStudents() {

    System.out.print("Name: ");
    nameStudent = leitorX.next();

    System.out.print("Email: ");
    emailStudent = leitorX.next();

    System.out.print("Room: ");
    numberRoom = leitorX.nextInt();

    while (numberRoom >= rooms.length || numberRoom < 0) {
      System.out.println("Enter a number valid again: ");
      numberRoom = leitorX.nextInt();
    }

    while (rooms[numberRoom] != 0) {
      System.out.println("This room is occupied, enter again: ");
      numberRoom = leitorX.nextInt();
    }
  }

  private void setNumberOfStudents() {

    System.out.println("How many students?");
    numberForStudents = leitorX.nextInt();

    while (numberForStudents <= 0 || numberForStudents > rooms.length) {

      if (numberForStudents == 0) {
        System.out.println("Impossible to enter with zero students\nEnter with valid number again: ");
        numberForStudents = leitorX.nextInt();
      } else if (numberForStudents < 0) {
        System.out.println("The number of students is less than 1\nEnter with valid number again: ");
        numberForStudents = leitorX.nextInt();
      } else {
        System.out.println("The number of students exceeds the number of rooms\nEnter with valid number again: ");
        numberForStudents = leitorX.nextInt();
      }
    }
  }

  private void showDataRooms() {

    System.out.println("Busy rooms: ");

    for (int i = 0; i < rooms.length; i++) {
      if (rooms[i] != 0) {
        System.out.printf("%d: %s, %s\n", rooms[i], names[i], emails[i]);
      }
    }
  }
}
