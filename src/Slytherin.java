public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int power, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return "Slytherin " +
                super.toString() +
                " cunning: " + cunning +
                ", determination: " + determination +
                ", ambition: " + ambition +
                ", resourcefulness " + resourcefulness +
                ", lustForPower: " + lustForPower;
    }
    public void compareTo(Slytherin other) {
        int countThis = this.cunning + this.determination + this.ambition +
                this.resourcefulness + this.lustForPower;
        int countOther = other.cunning + other.determination + other.ambition +
                other.resourcefulness + this.lustForPower;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Суденты одинаково сильны");
        }
    }

    private void printComparableStudent(Slytherin bestStudent, Slytherin worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший Слизеринец, чем " + " " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
