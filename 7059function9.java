class TwinPrimeNumbers {
    public static void main(String[] args) {
        int limit = 100;
        System.out.println("Twin Prime Numbers less than " + limit + ":");
        findTwinPrimes(limit);
    }

    public static void findTwinPrimes(int limit) {
        for (int i = 2; i < limit; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
