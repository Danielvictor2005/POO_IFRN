import java.util.Scanner;
// Ale

public class HeightProblem {

  // ** Make object Scanner
  Scanner leitor = new Scanner(System.in);

  // ** Three arrays
  private int[] ages;
  private String[] names;
  private double[] heigth;

  // ** Three global variables
  private int numberPeopleRegistered = 0;
  private double averageHeightPeople = 0;
  private int amountLessPeoplesSixteen = 0;

  // ** Method for executable all specials methods
  public void executeProblem() {
    setAmountOfPeople();
    setRegisterCredentials();
    setAverageHeightPeople();
    setPercentagePeoplesLessSixteen();
    showPersonalData();
    setPeoplesLessSixteen();
  }

  // ** Check
  private void setAmountOfPeople() {

    System.out.println("Enter a number peoples for register");
    numberPeopleRegistered = leitor.nextInt();

    ages = new int[numberPeopleRegistered];
    names = new String[numberPeopleRegistered];
    heigth = new double[numberPeopleRegistered];
  }

  // ** Check
  private void setRegisterCredentials() {

    for (int i = 0; i < numberPeopleRegistered; i++) {
      System.out.println("Enter a name: ");
      names[i] = leitor.next();

      System.out.println("Enter a age: ");
      ages[i] = leitor.nextInt();

      System.out.println("Enter a height: ");
      heigth[i] = leitor.nextDouble();
    }
  }

  // ** Check
  private void setAverageHeightPeople() {
    for (int i = 0; i < numberPeopleRegistered; i++) {
      averageHeightPeople += heigth[i];
    }
  }

  // ** Check
  private double getAverageHeightPeople() {
    return averageHeightPeople / numberPeopleRegistered;
  }

  // ** Check
  private void setPercentagePeoplesLessSixteen() {
    for (int i = 0; i < numberPeopleRegistered; i++) {
      if (ages[i] < 16) {
        amountLessPeoplesSixteen++;
      }
    }
  }

  // ** Check
  private double getPercentagePeoplesLessSixteeen() {
    return amountLessPeoplesSixteen;
  }

  // ** Check
  private void setPeoplesLessSixteen() {
    for (int i = 0; i < numberPeopleRegistered; i++) {
      if (ages[i] < 16) {
        System.out.printf("%s\n", names[i]);
      }
    }
  }

  // ** Check
  private void showPersonalData() {
    System.out.printf("The average height: %.2f\n", getAverageHeightPeople());
    System.out.printf("People under 16 years old: %.2f\n", getPercentagePeoplesLessSixteeen());
  }
}
