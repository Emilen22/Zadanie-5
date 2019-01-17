public class Metods {
    boolean isEven(int calkowita) {
        return calkowita % 2 == 0;
    }
    boolean isOdd(int calkowita) {
        return  calkowita % 2 == 1;
    }
    double circleField( double r) {
        double Pi = 3.14;
        int kwadrat = 2;
        return  Pi * Math.pow(r,kwadrat);
    }
    double power(int calkowita) {
        int kwadrat = 2;
        return Math.pow(calkowita,kwadrat);
    }
}
