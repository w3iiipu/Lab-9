import java.util.ArrayList;
import java.util.Scanner;

/*
    This is the main program
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Motor admin console! ");        //Welcome message

        int numCars = Validator.getInt(scan1, "Please enter number of cars: "); //Prompt user for amount of input

        ArrayList<Car> carList = userInput(scan1, numCars);     //populates carList with user input

        System.out.println("Current Inventory : ");
        for (Car c: carList)                                //for loops to print out the arraylist
        {
            System.out.println(c.printInventory());
        }

    }

/*
    This method populates the array with cars according to user input
 */

    public static ArrayList<Car> userInput(Scanner scan1, int numCars) {

        ArrayList<Car> carList = new ArrayList<Car>();          //initializing the arraylist

        for (int i = 1; i <= numCars; i++)                  //for loop to prompt user input car data base on number of cars user input
        {
            String userMake = Validator.getString(scan1, "Please enter the make of car " + (i) + ": ");

            String userModel = Validator.getString(scan1, "Please enter the model of car " + (i) + ": ");

            int userYear = Validator.getInt(scan1, "Please enter the year of car " + (i) + ": ",1990, 2020);

            double userPrice = Validator.getDouble(scan1, "PLease enter the price of car" + (i) + ": ");


            carList.add(new Car(userMake, userModel, userYear, userPrice));         //adding

        }
        return carList;
    }

}
