import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Witaj! Podaj pierwszą cyfrę");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        System.out.println("Podaj drugą cyfrę");
        double b=scanner.nextDouble();
        System.out.println("Wybierz akcje \ndodawanie(1) \nodejmowanie(2) \nmnożenie(3) \ndzielenie(4)");
        int akcja=scanner.nextInt();
        switch (akcja){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:

                System.out.println(a*b);
                break;
            case 4:
                if(b==0){
                    System.out.println("Cholero nie dziel przez zero!");
                    break;
                }else {
                    System.out.println(a/b);
                    break;
                }
            default:
                System.out.println("Nie ma takiej metody!");


        }
    }
}
