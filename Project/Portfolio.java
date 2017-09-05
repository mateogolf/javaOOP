import java.util.*;
public class Portfolio{
    private ArrayList<Project> portfolio;
    //Constructors
    public Portfolio(){
        portfolio = new ArrayList<Project>();
    }
    public Portfolio(Project initialProject){
        this();
        portfolio.add(initialProject);
    }
    public Portfolio(Object obj){
        //if Project or ArrayList<Project> then add project, else return error
        if(obj instanceof ArrayList){
            // //check classes in arraylist,
            // for(Object value:obj){

            // }
            // //successful
            // portfolio = new ArrayList<Project>(Arrays.asList(obj));
        }
        else{
            portfolio = new ArrayList<Project>();
            System.out.println("The object inputted:" + obj.toString() + "is not an object, blank portfolio created");
            

        }
    }
    //getter and setter
    public ArrayList<Project> getPortfolio(){
        return portfolio;
    }
    public void setPortfolio(ArrayList<Project> newProjects){
        for(Project value:newProjects){
            portfolio.add(value);
        }

    }
    public void addProject(Project newProj){
        portfolio.add(newProj);
    }
}