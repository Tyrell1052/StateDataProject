import java.util.*;
import java.io.*;

public class StateList {

    // This class will be responsible for loading the data from the .txt file into an array
    public static void loadArray(State[] inData) throws Exception {

        // temporary variables for the properties to read from the .txt file
        String inState;
        String inCapital;
        String inPopulation;

        int count = 0;// loop counter

        String fileName = ("statedata.txt");

        // this Scanner object will allow me to read the data from the .txt file
        Scanner infile = new Scanner(new File(fileName));

    /*  this while loop will read each lind of data from the .txt file using the
        Scanner object, i will also be using the hasNextLine() method to determine
        if there is another proceeding line of data.
     */
        while (count < inData.length) {

            inState = infile.nextLine();
            inCapital = infile.nextLine();
            inPopulation = infile.nextLine();

            // this will initialize each element in the array with the properties of the State class constructor
            inData[count] = new State(inState, inCapital, inPopulation);
            count++; // this will increase the loop counter

        }// end while
        infile.close();

    }// end loadArray

//********************************************************************************************************************

    public static void searchState(State[] state){

         Scanner keyboard = new Scanner(System.in);

         while(true){
                // get the name of the State from the user
            System.out.print("Please enter the name of the state you want to search be sure to capitalize the first letter: ");

            String targetState = keyboard.nextLine();

            for(int i = 0; i < state.length; i++){

            if(state[i].getState().equals(targetState)) {
                System.out.print("State: ");
                System.out.println(state[i].getState());
                System.out.print("Capital: ");
                System.out.println(state[i].getCapital());
                System.out.print("Population: ");
                System.out.println(state[i].getPopulation());
                break;

            }else if(i == state.length - 1 && !state[i].getState().equals(targetState)){
                System.out.println("Sorry no state by that name found. Please try again, be sure to capitalize the first letter ");

                }//end else if

            }// end for

         }//end while

      }//end searchState

    }// end StateList
