import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zadanie 1
        /*System.out.println("Podaj stopień wielomianu");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float [] tab = new float[n+1];
        for (int i = 0; i < tab.length ; i++) {
            System.out.println("Podaj współczynniki");
            tab[i]=scan.nextInt();
        }
        System.out.println("Podaj wartość wielomianu");
        float x = scan.nextInt();
        float w =0;
        for (int i = 1; i < tab.length; i++) {
            w+=Math.pow(x,tab.length-1)*tab[i-1];
        }
        w+=tab[tab.length-1];
        System.out.println("Rozwiązanie: "+w);*/

        //zadanie 2 nie do końca

        System.out.println("Podaj stopień wielomianu");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] tab = new int[n+1];
        for (int i = 0; i < tab.length ; i++) {
            System.out.println("Podaj współczynniki");
            tab[i]=scan.nextInt();
        }
        System.out.println("Podaj liczbe do dwumianu");
        int x = scan.nextInt();
        for (int i = 1; i < tab.length; i++) {
            tab[i]=(tab[i]+tab[i-1])*x;
        }
        int w =0;
        for (int i = tab.length-1; i >0 ; i--) {
            System.out.println(tab[w++]+ "x^" + (i-1)+" ");
        }


    }
}