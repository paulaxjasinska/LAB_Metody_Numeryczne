import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        trapezy();
    }
    public static void trapezy(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj przedział a: ");
        int a = scan.nextInt();
        System.out.println("Podaj przedział b: ");
        int b = scan.nextInt();
        System.out.println("Podaj stopien wielomianu");
        int n = scan.nextInt();

        double wspolczynniki[] = new double[n+1];
        for(int i = wspolczynniki.length-1; i >=0; i--){
            System.out.print("x^" + (i)+ ": ");
            wspolczynniki[i] = scan.nextDouble();
        }
        double s = ((b-a)/2)*(wartoscFunkcji(wspolczynniki,a)+wartoscFunkcji(wspolczynniki,b));
        int c = b-a;
        double B =(Math.pow(c,3)*2)/12;
        System.out.println("Rozwiązanie wg Trapezów: "+s+ " Błąd: "+B);
        double s2 = ((b-a)/6)*(wartoscFunkcji(wspolczynniki,a)+wartoscFunkcji(wspolczynniki,b)+4*wartoscFunkcji(wspolczynniki,(a+b)/2));
        double B2 = (Math.pow(c,5)*0)/90;
        System.out.println("Rozwiązanie Simpsona: "+s2+ " Błąd: "+B2);
        }
        public static double wartoscFunkcji(double wspolczynniki[], double x){
        double wartosc = 0;
        for(int i = wspolczynniki.length-1; i >=0; i--){
            wartosc += Math.pow(wspolczynniki[i],2);
        }
        return wartosc;
    }
}