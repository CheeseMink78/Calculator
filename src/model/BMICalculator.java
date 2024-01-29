
package model;
public class BMICalculator {
    private double weight;
    private double height;
    private double bmiNumber;
    private String status;
    public BMICalculator(double weight, double height) {
        this.weight = weight;
        this.height = height/100;
        this.bmiNumber=this.weight/(Math.pow(this.height, 2));
        if(this.bmiNumber<19) {
            this.status="Under-standard";
        }
        else if(this.bmiNumber<25) {
            this.status="Standard";
        }
        else if(this.bmiNumber<30) {
            this.status="Overweight";
        }
        else if(this.bmiNumber<40) {
            this.status="Fat - should lose weight";
        }
        else {
            this.status="Very fat - should lose weight immediately";
        }        
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmiNumber() {
        return bmiNumber;
    }

    public void setBmiNumber(double bmiNumber) {
        this.bmiNumber = bmiNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
