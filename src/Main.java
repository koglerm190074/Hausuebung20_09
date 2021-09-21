import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("Geben Sie eine Obergrenze ein!!!");
            int obergrenze = Integer.parseInt(s.nextLine());
            System.out.println("Geben Sie eine zu überprüfende Zahl ein!!!");
            int prime = Integer.parseInt(s.nextLine());
            EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(obergrenze);
            if(eps.isPrime(prime)==false){
                System.out.println("Keine Primzahl");
            }else if(eps.isPrime(prime)==true){
                System.out.println("Ist eine Primzahl");
            }
            eps.printPrimes();
            System.out.println("Geben Sie eine Gerade Zahl über 1 ein!");
            int n = Integer.parseInt(s.nextLine());
            eps.primeAdd(n);
            System.out.println("Noch einmal?(j/n)");
            String answer = s.nextLine();
            if(answer.equals("n")){
                System.out.println("End!");
                running = false;
            }
        }

    }
}
