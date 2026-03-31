import java.util.Scanner;
public class HCF {
// TODO: Read two integers and print their HCF

        private static int hcf(int a, int b){
                if(b==0)
                        return a;
                return hcf(b,a%b);
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(hcf(a,b));
        }
}

