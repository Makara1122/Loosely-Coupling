package looselycoupling3;

public class Circle implements Shap {
    public Circle(){}
    private double redius;
    public Circle(double redius){
        this.redius = redius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * redius *redius;
    }
}
