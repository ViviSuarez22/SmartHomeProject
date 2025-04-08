public class SmartLight {
    private int brightness; // nivel de brillo (0 a 100)
    private String color;   // color de la luz

    // Constructor
    public SmartLight(int brightness, String color) {
        setBrightness(brightness);
        this.color = color;
    }

    // Método para cambiar el color de la luz
    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Color cambiado a: " + newColor);
    }

    // Método para ajustar el brillo entre 0 y 100
    public void adjustBrightness(int level) {
        setBrightness(level);
        System.out.println("Brillo ajustado a: " + brightness);
    }

    // Setter privado que asegura que el brillo esté entre 0 y 100
    private void setBrightness(int level) {
        if (level < 0) {
            this.brightness = 0;
        } else if (level > 100) {
            this.brightness = 100;
        } else {
            this.brightness = level;
        }
    }

    // Getters opcionales
    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }
}
