// Класс Reptile, производный от Animal
public class Reptile extends Animal {
    private String type; // текстовое поле для типа рептилии
    private int temperature; // числовое поле для температуры

    // Конструктор по умолчанию
    public Reptile() {
        super();
        this.type = "Unknown";
        this.temperature = 0;
    }

    // Конструктор с параметрами
    public Reptile(String name, int age, String type, int temperature) {
        super(name, age);
        this.type = type;
        setTemperature(temperature); // проверка и установка температуры
    }

    // Геттер для типа рептилии
    public String getType() {
        return type;
    }

    // Сеттер для типа рептилии
    public void setType(String type) {
        this.type = type;
    }

    // Геттер для температуры
    public int getTemperature() {
        return temperature;
    }

    // Сеттер для температуры с проверкой диапазона
    public void setTemperature(int temperature) {
        if (temperature >= -273) { // минимальная допустимая температура
            this.temperature = temperature;
        } else {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero");
        }
    }

    // Переопределяем метод toString для Reptile
    @Override
    public String toString() {
        return "Reptile{" + super.toString() + ", type='" + type + ''' + ", temperature=" + temperature + '}';
    }
}