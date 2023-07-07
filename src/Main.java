public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = new Griffindor[]{
                new Griffindor("Harry", "Potter", 47, 47, 27, 21, 39),
                new Griffindor("Hermione", "Granger", 57, 49, 34, 63, 58),
                new Griffindor("Ron", "Weasley", 25, 33, 14, 20, 11),
        };

        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Name " + griffindor.getName() + " surname " + griffindor.getSurname() + ": power: "
                    + griffindor.getPower() + "; transgression: " + griffindor.getTransgression() + "; nobility: "
                    + griffindor.getNobility() + "; honor: " + griffindor.getHonor() + "; bravery: "
                    + griffindor.getBravery());
        }
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah", "Smith", 21, 17, 59, 66, 21),
                new Hufflepuff("Cedric", "Diggry", 57, 21, 13, 40, 10),
                new Hufflepuff("Jusrtin", "Finch - Fletchley", 15, 23, 32, 19, 15),
        };

        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Name " + hufflepuff.getName() + " surname " + hufflepuff.getSurname() + ": power: "
                    + hufflepuff.getPower() + "; transgression: " + hufflepuff.getTransgression() + "; industriousness: "
                    + hufflepuff.getIndustriousness() + "; loyalty: " + hufflepuff.getLoyalty() + "; honesty: "
                    + hufflepuff.getHonesty());
        }
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Cho", "Chang", 41, 52, 37, 45, 29, 55),
                new Ravenclaw("Padma", "Patil", 19, 29, 40, 21, 59, 11),
                new Ravenclaw("Marcus", "Belby", 15, 21, 43, 25, 60,9),
        };

        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Name " + ravenclaw.getName() + " surname " + ravenclaw.getSurname() + ": power: "
                    + ravenclaw.getPower() + "; transgression: " + ravenclaw.getTransgression() + "; mind: "
                    + ravenclaw.getMind() + "; wisdom: " + ravenclaw.getWisdom() + "; wit: "
                    + ravenclaw.getWit() + "; creation: "  + ravenclaw.getCreation());
        }
        Slytherin[] slytherins = {
                new Slytherin("Draco", "Malfoy", 27, 37, 45, 13, 47, 10, 56),
                new Slytherin("Graham", "Montague", 9, 12, 11, 20, 42, 11, 17),
                new Slytherin("Gregory", "Goyle", 25, 33, 7, 3, 11,23,24),
        };

        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Name " + slytherin.getName() + " surname " + slytherin.getSurname() + ": power: "
                    + slytherin.getPower() + "; transgression: " + slytherin.getTransgression() + "; cunning: "
                    + slytherin.getCunning() + "; determination: " + slytherin.getDetermination() + "; ambition: "
                    + slytherin.getAmbition() + "; resourcefulness: "
                    + slytherin.getResourcefulness() + "; lustForPower; " + slytherin.getLustForPower());
        }
    }
}