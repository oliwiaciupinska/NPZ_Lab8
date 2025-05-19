import java.util.Scanner;

public class Run {

    private Scanner sc = new Scanner(System.in);

    public Zadania zadania = new Zadania();

    public void start(){
        boolean exit = false;

        while(!exit){
            System.out.println(" Menu ");
            System.out.println("1. Zadanie 2.1 ");
            System.out.println("2. Zadanie 2.5 ");
            System.out.println("3. Zadanie 2.13 ");
            System.out.println("4. Zakończ prace programu ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    zadania.Zadanie2_1();
                    break;
                case 2:
                    zadania.Zadanie2_5();
                     break;
                case 3:
                    zadania.Zadanie2_13();
                     break;
                case 4:
                exit = true;
                System.out.println("Zakończenie pracy programu: ");
                break;

                default:
                    System.out.println("Nie ma takiej opcji: ");
            }
        }
        sc.close();
    }
}
