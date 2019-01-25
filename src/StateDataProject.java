/*
Author: Tyrell Robbins
Course CSCI 112
This project will be made up of 3 class files, one for the main method,
the second for reading data from a .txt file into an array and the third
will be for the information for each state

* */


public class StateDataProject {

    // The main method will act as the starting point for this program
    public static void main(String[] args) throws Exception
    {
        State[] stateInfo = new State[50]; //Array of 50 states

        int i; // loop counter

        // call the method to load the array
        StateList.loadArray(stateInfo);

        System.out.print("Data from the array of Monopoly board squares. Each line has:\n");
        for(i=0; i<50; i++)
        {
            System.out.println(stateInfo[i].toString());
        }





    }//end main()

}//end StateDataProject
