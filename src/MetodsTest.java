public class MetodsTest {
    public static void main(String[] args) {
        Metods metods = new Metods();
        boolean isEvenResult = metods.isEven(28);
        System.out.println(isEvenResult);

        boolean isOddResult = metods.isOdd( 28);
        System.out.println(isOddResult);

        double circleField = metods.circleField(3.14,8.2);
        System.out.println(circleField);

        double power = metods.power(17, 2);
        System.out.println(power);
    }
}
