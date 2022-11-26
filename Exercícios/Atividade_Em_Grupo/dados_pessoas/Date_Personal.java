import java.util.Scanner;

public class Date_Personal {

    Scanner leitorX = new Scanner(System.in);

    private double short_Height;
    private double larger_Height;
    private double average_height_Women;
    private int number_of_Men;

    private char gender[];
    private double stature[];

    public void xxx() {
        System.out.println("How many peoples will be enter");
        int numPeople = leitorX.nextInt();

        gender = new char[numPeople];
        stature = new double[numPeople];

        for (int x = 0; x < numPeople; x++) {
            System.out.printf("Stature of people %d", x);
            stature[x] = leitorX.nextDouble();

            System.out.printf("Gender of people %d", x);
            gender[x] = leitorX.next().charAt(0);
        }
    }

    public double aaaa() {
        System.out.println("Shorter height:");
        for (int element = 0; element < stature.length; element++) {
            if (stature[element] < short_Height) {
                short_Height = stature[element];
            }
        }
        return short_Height;
    }

    public double bbbbb() {
        System.out.println("Langer height:");
        for (int element = 0; element < stature.length; element++) {
            if (stature[element] > larger_Height) {
                larger_Height = stature[element];
            }
        }
        return larger_Height;
    }

    public int numeroDeHomems() {
        for (int i = 0; i < gender.length; i++) {
            if (gender[i] == 'M') {
                number_of_Men++;
            }
        }
        return number_of_Men;
    }
}
