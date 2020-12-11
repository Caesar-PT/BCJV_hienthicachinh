import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");

//        System.out.println("Enter height");
//        int height = scanner.nextInt();
//        System.out.println("Enter wight");
//        int wight = scanner.nextInt();

        // In hình chữ nhật
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // In hình tam giác bottom-left
        for (int i = 0; i <= 5; i++){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // In hình tam giác top-left
        for (int i = 5; i >= 0; i-- ){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // In hình tam giác bottom-right
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 4 -i; j++){
                System.out.print("  ");
            }
            for (int k = 4; k >= 4 - i; k-- ){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // In hình tam giác top-right
        for (int i = 0; i < 5; i++){
            for (int j = 4; j > 4 - i; j--){
                System.out.print("  ");
            }
            for (int k = 1;k <= 5 -i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }


        // In hình tam giác cân
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
