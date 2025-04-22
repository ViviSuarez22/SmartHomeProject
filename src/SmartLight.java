public class SmartLight extends SmartDevice{

    private int brightness;
    private String color;

    public SmartLight(String brand, String model, String status, int brightness, String color) {
        super(brand, model, status);
        this.brightness = brightness;
        this.color = color;
    }

    @Override
    public void deviceInfo() {
        System.out.println("SmartLight - Brand: "+brand+", Model: "+model+", Status: "+status+", Brihgtness: "+brightness+", Color: "+color);
    }
    public void changeColor(String newColor){
        this.color = newColor;
        System.out.println(model+" color change to " + newColor);
    }
    public void adjustBrightness(int level){
        if (level < 0) {
            this.brightness = 0;
        } else this.brightness = Math.min(level, 100);
        System.out.println(model+" brightness change to " + level);
    }
}
