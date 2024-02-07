package looselycoupling3;

public class AreaCalculator {
    private Shap shap;
    public AreaCalculator(Shap shap){
        this.shap = shap;
    }
    public double calculateArea(){
        return shap.calculateArea();
    }
}
