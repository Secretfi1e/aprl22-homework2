
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean check =true;
        while(check){

        System.out.println("Ekranda edile bilecek operasiyalar 1.add 2.Subtract 3.Multiply 4.Divide");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir secim edin");
        int secim = scanner.nextInt();
        System.out.println("iki eded daxil edin");
        int a = scanner.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = scanner.nextInt();



            switch (secim){

            case 1:
             Add(a,b);
                System.out.println(a+b);
                break;
            case 2:
                Subtract(a,b);
                System.out.println(a-b);
                break;
            case 3:
                Multiply(a,b);
                System.out.println(a*b);
                break;
            case 4:
               Divide(a,b);
                System.out.println(a/b);
                break;
        }

            System.out.println();

        boolean check2 = true;

        while(check2) {
            System.out.println("davam etmek isteyirsinizmi: " + "(yes-1 / no-2)");
            int choose = scanner.nextInt();
            if (choose==1){
                check=true;
                check2=false;
            }else if (choose==2){
                check=false;
                check2=false;
            }else {
                check2=true;
            }

        }
    }
    }

        public static int Add(int a, int b ){
        return a+b;

        }

        public static int Subtract(int a,int b){
        return a-b;

        }

    public static int Multiply(int a ,int b){
        return a*b;
    }

    public static int Divide(int a ,int b){
        return a/b;
    }

    }









