package looselycoupling3;

public class Main {
    public static void main(String[] args) {
        Shap shap = new Rectangle(20,56);
        Shap shap1 = new Circle(25F);
        AreaCalculator areaCalculator = new AreaCalculator(shap);
        double result = areaCalculator.calculateArea();
        System.out.println("This is the area of Rectangle: " + result);
        AreaCalculator areaCalculator1 = new AreaCalculator(shap1);
        double result1 = areaCalculator1.calculateArea();
        System.out.println("This is the area of Circle: " + result1);

    }
}
