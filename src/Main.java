
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

        String[] plants = {"rožė", "tulpė", "orchidėja", "beržas", "ąžuolas", "gluosnis", "alyva", "chrizantema", "klevas", "begonija"};

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
            if (i % 2 == 0) {
                System.out.println(i);
            }
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
            if (i % 2 == 0) {
                counter++;
            }

            System.out.println(i);

        }
        System.out.println("count:" + counter);

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 9 užduotis ~~~~~~~~~~~~~~~~~~~~");
//9.Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai.
// (du skaičiavimai)

        int count5 = 0;
        for (String plant : plants) {
            if (plant.length() < 5) {
                count5++;
            }
        }

        System.out.println("Number of words with less than 5 characters: " + count5);

        int count7 = 0;
        for (String plant : plants) {
            if (plant.length() > 7) {
                count7++;
            }
        }

        System.out.println("Number of words with more than 7 characters: " + count7);

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 10 užduotis ~~~~~~~~~~~~~~~~~~~~");
//10.Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai.
// (tarp 5 ir 10 simbolių ilgio)

        int count = 0;
        for (String plant : plants) {
            if (plant.length() > 5 && plant.length() < 10) {
                count++;
            }

        }

        System.out.println("Number of words with more than 5 but less than 10 characters: " + count);

        System.out.println("~~~~~~~~~~~~~~~~~~~~ Sunkesni ~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~ 1 užduotis ~~~~~~~~~~~~~~~~~~~~");

//1. Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais ir suskaičiuokite
// kiek tarp jų yra didesnių už 150.  Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

        int arraySize = 300;
        int[] randomArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = (int) Math.round(Math.random() * 300);
        }
        System.out.println("Random assigned values of Array are: ");

        int countLarger150 = 0;
        for (int value : randomArray) {
            if (value > 275) {
                System.out.print("[" + value + "] ");
            } else {
                System.out.print(value + " ");
            }
            if (value > 150) {
                countLarger150++;
            }
        }
        System.out.println();
        System.out.println("# of numbers that are larger than 150: " + countLarger150);

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 2 užduotis ~~~~~~~~~~~~~~~~~~~~");
//2. Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos. Skaičius
// atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.

        boolean notFirst = false;
        for (int i = 1; i < 3001; i++) {
            if (i % 77 == 0) {
                if (notFirst) {
                    System.out.print(", ");
                }
                System.out.print(i);
                notFirst = true;
            }
        }
        System.out.println();

        String solution = "";
        for (int i = 77; i < 3001; i += 77) {
            solution += i + ", ";
        }
        System.out.println(solution.substring(0, solution.length() - 2));

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 3 užduotis ~~~~~~~~~~~~~~~~~~~~");
//3. Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”.
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *

        int rows = 25;
        int columns = 25;

        String[][] square = new String[rows][columns];

        String asterisk = "* ";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                square[i][j] = asterisk;
                System.out.print(square[i][j]);
            }
            System.out.println();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 4 užduotis ~~~~~~~~~~~~~~~~~~~~");
//4. Prieš tai nupieštam kvadratui nupieškite istrižaines zaigzdutę pakeisdami kitu simboliu.
//* * * * * * *
//* * * * * * *
//* * * * * * *
//* * * * * * *
//* * * * * * *
//* * * * * * *
//* * * * * * *

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j || (i + j + 1) == rows) {
                    square[i][j] = "o ";
                }
                System.out.print(square[i][j]);
            }
            System.out.println();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 5 užduotis ~~~~~~~~~~~~~~~~~~~~");
//5. Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius.
// Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas.
// Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
//a) Iškritus herbui;
//b) Tris kartus iškritus herbui;
//c) Tris kartus iš eilės iškritus herbui;

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 5.a užduotis ~~~~~~~~~~~~~~~~~~~~");
        while (true) {
            int coin = (int) Math.round(Math.random());

            if (coin == 1) {
                System.out.println("S");
            } else {
                System.out.println("H");
                break;
            }
        }
//b) Tris kartus iškritus herbui;
        System.out.println("~~~~~~~~~~~~~~~~~~~~ 5.b užduotis ~~~~~~~~~~~~~~~~~~~~");

        int countH = 0;
        while (true) {
            int coin = (int) Math.round(Math.random());

            if (coin == 1) {
                System.out.println("S");
            } else {
                System.out.println("H");
                countH++;
                if (countH == 3) {
                    break;
                }
            }
        }

//c) Tris kartus iš eilės iškritus herbui;
        System.out.println("~~~~~~~~~~~~~~~~~~~~ 5.c užduotis ~~~~~~~~~~~~~~~~~~~~");
        int consecutiveH = 0;
        while (consecutiveH < 3) {

            int coin = (int) Math.round(Math.random());

            if (coin == 1) {
                System.out.println("S");
                consecutiveH = 0;

            } else {
                System.out.println("H");
                consecutiveH++;
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 6 užduotis ~~~~~~~~~~~~~~~~~~~~");
//6. Kazys ir Petras žaidžia šaškėm. Petras surenka taškų kiekį nuo 10 iki 20, Kazys surenka taškų kiekį nuo 5 iki 25.
// Vienoje eilutėje išvesti žaidėjų vardus su taškų kiekiu ir “Partiją laimėjo: "laimėtojo vardas”. Taškų kiekį
// generuokite funkcija Math.random(). Žaidimą laimi tas, kas greičiau surenka 222 taškus. Partijas kartoti tol, kol
// kažkuris žaidėjas pirmas surenka 222 arba daugiau taškų.
        int petrasMin = 10;
        int petrasMax = 20;
        int kazysMin = 5;
        int kazysMax = 25;
        int petrasTotal = 0;
        int kazysTotal = 0;
        String petras = "Petras";
        String kazys = "Kazys";
        int petrasPoints;
        int kazysPoints;

        while (true) {
            petrasPoints = (int) (petrasMin + Math.round(Math.random() * (petrasMax - petrasMin)));
            kazysPoints = (int) (kazysMin + Math.round(Math.random() * (kazysMax - kazysMin)));

            if (petrasTotal < 222 && kazysTotal < 222) {
                petrasTotal += petrasPoints;
                kazysTotal += kazysPoints;

            } else if (petrasTotal >= 222) {
                System.out.println("Partiją laimėjo: " + petras);
                break;
            } else {
                System.out.println("Partiją laimėjo: " + kazys);
                break;
            }
        }
        System.out.print("Petro taškai: " + petrasTotal);
        System.out.println();
        System.out.print("Kazio taškai: " + kazysTotal);
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 7 užduotis ~~~~~~~~~~~~~~~~~~~~");
//7. Reikia nupaišyti pilnavidurį rombą, taip pat, kaip ir pilnavidurį kvadratą (https://lt.wikipedia.org/wiki/Rombas),
// kurio aukštis 21 eilutė.

        int numRows = 21;
        int spaces = numRows / 2;
        int asterisks = 1;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= asterisks; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= numRows / 2) {
                spaces--;
                asterisks += 2;
            } else {
                spaces++;
                asterisks -= 2;
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 8 užduotis ~~~~~~~~~~~~~~~~~~~~");
//8. Sumodeliuokite vinies kalimą. Įkalimo gylį sumodeliuokite pasinaudodami Math.random() funkcija. Vinies ilgis 8.5cm
// (pilnai sulenda į lentą).
//a) “Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20 mm. Suskaičiuokite kiek reikia smūgių.
//b) “Įkalkite” 5 vinis dideliais smūgiais. Vienas smūgis vinį įkala 20-30 mm, bet yra 50% tikimybė (pasinaudokite
// Math.random() funkcija tikimybei sumodeliuoti), kad smūgis nepataikys į vinį. Suskaičiuokite kiek reikia smūgių.
        System.out.println("~~~~~~~~~~~~~~~~~~~~ 8.a užduotis ~~~~~~~~~~~~~~~~~~~~");

        int nailLength = 85;
        int hitMinSmall = 5;
        int hitMaxSmall = 20;
        int hitSmall = (int) (hitMinSmall + Math.round(Math.random() * (hitMaxSmall - hitMinSmall)));
        int hitSmallNumber = 0;

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 8.b užduotis ~~~~~~~~~~~~~~~~~~~~");
        int hitMinBig = 20;
        int hitMaxBig = 30;
        int hitBig = (int) (hitMinBig + Math.round(Math.random() * (hitMaxBig - hitMinBig)));
        int hitBigNumber = 0;

        System.out.println("~~~~~~~~~~~~~~~~~~~~ 9 užduotis ~~~~~~~~~~~~~~~~~~~~");
//9. Sugeneruokite stringą, kurį sudarytų 50 atsitiktinių skaičių nuo 1 iki 200, atskirtų tarpais. Skaičiai turi būti
// unikalūs (t.y. nesikartoti). Sugeneruokite antrą stringą, pasinaudodami pirmu, palikdami jame tik pirminius skaičius
// (t.y tokius, kurie dalinasi be liekanos tik iš 1 ir patys savęs). Skaičius stringe sudėliokite didėjimo tvarka, nuo
// mažiausio iki didžiausio. (reikės split() funkcijos ir masyvų.)

        int min = 1;
        int max = 200;

        System.out.println("Sugeneruoti skaičiai: ");
        int[] rndNumbers = new int[50];
        for (int i = 0; i < 50; i++) {
            int randomNumber;
            boolean isUnique;

            do {
                isUnique = true;
                randomNumber = (int) (min + Math.round(Math.random() * (max - min)));

                for (int j = 0; j < i; j++) {
                    if (rndNumbers[j] == randomNumber) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);

            rndNumbers[i] = randomNumber;
            System.out.print(rndNumbers[i] + " ");
        }

        System.out.println();

        System.out.println("Pirminiai skaičiai: ");
        for (int i = 0; i < 50; i++) {
            if (rndNumbers[i] % 2 != 0 && rndNumbers[i] % 3 != 0 &&
                    rndNumbers[i] % 5 != 0 && rndNumbers[i] % 7 != 0 ||
                    (rndNumbers[i] == 2 || rndNumbers[i] == 3 || rndNumbers[i] == 5 || rndNumbers[i] == 7)) {
                System.out.print(rndNumbers[i] + " ");
            }
        }


    }
}