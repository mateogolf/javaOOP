class ProjectTest{
    public static void main(String[] args){
        //test all methods in project
        //Constructors
        Project project1 = new Project();
        Project project2 = new Project("Hello");
        Project project3 = new Project("Hello World","This is a really short project for testing purposes");
        Project project4 = new Project("Hello World","Testing initialcost",1500.75);
        //Get and set Test
        project1.setName("First Project");
        project1.setDescription("First Description");
        project1.setInitialCost(22.95);
        
        System.out.println(project1.getName());
        System.out.println(project1.getDescription());
        System.out.println(project1.getInitialCost());
        //ElevatorTest
        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
        System.out.println(project4.elevatorPitch());

    }
}