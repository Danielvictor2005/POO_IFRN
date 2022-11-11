import java.util.Scanner;

public class Rooms {

  private int[] rooms = new int[10];
  private String[] emails = new String[10];
  private String[] names = new String[10];

  private int numberRoom = 0;

  private int numberForStudents = 0;

  Scanner leitorX = new Scanner(System.in);

  public void setRooms() {

    System.out.println("How many students?");
    numberForStudents = leitorX.nextInt();

    while (numberForStudents < 1 || numberForStudents > 10) {
      System.out.println("Excess number of students, please enter again: ");
      numberForStudents = leitorX.nextInt();
    }

    for (int i = 0; i < numberForStudents; i++) {

      System.out.printf("Rent %d", i + 1);

      System.out.print("Name: ");
      String nameStudent = leitorX.next();

      System.out.println("Email: ");
      String emailStudent = leitorX.next();

      System.out.println("Room: ");
      numberRoom = leitorX.nextInt();

      rooms[numberRoom] = numberRoom;
      names[numberRoom] = nameStudent;
      emails[numberRoom] = emailStudent;

    }
  }

  private void showDataRooms() {
    System.out.println("Busy rooms: ");
    for (int i = 0; i < rooms.length; i++) {
      if (rooms[i] != 0) {
        System.out.printf("%: %s, %s", numberRoom, names[i], emails[i]);
      }
    }
  }

}
