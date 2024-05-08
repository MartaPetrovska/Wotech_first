public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            boolean isAPrimeNumber = isPrime(i);
            System.out.println(i + " is a prime number - " + isAPrimeNumber);
        }
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
