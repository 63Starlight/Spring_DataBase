// Класс Fish, производный от Animal
public class Fish extends Animal {
    private String waterType; // текстовое поле для типа воды
    private double length; // числовое поле для длины

    // Конструктор по умолчанию
    public Fish() {
        super();
        this.waterType = "Unknown";
        this.length = 0.0;
    }

    // Конструктор с параметрами
    public Fish(String name, int age, String waterType, double length) {
        super(name, age);
        this.waterType = waterType;
        setLength(length); // проверка и установка длины
    }

    // Геттер для типа воды
    public String getWaterType() {
        return waterType;
    }

    // Сеттер для типа воды
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    // Геттер для длины
    public double getLength() {
        return length;
    }

    // Сеттер для длины с проверкой диапазона
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length cannot be negative");
        }
    }

    // Переопределяем метод toString для Fish
    @Override
    public String toString() {
        return "Fish{" + super.toString() + ", waterType='" + waterType + ''' + ", length=" + length + '}';
    }
}