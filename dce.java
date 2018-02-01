import java.util.Scanner;
public class dce {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = 0;
        do {
            System.out.print("Enter the non-negative number you would like to convert into binary: ");
            x = in.nextInt();
        } while (x<0);
        convertBinary(x);
    }
    private static void convertBinary(int x) {
        int y = 0;
        int a = x;
        String z = "";
        if (x == 0){
            z = z + "0";
        }
        for (int i = 0; i < 2147483647; i++) {
            if (Math.pow(2,i) > x) {
                y = i - 1;
                break;
            }
        }
        for (int i=y; i>=0; i--) {
            if (Math.pow(2,i) <= x){
                x -= Math.pow(2,i);
                z = z + "1";
            }
            else {
                z = z + "0";
            }
        }
        System.out.println("The number " + a + " is equivalent to " + z + " in binary.");
    }
}