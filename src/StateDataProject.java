/*
Author: Tyrell Robbins
Course CSCI 112
This project will be made up of 3 class files, one for the main method,
the second for reading data from a .txt file into an array and the third
will hold the information for the States

* */

public class StateDataProject {

    // The main method will act as the starting point for this program
    public static void main(String[] args) throws Exception
    {
        State[] stateInfo = new State[50]; //Array of 50 states

        int i; // loop counter

        // call the method to load the array
        StateList.loadArray(stateInfo);

        System.out.println("Data from the array of states:\n");
        for(i=0; i<50; i++)
        {
            System.out.print("State: ");
            System.out.println(stateInfo[i].getState());
            System.out.print("Capital: ");
            System.out.println(stateInfo[i].getCapital());
            System.out.print("Population: ");
            System.out.println(stateInfo[i].getPopulation());
            System.out.println(" ");

        }

        StateList.searchState(stateInfo);

    }//end main()

}//end StateDataProject
