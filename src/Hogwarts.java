public abstract class Hogwarts {
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

    public String toString() {
        return "name '" + name + '\'' + ", surname '" + surname + '\'' +
                ", power: " + power + ", transgression: " + transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void compareTo(Hogwarts other) {
        int countThis = this.power + this.transgression;
        int countOther = other.power + other.transgression;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Суденты одинаково сильны");
        }
    }

    private void printComparableStudent(Hogwarts bestStudent, Hogwarts worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " сильнее чем " + " " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
