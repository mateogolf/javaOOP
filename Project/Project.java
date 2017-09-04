// She asks that each project has a name and a description. 
// She needs to be able to create empty projects that she can add a name and description to later;
// projects with just a name; and project with both. 
// Every single project should be able to get and set both properties.
import java.util.*;
public class Project{
    private String name;
    private String description;
    private double initialCost;
    //Constructors
    public Project(){
        this(null,null,0);
    }
    public Project(String name){
        this(name,null,0);
    }
    public Project(String name, String description){
        this(name,description,0);
    }
    public Project(String name, String description,double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    
    //Name
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    //Description
        public String getDescription(){
            return description;
        }
        public void setDescription(String description){
            this.description = description;
        }
    //initialCost
        public double getInitialCost(){
            return initialCost;
        }
        public void setInitialCost(double initialCost){
            this.initialCost = initialCost;
        }
    //Elevator Pitch
    public String elevatorPitch(){
        return name + " (" + initialCost + "): " + description;
    }
}