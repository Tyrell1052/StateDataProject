import java.util.*;
import java.io.*;

public class StateList {

    // This class will be responsible for loading the data from the .txt file into an array
    public static void loadArray(State[] inData) throws Exception {

        // temporary variables for the properties to read from the .txt file
        String inState;
        String inCapital;
        int inPopulation;
        //String line;

        int count = 0;// loop counter

        String fileName = ("statedata.txt");

        // this Scanner object will allow me to read the data from the .txt file
        Scanner infile = new Scanner(new File(fileName));

    /*  this while loop will read each lind of data from the .txt file using the
        Scanner object, i will also be using the hasNextLine() method to determine
        if there is another proceeding line of data.
     */

        while (infile.hasNextLine()) {

            inState = infile.nextLine();
            inCapital = infile.nextLine();
            //inPopulation=infile.nextLine();
            inPopulation = Integer.parseInt(infile.nextLine());

            // this will initialize each element in the array with the properties of the State class constructor
            inData[count] = new State(inState, inCapital, inPopulation);

        }// end while
        infile.close();


        //public StateList() throws FileNotFoundException {

    }// end StateList
}