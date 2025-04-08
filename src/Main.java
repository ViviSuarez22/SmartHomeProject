public class Main {
    public static void main(String[] args) {
        SmartThermostat temperature = new SmartThermostat(10);
        temperature.seeInfo();

        temperature.setTemperature(50);

    }
}