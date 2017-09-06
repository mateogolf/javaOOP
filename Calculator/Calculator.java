public class Calculator implements java.io.Serializable{
    private double operandOne;
    private String operation;
    private double operandTwo;
    private double result;
    public Calculator(){

    }
    public Calculator(double operandOne, String operation,double operandTwo){
        this.operandOne = operandOne;
        this.operation = operation;
        this.operandTwo = operandTwo;
        performOperation();
    }
    //Getters
    public double getOperandOne() {
        return operandOne;
    }

    public String getOperation() {
        return operation;
    }

    public double getOperandTwo() {
        return operandTwo;
    }
    //Setters
    public void setOperandOne(double operandOne){
        this.operandOne = operandOne;
    }
    public void setOperation(String operation){
        this.operation = operation;
    }
    public void setOperandTwo(double operandTwo){
        this.operandTwo = operandTwo;
    }
    public void performOperation(){
        if(operation.equals("+")){
            result = operandOne + operandTwo;
        }else if(operation.equals("-")){
            result = operandOne - operandTwo;
        }else{
            System.out.println("Not Addition or subtraction");
            result = 0;
        }
        // String result = operandOne + operation + operandTwo;
        // System.out.println(result);
        // ScriptEngineManager mgr = new ScriptEngineManager();
        // ScriptEngine engine = mgr.getEngineByName("JavaScript");
        // Object obj = engine.eval(result);
        // return obj;
    }
    public double getResults(){
        System.out.println(result);
        return result;
    }
    public void setResult(){
        performOperation();
    }

}