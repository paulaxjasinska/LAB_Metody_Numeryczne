import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //bisekcja();
        sieczne();
    }
    // zadanie 1 bisekcja
    public static void bisekcja(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj stopien wielomianu");
        int n = scanner.nextInt();

        double wspolczynniki[] = new double[n+1];
        for(int i = wspolczynniki.length-1; i >=0; i--){
            System.out.print("x^" + (i)+ ": ");
            wspolczynniki[i] = scanner.nextDouble();
        }

        System.out.println("Podaj a");
        double a = scanner.nextDouble();

        System.out.println("Podaj b");
        double b = scanner.nextDouble();

        System.out.println("Podaj dokladnosc");
        double epsilon = scanner.nextDouble();

        double srednia = 0;

        while(Math.abs(a-b)>epsilon){
            srednia = (a+b)/2;
            if(wartoscFunkcji(wspolczynniki, srednia)==0){
                System.out.println(srednia);
                break;
            }else if(wartoscFunkcji(wspolczynniki, srednia) * wartoscFunkcji(wspolczynniki, a) < 0) {
                b = srednia;
            } else {
                a = srednia;
            }
        }

        System.out.println(srednia);
    }
    public static double wartoscFunkcji(double wspolczynniki[], double x){
        double wartosc = 0;
        for(int i = wspolczynniki.length-1; i >=0; i--){
            wartosc +=Math.pow(x,i)*wspolczynniki[i];
        }
        return wartosc;
    }
    //zadanie 2 styczne, Newtona
    public static void sieczne(){
        Scanner scanner = new Scanner(System.in);
        int maxIteracje=100;
        System.out.println("Podaj stopien wielomianu");
        int n = scanner.nextInt();
        double wspolczynniki[] = new double[n+1];
        for(int i = wspolczynniki.length-1; i >=0; i--){
            System.out.print("x^" + (i)+ ": ");
            wspolczynniki[i] = scanner.nextDouble();
        }

        System.out.println("Podaj a");
        double a = scanner.nextDouble();

        System.out.println("Podaj b");
        double b = scanner.nextDouble();

        System.out.println("Podaj dokladnosc");
        double epsilon = scanner.nextDouble();
        double x0 = a;
        double x1 = b;

        double fx0 = wartoscFunkcji(wspolczynniki,x0);
        double fx1 = wartoscFunkcji(wspolczynniki,x1);
        double x2 = 0;

        int iteracje = 0;
        while (iteracje < maxIteracje){
            double dfdx = (fx1 - fx0) / (x1 - x0);
            x2 = x1 - fx1 / dfdx;
            double fx2 = wartoscFunkcji(wspolczynniki, x2);

            if (Math.abs(fx2) < epsilon) {
                System.out.println(x2);
                return;
            }

            x0 = x1;
            fx0 = fx1;
            x1 = x2;
            fx1 = fx2;
            iteracje++;
        }
    }
    public static double obliczWartoscPochodnej(double[] wspolczynniki, double x) {
        double value = 0;
        for (int i = 0; i < wspolczynniki.length-1; i++) {
            value += (wspolczynniki.length-1 - i) * wspolczynniki[i] * Math.pow(x, wspolczynniki.length-1 - i - 1);
        }
        return value;
    }

}