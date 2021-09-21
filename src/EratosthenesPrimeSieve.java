public class EratosthenesPrimeSieve implements PrimeSieve{

    private int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {//funktioniert ausser obergrenze = p

        boolean[] arr = new boolean[obergrenze];
        boolean prime = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=true;

        }
        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                if((i*j)>=arr.length){
                    break;
                }
                arr[i*j] = false;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==true&&i==p){
                prime = true;
            }
        }

        return prime;
    }

    @Override
    public void printPrimes() {

    }

}
