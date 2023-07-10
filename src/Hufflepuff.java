public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int power, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, surname, power, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String toString() {
        return "Hufflepuff " +
                super.toString() +
                " industriousness: " + industriousness +
                ", loyalty: " + loyalty +
                ", honesty: " + honesty;
    }
    public void compareTo(Hufflepuff other) {
        int countThis = this.industriousness + this.loyalty + this.honesty;
        int countOther = other.industriousness + other.loyalty + other.honesty;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Суденты одинаково сильны");
        }
    }

    private void printComparableStudent(Hufflepuff bestStudent, Hufflepuff worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший Пуффендуец, чем  " + " " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
