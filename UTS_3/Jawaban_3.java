package UTS_3;
import java.util.Scanner;
public class Jawaban_3 {
       public static int reverse(int number){
           int reversed = 0, digit;
           
          while (number != 0) {
            digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
         return reversed;  
    }
       
       public static boolean isPalindrom(int number){
       return (number == reverse(number));    
    }
    
        public static void main(String[] args) {
            int N;
            
        Scanner integer = new Scanner(System.in);

        System.out.print("Masukan Bilangan Bulat: ");
         N = integer.nextInt();
         
            if(isPalindrom(N)){
                System.out.println(N + " adalah Palindrom");
                    }else{
                System.out.println(N + " bukan Palindrom");
                    }
            reverse(N);
    }
}
