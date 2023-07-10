public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int power, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public String toString() {
        return "Griffindor " +
                super.toString() +
                " nobility: " + nobility +
                ", honor: " + honor +
                ", bravery: " + bravery;
    }
    public void compareTo(Griffindor other) {
        int countThis = this.nobility + this.honor + this.bravery;
        int countOther = other.nobility + other.honor + other.bravery;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Суденты одинаково сильны");
        }
    }

    private void printComparableStudent(Griffindor bestStudent, Griffindor worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший Гриффиндорец, чем  " + " " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
