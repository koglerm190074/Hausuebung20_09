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
        boolean[] arr = new boolean[obergrenze];
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
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]==true){
                System.out.println(i);
            }
        }
    }

    public void primeAdd(){
        boolean[] arr = new boolean[obergrenze];
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
        /*for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                if(arr[i]==true&&arr[j]==true){
                    if((i+j)==n){
                        System.out.println(n+" summe: "+n+" = "+i+" + "+j);
                    }
                }
            }
        }*/

        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                if((i%2)==0){
                    if(arr[i]==true&&arr[j]==true){
                        if((i+j)==i){
                            System.out.println(i+" summe: "+i+" = "+i+" + "+j);
                        }
                    }
                }
            }
        }
    }

}
