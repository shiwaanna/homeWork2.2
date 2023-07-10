public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, String surname, int power, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, surname, power, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public String toString() {
        return "Ravenclaw " +
                super.toString() +
                " mind: " + mind +
                ", wisdom: " + wisdom +
                ", wit: " + wit +
                ", creation " + creation;
    }
    public void compareTo(Ravenclaw other) {
        int countThis = this.mind + this.wisdom + this.wit + this.creation;
        int countOther = other.mind + other.wisdom + other.wit + other.creation;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Суденты одинаково сильны");
        }
    }

    private void printComparableStudent(Ravenclaw bestStudent, Ravenclaw worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший Когтевранец, чем " + " " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
