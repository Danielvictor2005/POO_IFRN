package java_exercise.group_work.problem_heights;

import java.util.Scanner;

public class HeightProblem {
    Scanner leitor = new Scanner(System.in);

    private int[] ages;
    private String[] names;
    private double[] heigth;
    private int numberPeopleRegistered = 0;
    private double averageHeightPeople = 0;
    private int amountLessPeoplesSixteen = 0;

    public void executeProblem() {
        setAmountOfPeople();
        setRegisterCredentials();
        setAverageHeightPeople();
        setPercentagePeoplesLessSixteen();
        showPersonalData();
    }

    private void setAmountOfPeople() {

        System.out.println("Enter a number peoples for register");
        numberPeopleRegistered = leitor.nextInt();

        ages = new int[numberPeopleRegistered];
        names = new String[numberPeopleRegistered];
        heigth = new double[numberPeopleRegistered];
    }

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

    private void setAverageHeightPeople() {
        for (int i = 0; i < numberPeopleRegistered; i++) {
            averageHeightPeople += heigth[i];
        }
    }

    private double getAverageHeightPeople() {
        return averageHeightPeople / numberPeopleRegistered;
    }

    private void setPercentagePeoplesLessSixteen() {
        for (int i = 0; i < numberPeopleRegistered; i++) {
            if (ages[i] < 16) {
                amountLessPeoplesSixteen++;
            }
        }
    }

    private double getPercentagePeoplesLessSixteeen() {
        return amountLessPeoplesSixteen;
    }

    private void showPersonalData() {
        System.out.printf("The average height: %.2f\n", getAverageHeightPeople());
        System.out.printf("People under 16 years old: %.2f", getPercentagePeoplesLessSixteeen());
    }
}