public class Main {
    public static void main(String[] args) {
        SmartThermostat temperature = new SmartThermostat("Haceb","611 AS R600A",15);
        temperature.deviceInfo();

        temperature.turnOn();

        temperature.setTemperature(22);
        temperature.decreaseTemperature();
        temperature.increaseTemperature();

        System.out.println("Ahorro De Energia: " + temperature.isEnergySavingMode());
        temperature.turnOff();

    }
}