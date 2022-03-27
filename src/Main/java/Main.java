public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(55,1.71);
        System.out.println("Индекс массы тела = " +BMI);
    }
}
