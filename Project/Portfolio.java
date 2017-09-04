import java.util.*;
public class Portfolio{
    private ArrayList<Project> portfolio;
    //Constructors
    public Project(){
        portfolio = new ArrayList<Project>;
    }

    
    //Name
    //Description
    //initialCost
    //Elevator Pitch
    public String elevatorPitch(){
        return name + " ("+cost+"): " + description;
    }
}