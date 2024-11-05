// Класс Predator, производный от Animal
public class Predator extends Animal {
    private String prey; // текстовое поле для жертвы
    private int speed; // числовое поле для скорости

    // Конструктор по умолчанию
    public Predator() {
        super();
        this.prey = "Unknown";
        this.speed = 0;
    }

    // Конструктор с параметрами
    public Predator(String name, int age, String prey, int speed) {
        super(name, age);
        this.prey = prey;
        setSpeed(speed); // проверка и установка скорости
    }

    // Геттер для жертвы
    public String getPrey() {
        return prey;
    }

    // Сеттер для жертвы
    public void setPrey(String prey) {
        this.prey = prey;
    }

    // Геттер для скорости
    public int getSpeed() {
        return speed;
    }

    // Сеттер для скорости с проверкой диапазона
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Speed cannot be negative");
        }
    }

    // Переопределяем метод toString для Predator
    @Override
    public String toString() {
        return "Predator{" + super.toString() + ", prey='" + prey + ''' + ", speed=" + speed + '}';
    }
}