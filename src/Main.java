public class Main {
    public static void main(String[] args) {
        Griffindor garry = new Griffindor("Harry", "Potter",
                47, 47, 27, 21, 39);
        Griffindor hermione = new Griffindor("Hermione", "Granger",
                57, 49, 34, 63, 58);
        Griffindor ron = new Griffindor("Ron", "Weasley",
                25, 33, 14, 20, 11);

        Hufflepuff zachariah = new Hufflepuff("Zachariah", "Smith",
                21, 17, 59, 66, 21);
        Hufflepuff cedric = new Hufflepuff("Cedric", "Diggry",
                57, 21, 13, 40, 10);
        Hufflepuff jusrtin = new Hufflepuff("Jusrtin", "Finch - Fletchley",
                15, 23, 32, 19, 15);

        Ravenclaw cho = new Ravenclaw("Cho", "Chang",
                41, 52, 37, 45, 29, 55);
        Ravenclaw padma = new Ravenclaw("Padma", "Patil",
                19, 29, 40, 21, 59, 11);
        Ravenclaw marcus = new Ravenclaw("Marcus", "Belby",
                15, 21, 43, 25, 60, 9);

        Slytherin draco = new Slytherin("Draco", "Malfoy",
                27, 37, 45, 13, 47, 10, 56);
        Slytherin graham = new Slytherin("Graham", "Montague",
                9, 12, 11, 20, 42, 11, 17);
        Slytherin gregory = new Slytherin("Gregory", "Goyle",
                25, 33, 7, 3, 11, 23, 24);

        System.out.println(cho);
        System.out.println(hermione);

        ron.compareTo(garry);
        jusrtin.compareTo(zachariah);
        padma.compareTo(cho);
        gregory.compareTo(graham);


        draco.compareTo(cedric);
        marcus.compareTo(gregory);
    }
}