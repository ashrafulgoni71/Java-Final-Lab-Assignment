import java.util.Scanner;

public class InverseTheName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String inverseName = "";

        for(int i = name.length()-1; i >= 0; i--){
            inverseName += name.charAt(i);
        }
        System.out.println(inverseName);
    }
}
