public class Main {
    public static void main(String[] args) {

    SmartLight light = new SmartLight("Phillip", "FXZ9", "ON", 90, "Blue");
    SmartThermostat thermostat = new SmartThermostat("LG", "KBD90", "OFF", 25);
    System.out.println(light.model + " is " + light.getStatus());
    System.out.println(thermostat.model + " is " + thermostat.getStatus());
    thermostat.turnOn();
    light.deviceInfo();
    thermostat.deviceInfo();
    thermostat.setTemperature(18);
    light.changeColor("White");
    light.adjustBrightness(70);
    thermostat.increaseTemperature();
    thermostat.decreaseTemperature();
    System.out.println("Energy Saving Mode: " + thermostat.isEnergySavingMode());
    light.turnOff();

    }
}