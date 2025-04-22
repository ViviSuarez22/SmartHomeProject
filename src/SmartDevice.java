public abstract class SmartDevice {
    String brand;
    String model;
    String status;

    public SmartDevice (String brand, String model, String status){
    this.brand = brand;
    this.model = model;
    this.status = status;
    }

    public void turnOn(){
        status = "ON";
    }
    public void turnOff(){
        status = "OFF";
    }
    public abstract void deviceInfo();

    public String getStatus() {
        return this.status;

    }
}
