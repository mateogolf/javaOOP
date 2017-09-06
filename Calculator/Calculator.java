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
        this.result = performOperation();
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
    public double performOperation(){
        if(operation != "+" || operation != "-"){
            System.out.println("Not addition or subtraction. Result unchanged");
            return result;
        }
        if(operation == "+"){
            result = operandOne + operandTwo;
            return result;
        }else if(operation == "-"){
            result = operandOne - operandTwo;
            return result;
        }
        System.out.println("Nothing performed");
        return result;
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
        this.result = performOperation();
    }

}