package lt.giedre.app;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        // 0. Hw
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("-------------");

        // 1. Kintamieji
        // ... Deklaracija
        int i;

        // Deklaracija + inicializacija
        int j = 5;
        int z = 5;

        // Uniary operator (post-increment)
        j++; // j+=1 ;; j=j+1;

        // ... unary pre-increment operator
        System.out.println(++j);
        System.out.println(j++); // reikšmė pasikeičia po šitos eilutės

        // Binary operator
        int result = z + j;
        // System.out.print(result);

        // "+" overloaded operator
        System.out.println(5 + 6); // 11
        System.out.println("5" + "6"); // 56
        System.out.println("5" + 6); // 56
        System.out.println(5 + "6"); // 56

        // cast'ing
        double d = 5.9;
        int di = (int)d;
        System.out.println(di); // skaičius po kablelio yra numetamas

        float f1 = 5.9f;
        double d1 = f1; // priskirti galime be cast'o

        double d2 = 5.9;
        float f2 = (float)d2; // reikia castinti,nes duoble yra didesnis (rizika prarasti duomenis)

        // String
        String s1 = "\uD83E\uDDE0 \uD83E\uDDB7 \uD83E\uDDB4";
        System.out.println(s1);

        // ... equality
        String s2 = "ABC";
        String s3 = new String("ABC");
        System.out.println(s2 == s3); // netaisyklingas būdas
        System.out.println(s2.equals(s3));
        System.out.println(!
                (s2.equals(s3) // true ==> !true == false
                ));

        // ... int equality
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2);

        // ...
        System.out.println("-------------");
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("ABC".endsWith("BC"));
        System.out.println("ABC".endsWith("bc"));
        System.out.println("ABC".toLowerCase());
        System.out.println("ABC".toLowerCase().endsWith("bc"));
        System.out.println("ABC".length());
        System.out.println("ABC".replace("A","Z"));
        System.out.println("ABC".replace('A', 'Z'));
        //

        // ... StringBiulder
        // ... imutability of strings
        System.out.println("... StringBiulder");
        String s4 = "ABC";
        String s5 = s4;
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        s4 += "D"; // ... pridėjus raidę, buvo sukuratas naujas kintamasis
        System.out.println(System.identityHashCode(s4));

        // ... using StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("abc ");
        builder.append("abc ");
        builder.append("abc ");
        builder.append("abc ");
        builder.append("abc ");
        builder.append("abc ");
        System.out.println(builder.toString());

        // ... If condition
        int age = 17;
        if(age > 18){ // amžiaus daugiau nei 18-niolika
            System.out.println("Galima pirkti alkoholį");
        } else { // ... jei ne
            System.out.println("Negalima pirkti alkoholio");
        }

        if(age > 18){ // amžiaus daugiau nei 18-niolika
            System.out.println("Galima pirkti alkoholį");
        } else if(age == 18) {
            System.out.println("Galima pirkti alkoholį");
        } else { // ... jei ne
            System.out.println("Negalima pirkti alkoholio");
        }

        // ... panaikingame else if panaudoję >= (daugiau arba lygu)
        // (age > 18 || age = 18) == (age >= 18)
        if(age >= 18){ // amžiaus daugiau nei 18-niolika
            System.out.println("Galima pirkti alkoholį");
        } else { // ... jei ne
            System.out.println("Negalima pirkti alkoholio");
        }

        age = 21;
        if(age < 18){
            System.out.println("Negalima nei prikti nei gerti");
        } else if(age >= 18 && age < 21){
            System.out.println("Galima gerti, bet negalima pirkti");
        } else {
            System.out.println("Galima gerti, ir pirkti");
        }

        // ... switch()
        System.out.println("... switch()");
        String name = "Petras";
        switch (name){ // char, byte, short, int, enum, String
            case "Jonas":
                System.out.println("Sveikas Jonai");
                break; // būtinas jei norime tik vieną
            case "Mindaugas":
                System.out.println("Sveikas Mindaugai");
                break;
            default:
                System.out.println("Sveiki!");
        }

        double d3 = 55.5;
        // switch(d3){ } // ... Incompatible types. Found: 'double', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
        int i4 = 5;
        switch (i4){
            case (short)5: System.out.println("Shortai!");
        }

        // ... Loops
        // ... while
        System.out.println("... while");
        int counter = 5;
        while(counter > 0){
            System.out.println(counter);
            counter = counter - 1;
        }
        // while(true){}

        int x1 = 5;
        for( ; x1 > 0; ){
            System.out.println(x1);
            // ..
            // ..
            // ..
            x1 = x1 - 1;
        }
        // infinite loop
        // for( ; ; ){
        //     System.out.println("Labas");
        // }

        for(x1 = 5; x1 > 0 ; )
            System.out.println("Labas : " + --x1); //jei nera curly skliaustu tai paima tik pirma eilute
        System.out.println("Labas už ciklo"); // nėra ciklo dalis

        for (int k = 0; k < 5; k++) {
            System.out.println(">");
            // k++ / --k
        }

        // ... Getting user input
        // ... import java.util.Scanner;
        // Scanner sc = new Scanner(System.in);  // Create a Scanner object
        //
        // System.out.print("Enter username, please: ");
        // String userName = sc.nextLine();  // Read user input - laukia vartotojo įvesties ir enter paspausto
        //
        // System.out.print("Enter password, please: ");
        // String password = sc.nextLine();  // Read user input - laukia vartotojo įvesties ir enter paspausto
        //
        // System.out.println("Username is: " + userName + " and the password is: " + password);  // Output user input

        // ... do-while
        System.out.println("... do-while");
        Scanner sc1 = new Scanner(System.in);
        String userInput = null;
        String psw = "poiuytr";
        do {
            System.out.print("Please enter password: ");
            userInput = sc1.nextLine();
        } while(!userInput.equals(psw)); // while userinput is not equal to password, do x
        System.out.println("You are logged in!");

        // ... for ciklo sudėtingesnė sintaksė
        int abc = 5;
        for (int k = 0, k2 = 0; k < 5 && k2 < 9 ; k++, k2++, abc++) { }

        // ... enhanced for
        System.out.println("... enhanced for");
        String[] myAwesomeArray = { "1", "2", "3", "4", "5" }; // masyvo deklaracija ir inicializacija
        for (String manoPasirinktasTarpinioKintamojoVardas : myAwesomeArray) {
            System.out.println(manoPasirinktasTarpinioKintamojoVardas);
        }

        // ... equivalent to enhanced for
        for(int u = 0; u < myAwesomeArray.length; u++){
            System.out.println(myAwesomeArray[u]);
        }
        // ... How to reverse string in Java
        System.out.println("... How to reverse string in Java");
        String str = "alus";
        String reversedString = new StringBuffer(str).reverse().toString();
        System.out.println(reversedString);

        String input = "alus"; // 4
        // toCharArray() method to convert string into char[].
        char[] charArr = input.toCharArray();
        char[] resArr = new char[charArr.length];
        // Store result in reverse order into the result byte[]
        for (int idx = 0; idx < charArr.length; idx++)
            resArr[idx] = charArr[charArr.length - idx - 1]; // pradžioje charArr.length - i - 1 = 3
        System.out.println(resArr);


        // ... break and continue
        System.out.println("... break and continue");
        int[] intArr = { 1, 15, 256, 5465, 121, 548, -55, 549, -5155156 };

        // ... find first negative number
        for (int k = 0; k < intArr.length; k++) {
            if(intArr[k] < 0){
                System.out.println(intArr[k]);
                break;
            }
            System.out.println("Už if'o!");
        }
        System.out.println("Už ciklo!");

        // ... find all
        for (int k = 0; k < intArr.length; k++) {
            if(intArr[k] < 0) System.out.println(intArr[k]);
        }

        // ... continue
        System.out.println("... continue");
        for (int k = 0; k < intArr.length; k++) {
            if(intArr[k] < 0) {
                System.out.println("Neigiamas: " + intArr[k]);
                continue;
            }
            // jei intArr[k] < 0 == true, tai šios eilutės nevykdysime
            System.out.println("Teigiamas: " + intArr[k]);
        }

        // ... arrays
        System.out.println("... arrays");
        int[] intArr2 = { 1, 15 }; // length == 2, tačiau nariai tik 0, 1
        for (int k = 0; k < 5; k++) {
            // java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
            // System.out.println(intArr2[k]);
        }
        // k jau neegzistuoja

        System.out.println("intArr2.length: " + intArr2.length);

        // ... fixed size
        int[] arr3 = new int[2]; // masyvo dydis yra aprašomas šioje vietoje: new int[2]
        arr3[0] = 0;
        arr3[1] = 1;
        // arr3[2] = 2; // java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        arr3[1] = 55;
        System.out.println("arr3[1]: " + arr3[1]);

        // ... array initialization:
        int[] intArr21 = new int[2];
        intArr21[0] = 5; // adding a variable
        int[] intArr22 = new int[]{ 1, 15 }; // + declaration of internal variables
        int[] intArr23 = { 1, 15 }; // + declaration of internal variables

        // String[] s = new String[5];
        // s = new int[5];

        float[] fArr = new float[5];
        // double[] dArr = fArr; // negalime priskirti kito tipo masyvo

        double d6 = 99.9;
        fArr[0] = (float)d6; // galime su castingu priskirti

        // ... Išvardinti kas antrą narį.
        System.out.println("Išvardinti kas antrą narį.");
        String[] myAwesomeArray2 = { "1", "2", "3", "4", "5" }; // masyvo deklaracija ir inicializacija
        for (int k = 0; k < myAwesomeArray2.length; k += 2) {
            System.out.println(myAwesomeArray2[k]);
        }

        // "0 , 1 , 2 ... , 4"
        for (int k = 0; k < 5; k++) {
            System.out.println(k); // 0 ... 4
        }

        // ... Išvardinti narius iš dviejų vienodo ilgio masyvų vienu ciklu.
        System.out.println("Išvardinti narius iš dviejų vienodo ilgio masyvų vienu ciklu.");
        String[] myAwesomeArray3 = { "1", "2", "3", "4", "5" };
        String[] myAwesomeArray4 = { "5", "4", "3", "2", "1" };
        System.out.println("myAwesomeArray3.length: " + myAwesomeArray3.length);
        // for (int k = 0; k < myAwesomeArray3.length; k++) {
        //     System.out.println(myAwesomeArray3[k] + " -- " + myAwesomeArray4[k]);
        // }

        for (int k = 0, k2 = 0; k < myAwesomeArray3.length && k2 < myAwesomeArray4.length; k++, k2++) {
            System.out.println(myAwesomeArray3[k] + " -- " + myAwesomeArray4[k2]);
        }

        // ... filtravimas
        int[] intArr3 = { 1, 4, 15, 256, 0, 5465, 121, 548, -55, 549, -5155156, 22, 12 };
        for (int k = 0; k < intArr3.length; k++) {
            // jei liekana dalinant iš dviejų (ne)lygi nuliui (a.k.a (ne)lyginis)
            if (intArr3[k] % 2 != 0){
                System.out.println("intArr3[" + k + "]: " + intArr3[k]);
            }
        }

        // ... kaip iš jau turimo masyvo viršuje, pasigaminti antrą masyvą, kuris turėtų tik lyginius skaičius.
    }
}
