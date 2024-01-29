package controller;

import model.BMICalculator;
import model.Calculator;
import view.Menu;

public class CalculatorMenu extends Menu {

    public static String[] choices = {"Normal Calculator", "BMI Calculator", "Exit"};
    private Calculator normalCalc = new Calculator();
    private BMICalculator bmiCalc ;

    public CalculatorMenu() {
        super("Calculator Program", choices);
    }

    public void useNormalCalc() {
        int operand;
        char operator;
        normalCalc.clear();
        operand = Input.getInt("number");
        normalCalc.setMemory(operand);
        while (true) {
            operator = Input.getOperator("operator");
            if (operator == '=') {
                System.out.println("Result:" + normalCalc.getMemory());
                break;
            } else {
                normalCalc.setOperator(operator);
            }
            if (operator == '/') {
                do {
                    operand = Input.getInt("number");
                    if (operand == 0) {
                        System.out.println("Can't divide by 0.");
                    } else {
                        break;
                    }
                } while (true);
            } else {
                operand = Input.getInt("number");
            }
            normalCalc.setOperand(operand);
            normalCalc.doCalc();
            System.out.println("Memory:" + normalCalc.getMemory());
        }
    }

    public void useBMICalc() {
        double weight,height;
        weight=Input.getDouble("weight(kg)");
        height=Input.getDouble("height(cm)");
        bmiCalc= new BMICalculator(weight, height);
        System.out.println("BMI number:"+bmiCalc.getBmiNumber());
        System.out.println("BMI Status:"+bmiCalc.getStatus());
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                useNormalCalc();
                break;
            case 2:
                useBMICalc();
                break;
            case 3:
                exitMenu();
                break;
            default:
                break;
        }
    }

}
