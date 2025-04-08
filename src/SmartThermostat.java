class SmartThermostat {
    private int temperature;

    public SmartThermostat(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature >= 10 && temperature <= 30)
            this.temperature = temperature;
        else {
            System.out.println("La temperatura esta fuera del rango permtido " + temperature);
        }
    }
    public void seeInfo(){
        System.out.println("La temperatura se encuentra dentro del rango permitido "+ temperature);
    }
}



