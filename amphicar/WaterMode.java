package amphicar;

class WaterMode implements AmphiState {
    private WaterMode() {}
    
    private static final WaterMode instance = new WaterMode();
    
    static WaterMode getInstance() {
        return instance;
    }
    
    @Override
    public void goForward(double enginePower) {
        System.out.println("Splish splash");
    }
}
