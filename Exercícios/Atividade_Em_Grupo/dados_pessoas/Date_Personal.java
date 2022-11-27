import java.util.Scanner;

public class Date_Personal {

    Scanner leitorX = new Scanner(System.in);

    private double short_Height = Double.MAX_VALUE;
    private double larger_Height = Double.MIN_VALUE;
    private double average_height_Women = 0.0;
    private int number_of_Men;
    private int number_Women;

    private char gender[];
    private double stature[];
    private double stature_Women[];

    public void executerMethods() {
        registerArray();
        set_Larger_Height();
        set_Smaller_Height();
        set_Average_Women();
        number_Men();
        show_Date();
    }

    private void registerArray() {
        System.out.println("How many peoples will be enter");
        int numPeople = leitorX.nextInt();

        gender = new char[numPeople];
        stature = new double[numPeople];

        for (int x = 0; x < numPeople; x++) {
            System.out.printf("Stature of people %d: ", x);
            stature[x] = leitorX.nextDouble();

            System.out.printf("Gender of people %d: ", x);
            gender[x] = leitorX.next().charAt(0);
        }
    }

    private double set_Smaller_Height() {
        for (int element = 0; element < stature.length; element++) {
            if (stature[element] < short_Height) {
                short_Height = stature[element];
            }
        }
        return short_Height;
    }

    private double set_Larger_Height() {
        for (int element = 0; element < stature.length; element++) {
            if (stature[element] > larger_Height) {
                larger_Height = stature[element];
            }
        }
        return larger_Height;
    }

    private int number_Men() {
        for (int i = 0; i < gender.length; i++) {
            if (gender[i] == 'M') {
                number_of_Men++;
            }
        }
        return number_of_Men;
    }

    private double set_Average_Women() {

        for (int element = 0; element < gender.length; element++) {
            if (gender[element] == 'F') {
                number_Women++;
            }
        }

        stature_Women = new double[number_Women];

        for (int element = 0; element < stature.length; element++) {
            if (gender[element] == 'F'){
                stature_Women[element] = stature[element];
            }
        }

        for (int element = 0; element < number_Women;element++){
           average_height_Women += stature_Women[element]; 
        }
        return average_height_Women / number_Women;
    }

    private void show_Date() {
        System.out.printf("Smaller stature: %.2f\n", short_Height);
        System.out.printf("Langer stature: %.2f\n", larger_Height);
        System.out.printf("Average of women stature: %.2f\n", average_height_Women / number_Women);
        System.out.printf("Number of men: %d\n", number_of_Men);
    }
}
