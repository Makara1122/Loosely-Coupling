package looselycoupling3;

public class Rectangle implements Shap{

    private double width,height;
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(){}
    @Override
    public double calculateArea() {
        return height * width;
    }
}
