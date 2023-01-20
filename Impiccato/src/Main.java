import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserire parola:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] parola = new char[input.length()];
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == ' ')
                parola[i] = ' ';
            else parola[i] = '_';
        }


        for(int j=0;j<3;j++){
            System.out.println("\nParola da indovinare:");
            for(int k=0;k<parola.length;k++)
                System.out.print(parola[k]);

            System.out.print("\nInserire lettera: ");
            String x = scanner.next();
            char a = x.charAt(0);

            for(int k=0;k<input.length();k++){
                if(input.charAt(k) == a){
                    parola[k] = a;
                }
            }
        }

        System.out.println("\nParola da indovinare:");
        for(int k=0;k<parola.length;k++)
            System.out.print(parola[k]);

        System.out.println("\nTentavi esauriti, inserire parola:");
        Scanner scanner1 = new Scanner(System.in);
        String input2 = scanner1.nextLine();
        if(input2.equals(input))
            System.out.println("HAI VINTO");
        else
            System.out.println("HAI PERSO\nLa parola è: " + "\033[4m" + input + "\033[0m");
    }
}