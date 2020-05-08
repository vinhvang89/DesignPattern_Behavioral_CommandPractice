public class Calculator {
    private IOperator iOperator;
    public Calculator(IOperator iOperator){
        this.iOperator = iOperator;
    }
    public int executes(int number1,int number2){
        return iOperator.executive(number1,number2);
    }
}
