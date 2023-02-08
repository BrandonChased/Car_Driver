public class Driver extends Car {

    public void drive() {
        this.setGas(getGas() - 1);
        System.out.println("You Drive the car...");
        System.out.printf("Gas remaining: %s/10 %n", getGas());
    }

    public void useBoost() {
        if(getGas() == 0) {
            System.out.println("Gameover");
        }
        else if(getGas() < 3) {
            System.out.println("Insufficent gas to use such method");
        }else {
            this.setGas(getGas() - 3);
            System.out.println("You booseted the car...");
            System.out.printf("Gas remaining: %s/10 %n", getGas());
        }
    }

    public void refuel() {
        if(getGas() == 0) {
            System.out.println("Gameover");
        }
        else if(getGas() > 8){
            System.out.println("Refueling unnecessary");
        }else {
            this.setGas(getGas() + 2);
            System.out.println("You refueled the car...");
            System.out.printf("Gas remaining: %s/10 %n", getGas());
        }
    }
}
