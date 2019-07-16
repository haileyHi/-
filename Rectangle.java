import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] v= new int[2][2];
        v[0][0] = scanner.nextInt();
        v[0][1] = scanner.nextInt();
        v[2][0] = scanner.nextInt();
        int[] answer = new int[1];
        answer[0] = v[0][0] ^ v[1][0] ^ v[2][0];
        answer[1] = v[0][1] ^ v[1][1] ^ v[2][1];

        System.out.println(answer);
    }
}
