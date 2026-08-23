public class CarChanges {

    private String brand;
    private String colour;
    private int speed;
    private boolean engineState;
    private boolean headlightsOn;
    private boolean seatbeltOn;
    private boolean brakeFailure;
    private int fuelLevel;
    private boolean engineHealth;
    private String direction;

    public CarChanges() {
        this.brand = "Unknown";
        this.colour = "Unpainted";
        this.speed = 0;
        this.engineState = false;
        this.headlightsOn = false;
        this.seatbeltOn = false;
        this.brakeFailure = false;
        this.fuelLevel = 100;
        this.engineHealth = true;
        this.direction = "Straight";
    }

    public CarChanges(String brand, String colour, int speed, String direction) {

        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative");
        }

        if (!"Left".equals(direction) &&
            !"Right".equals(direction) &&
            !"Straight".equals(direction)){
            throw new IllegalArgumentException( "Invalid direction");
        }

        this.brand = brand;
        this.colour = colour;
        this.speed = speed;
        this.direction = direction;

        this.engineState = false;
        this.headlightsOn = false;
        this.seatbeltOn = false;
        this.brakeFailure = false;
        this.fuelLevel = 100;
        this.engineHealth = true;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineOn() {
        return engineState;
    }

    public boolean areHeadlightsOn() {
        return headlightsOn;
    }

    public boolean isSeatbeltOn() {
        return seatbeltOn;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public boolean hasBrakeFailure() {
        return brakeFailure;
    }

    public boolean isEngineHealthy() {
        return engineHealth;
    }

    public String getDirection() {
        return direction;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean startEngine() {

        if (fuelLevel <= 0) {
            return false;
        }

        engineState = true;
        return true;
    }

    public void stopEngine() {
        engineState = false;
        speed = 0;
    }

    public void turnHeadlightsOn() {
        headlightsOn = true;
    }

    public void turnHeadlightsOff() {
        headlightsOn = false;
    }

    public void fastenSeatbelt() {
        seatbeltOn = true;
    }

    public boolean canDrive() {
        return engineState && fuelLevel > 0 && seatbeltOn;
    }

    public void drive() {

        if (canDrive()) {
            speed = 20;
        }
    }

    public void accelerate() {

        if (!engineState) {
            return;
        }

        if (fuelLevel <= 0) {
            return;
        }

        if (!seatbeltOn) {
            return;
        }

        speed += 20;
    }

    public void brake() {

        if (speed > 0) {
            speed -= 10;

            if (speed < 0) {
                speed = 0;
            }
        }
    }

    public void turnLeft() {

        if (engineState && speed > 0) {
            direction = "Left";
        }
    }

    public void turnRight() {

        if (engineState && speed > 0) {
            direction = "Right";
        }
    }

    public void stop() {
        speed = 0;
    }

    public void refuel(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Fuel amount must be positive");
        }

        fuelLevel += amount;

        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
    }

    public boolean isSpeedTooHigh() {
        return speed >= 100;
    }
    public boolean detectEmergency() {

        return brakeFailure ||
               fuelLevel == 0 ||
               !engineHealth ||
               speed >= 100;
    }
}