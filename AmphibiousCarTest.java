import amphicar.AmphibiousCar;

public class AmphibiousCarTest {
    public static void main(String[] args) {
        AmphibiousCar car = new AmphibiousCar();
        car.forward();
        car.switchToWaterMode();
        car.forward();
        car.switchToLandMode();
        car.forward();
    }
}
