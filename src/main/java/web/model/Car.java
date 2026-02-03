package web.model;

public class Car {
    private String model;
    private String color;
    private int yearOfRelease;  // Исправлено название

    public Car() {
    }

    public Car(String model, String color, int yearOfRelease) {
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;  // Исправлено
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfRelease() {  // Исправлено название геттера
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {  // Исправлено название сеттера
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfRelease=" + yearOfRelease +  // Исправлено
                '}';
    }
}