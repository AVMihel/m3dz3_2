public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела:");
        System.out.println(bmi);

        System.out.println("Индекс массы тела:");
        System.out.println(service.calculate(93, 1.85));

        System.out.println("Индекс массы тела:");
        System.out.println(service.calculate(85, 1.78));
    }
}