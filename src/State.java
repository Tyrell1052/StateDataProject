/* This class will have the properties and constructor for the state data

 */

import sun.swing.plaf.synth.DefaultSynthStyle;

import java.util.*;

public class State
{

    // properties
    private String state; // variable for name of State
    private String capital; // variable for State capital
    private String population;  // variable for States population

    private String targetState; // this will hold the target state to search
    private int searchCounter; // this will act as a counter
    Boolean stateFound = false; // this will let the method know if we found the state

    // Constructor
    public State()
    {
        state = "";
        capital = "";
        population = "";

    }// end Public State Constructor

    public State(String state, String capital, String population)
    {

        this.state = state;
        this.capital = capital;
        this.population = population;

    }// end public State(String state, String capital, int population){
//    public static State searchState(String n){
//
//        int index = 0;
//
//        // this will allow the user to enter the state in search of
//        Scanner keyboard = new Scanner(System.in);
//
//        // Print intro message to the user
//        System.out.print("This program will allow you to either print each State, Capital & Population \n" +
//                "or search for a particular State, its Capital & Population ");
//
//        // get the name of the State from the user
//        System.out.print("Please enter the States name to search: ");
//
//        while(states[index].getState().compareTo(n)!=0){
//            index ++;
//
//        }//end while
//        return states[index];
//
//
////        targetState = keyboard.nextLine();
////
////        // this method will search through the array for the target state
////        for(searchCounter = 0; (!stateFound) && (searchCounter < arrayToSearch.length); searchCounter++){
////
////            if(arrayToSear[searchCounter].matches(targetState)){
////                System.out.println(getState());
////
////            }
////        }// end for



    //}//end Search

    // Accessor methods for each property

    public String getState()
    {
        return state;
    }//end getState

    public String getCapital()
    {
        return capital;
    }//end getCapital

    public String getPopulation()
    {
        return population;
    }// end population


}// end State
