class SmartThermostat extends SmartDevice {

    private int temperature;
    private static final int energySaving = 20;

    public SmartThermostat(String brand, String model, String status, int temperature) {
        super(brand, model, status);
        this.temperature = temperature;
    }

    @Override
    public void deviceInfo() {
        System.out.println("SmartLight - Brand: "+brand+", Model: "+model+", Status: "+status+", Temperature: "+temperature);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature >= 10 && temperature <= 30) {
            this.temperature = temperature;
            System.out.println("Temperature set to: " + temperature + "°C");
        } else {
            System.out.println("Temperature is outside the permissible range");
        }
    }
    public void increaseTemperature(){
        if (temperature < 30){
            temperature++;
            System.out.println( model + " temperature set to " + temperature + "°C");
        }else {
            System.out.println("Error");
        }

    }
    public void decreaseTemperature(){
        if (temperature > 10){
            temperature--;
            System.out.println( model + " temperature set to " + temperature + "°C");
        }else {
            System.out.println("Error");
        }
    }

    public boolean isEnergySavingMode(){

        return temperature < energySaving;
    }
}



