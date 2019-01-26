/* This class will have the properties and constructor for the state data

 */

public class State
{

    // properties
    private String state; // variable for name of State
    private String capital; // variable for State capital
    private String population;  // variable for States population

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


    // Accessor methods so other areas of the program can access State, Capital & Populations data

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
