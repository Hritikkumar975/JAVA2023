

public class functions_09_7032 {
    public static void main(String[] args) {
        System.out.println("twin prime number less than 100: ");
        for(int i=2; i<100; i++){
            if (isPrime(i) && isPrime(i+2)){
                System.out.println(i + " and "+ (i+2));
            }
        }
        }
        // function to check whether a given number is prime or not
        public static boolean isPrime(int n){
            if(n<2){
                return false;

            }
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;

    }
}
