class Solution {
    public int[] AllPrimeFactors(int N) {
        // Create a list to store unique prime factors
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (N % i == 0) {
                primeFactors.add(i);
                while (N % i == 0) {
                    N /= i;
                }
            }
        }
        
        int[] result = new int[primeFactors.size()];
        for (int j = 0; j < primeFactors.size(); j++) {
            result[j] = primeFactors.get(j);
        }
        return result;
    }
}

