class SmartThermostat extends SmartDevice{
    private int temperature;

    public SmartThermostat(String brand,String model ,int temperature) {
        super(brand,model);
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        if (!getStatus()) {
            System.out.println(model + "Esta apagado , Encender dispositivo ");
            return;
        }
        if (temperature >= 10 && temperature <= 30) {
            this.temperature = temperature;
            System.out.println(model + " la temperatura se encuentra " + temperature + "°C");

        } else {
            System.out.println("La temperatura esta fuera del rango permtido "+ temperature+"°C");
        }
    }

    public void increaseTemperature(){
        setTemperature(this.temperature + 8 );

    }

    public void decreaseTemperature(){
        setTemperature(this.temperature - 20);

    }

    public boolean isEnergySavingMode() {
        return temperature < 20;
    }

    @Override
    public void deviceInfo() {
        String state = getStatus() ? "ENCENDIDO" : "APAGADO";
        System.out.println("SmartThermostat - Brand: " + brand + ", Model: " + model +
                ", Status: " + state + ", Temperature: " + temperature + "°C");
    }
}



