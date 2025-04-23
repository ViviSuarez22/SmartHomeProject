public abstract class SmartDevice {
    String brand;
    String model;
    boolean status;

    public SmartDevice (String brand, String model){
    this.brand = brand;
    this.model = model;
    this.status = true;
    }

    public void turnOn(){
        status = true;
        System.out.println(model+" Esta Encendido");

    }
    public void turnOff(){
        status = false;
        System.out.println(model+" Esta Apagado");

    }
    public abstract void deviceInfo();

    public boolean getStatus() {
        return status;
    }
}
