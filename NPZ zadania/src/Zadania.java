import java.util.Scanner;

public class Zadania {

    public void Zadanie2_1(){
        int a = 15; int b = 5;
        System.out.println("Suma: "+(a+b));
        System.out.println("Różnica: "+(a-b));
        System.out.println("Iloczyn: "+(a*b));
        System.out.println("Iloraz: "+(a/b));
    }

    public void Zadanie2_5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj zmienna rzeczywista X");
        double a = sc.nextDouble();

        System.out.println("Pierwsze działanie  " + (a + 1/a ));

        if(a == 0) {
            System.out.println("Nie można dzielic przez zero");
        } else {
            double b = Math.sin(2 + a) + Math.pow(Math.cos(2 + a), 2);
            System.out.println("Drugie działanie " + b);
        }

        double c = a * a + 3 * a -8;
        System.out.println("Trzecie działanie " + Math.sqrt(c));

    }


    public void Zadanie2_13(){
        String wynik;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaja ocenę od 5 do 2");
        int ocena = sc.nextInt();
        switch(ocena){
            case 2:
                wynik = "niedostateczny";
                break;
            case 3:
                wynik = "dostateczny";
                break;
            case 4:
                wynik = "dobry";
                break;
            case 5:
                wynik = "dobry";
                break;
            default:
                wynik = "nie ma takie oceny";
                break;
        }
        System.out.println("Ocena słowna: " + wynik);

    }
}
