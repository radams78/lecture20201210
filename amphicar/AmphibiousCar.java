package amphicar;

public class AmphibiousCar {
    private AmphiState state;
    private double enginePower;
    
    public AmphibiousCar() {
        switchToLandMode();
    }
    
    public void forward() {
        state.goForward(enginePower);
    }
    
    public void switchToWaterMode() {
        state = WaterMode.getInstance();
    }
    
    public void switchToLandMode() {
        state = new LandMode();
    }
}
