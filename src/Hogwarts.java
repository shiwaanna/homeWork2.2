public class Hogwarts {
    private String name;
    private String surname;
    private int power;
    private int transgression;

    public Hogwarts(String name, String surname, int power, int transgression) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
