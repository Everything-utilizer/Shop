package calculator;

import java.util.Scanner;
public class Main {
    static double B,T,I,M,D,P,sum,e1,o1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        display_item();
        income();
        expenses(sc);
}
        public static void items_price() {
            B = 202;
            T = 118;
            I = 2250;
            M = 1680;
            D = 1075;
            P = 80;
        }

        public static void display_item() {
            items_price();
            System.out.println("Prices:\n\nBubblegum: $"+B);
            System.out.println("Toffee: $"+T);
            System.out.println("Ice cream: $"+I);
            System.out.println("Milk chocolate:$"+M);
            System.out.println("Doughnut: $"+D);
            System.out.println("Pancake: $"+P);
            return;
        }

        public static void income() {
            items_price();
            sum = B+T+I+M+D+P;
            System.out.println("\nIncome: $"+sum);
        }

        public static void expenses(Scanner sc) {
            System.out.println("Enter staff expenses: ");
            e1 = sc.nextDouble();
            System.out.println("Enter other expenses: ");
            o1 = sc.nextDouble();
            double n_income = sum - (e1+o1);
            System.out.println("\nNet Income: $"+n_income);
            return;
        }
}