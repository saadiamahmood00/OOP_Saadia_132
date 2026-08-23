public class Mainn {

    public static void main(String[] args) {

        CarChanges sportage = new CarChanges("KIA", "White", 0, "Straight");
        CarChanges HiluxRevo4x4 = new CarChanges("Toyota", "Black", 0, "Straight");

        sportage.startEngine();
        sportage.fastenSeatbelt();
        sportage.turnHeadlightsOn();
        sportage.drive();
        sportage.accelerate();
        sportage.turnLeft();

        HiluxRevo4x4.startEngine();
        HiluxRevo4x4.fastenSeatbelt();
        HiluxRevo4x4.drive();
        HiluxRevo4x4.brake();
        HiluxRevo4x4.turnRight();

        System.out.println("----- SPORTAGE -----");
        System.out.println("Brand: " + sportage.getBrand());
        System.out.println("Colour: " + sportage.getColour());
        System.out.println("Speed: " + sportage.getSpeed());
        System.out.println("Fuel Level: " + sportage.getFuelLevel());
        System.out.println("Engine On: " + sportage.isEngineOn());
        System.out.println("Seatbelt On: " + sportage.isSeatbeltOn());
        System.out.println("Direction: " + sportage.getDirection());

        System.out.println("----- HILUX REVO 4X4 -----");
        System.out.println("Brand: " + HiluxRevo4x4.getBrand());
        System.out.println("Colour: " + HiluxRevo4x4.getColour());
        System.out.println("Speed: " + HiluxRevo4x4.getSpeed());
        System.out.println("Fuel Level: " + HiluxRevo4x4.getFuelLevel());
        System.out.println("Engine On: " + HiluxRevo4x4.isEngineOn());
        System.out.println("Seatbelt On: " + HiluxRevo4x4.isSeatbeltOn());
        System.out.println("Direction: " + HiluxRevo4x4.getDirection());

        System.out.println("----- AFTER SPORTAGE STOPPED -----");
        sportage.stop();
        System.out.println("SPORTAGE Speed: "+ sportage.getSpeed());

        System.out.println("---- EMERGENCY CHECK ----");
        System.out.println("SPORTAGE: "+ sportage.detectEmergency());

        System.out.println("HILUX REVO 4X4: "+ HiluxRevo4x4.detectEmergency());
    }
}