public class Main {
    public static void main(String[] args) {
        /*ciklai:
        for
        foreach
        while - naudojam, kai nezinom, kiek kartu prasisuks
        do while

        (js kalboje)
        forin
        forout

        continue - toliau vykdo koda nuo pradines salygos
        break - sustoja vykdyti
         */

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 1 užduotis ~~~~~~~~~~~~~~~~~~~~");
//1. Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        for (int i = 0; i < 10; i++) {
            System.out.println("Labas" + i);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 2 užduotis ~~~~~~~~~~~~~~~~~~~~");
//2.Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 3 užduotis ~~~~~~~~~~~~~~~~~~~~");
//3.Sukurkite masyvą iš dešimties augalų pavadinimų.

        String[] plants = {"rožė", "tulpė", "orchidėja", "beržas", "ąžuolas", "gluosnis", "alyva", "raskila", "klevas", "begonija"};

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 4 užduotis ~~~~~~~~~~~~~~~~~~~~");
//4.Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

        for (int i = 0; i < 10; i++) {
            System.out.println(plants[i]);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 5 užduotis ~~~~~~~~~~~~~~~~~~~~");
//5.Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju.
// (atvirkščias ciklas).
        for (int i = 10 - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 6 užduotis ~~~~~~~~~~~~~~~~~~~~");
//6.Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);

        for (int i = 10; i < 51; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 7 užduotis ~~~~~~~~~~~~~~~~~~~~");
//7.Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite.
// ( naudokite continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)
        for (int i = 10; i < 51; i++) {
            if (i % 2 != 0) {
                continue;
            }
            if (i % 10 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 8 užduotis ~~~~~~~~~~~~~~~~~~~~");
//8.Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę;
        int counter = 0;
        for (int i = 0; i < 21; i++) {
            if (i % 2 != 0) {
                continue;
            }
            counter++;
            System.out.println(i);

        } System.out.println("count:" + counter);

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 9 užduotis ~~~~~~~~~~~~~~~~~~~~");
//9.Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai.
// (du skaičiavimai)

//10.Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)


    }
}