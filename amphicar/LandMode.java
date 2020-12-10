package amphicar;

class LandMode implements AmphiState
{
    @Override
    public void goForward(double enginePower) {
        System.out.println("Vroom vroom");
    }
}
