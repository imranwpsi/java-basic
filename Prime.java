
import java.io.*;

// Prime number is a number that is divisible only by itself and 1
public class Prime {
    public static void main(String args[]) throws IOException {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        for(int i = 2; i <= a; i++) {
            if(i == a) {
                System.out.println(a + " is a prime number");
            } else{
                if(a % i == 0) {
                    System.out.println(a + " is not a prime number");
                }
            }
        }
    }
}
