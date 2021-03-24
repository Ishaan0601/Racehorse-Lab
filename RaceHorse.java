//Author: Ishaan Virani
public class RaceHorse extends Horse
{
    // instance variables
    private int numRacesWon;
    private int numRacesLost;
    
    // Default constructor
    // Use the keyword super to call the Horse class's default
    //   constructor so that the instance variables inherited
    //   from this class can be initialized.
    // Initialize the instance variable numRacesWon to zero.
    public RaceHorse()
    {
      super();
      numRacesWon = 0;
      numRacesLost = 0;
    }
    
    // Second constructor
    // Use the keyword super to call the Horse class's second 
    //   constructor so that the instance variables inherited
    //   from this class can be initialized to values specified
    //   in the parameter list.
    // Initialize the instance variable numRacesWon to the value
    //   specified in the parameter list.
    public RaceHorse(String owner, int age, double value, int races, int lost)
    {
      super(owner, age, value);
      numRacesWon = races;
      numRacesLost = lost;
      
    }
    
    // Accessor Method - getRacesWon
    /** Retreive the number of races won by this horse
     * @return the number of races won by this horse
     */
    public int getRacesWon() 
    {  
       return numRacesWon;  // replace this line
    }
    
    /** Return the number of races won by this horse
     * @return the number of races lost by this horse
     */
    public int getRacesLost() 
    {  
       return numRacesLost;  // replace this line
    }
    
    // toString method - SEE SAMPLE OUTPUT IN INSTRUCTIONS FOR FORMAT
    // Build and return a string representation of the instance
    // variables from both the Horse class and the RaceHorse class.
    // Use the keyword super to call the toString method of
    //   the Horse class then concatenate the numRacesWon &
    //  numRacesLost attribute to the end to produce the
    //    output shown in the Sample Run.
    public String toString()
    {
        return super.toString() + "\nRaces won = " + numRacesWon + "\nRaces lost = " + numRacesLost;  // replace this line
    }
    // Mutator Methods 
     /* Increments the number of races won attribute by 1
     */
    public void wonRace()
    {  
        numRacesWon++;
    }
    
     /* Increments the number of races lost attribute by 1
     */
    public void lostRace()
    {  
        numRacesLost++;
    }
    
    

}

