
package model;
public class Calculator {
    private int memory;
    private int operand;
    private char operator;

    public Calculator() {
        this.memory=0;
        this.operand=0;
        this.operator='0';
    }

    public Calculator(int operand) {
        this.operand = operand;
        this.memory=operand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getOperand() {
        return operand;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public boolean doCalc(){
        switch(operator) {
            case '+':this.memory+=this.operand;break;
            case '-':this.memory-=this.operand;break;
            case '*':this.memory*=this.operand;break;
            case '/':{
                if(this.operand==0) return false;
                this.memory/=this.operand;
                break;
            }
            case '^':this.memory=(int) Math.pow(memory, operand);break;
            default: return false;
        }
        return true;
    }
    public void clear() {
        this.memory=0;
        this.operand=0;
        this.operator='0';
    }
    
    
}
