public class EratosthenesPrimeSieve implements PrimeSieve {

    private int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {

        boolean[] arr = new boolean[p+1];
        boolean prime = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;

        }
        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                if ((i * j) >= arr.length) {
                    break;
                }
                arr[i * j] = false;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true && i == p) {
                prime = true;
            }
        }

        return prime;
    }

    @Override
    public void printPrimes() {
        boolean[] arr = new boolean[obergrenze+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;

        }
        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                if ((i * j) >= arr.length) {
                    break;
                }
                arr[i * j] = false;
            }

        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }

    public void primeAdd() {
        boolean[] arr = new boolean[obergrenze+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;

        }
        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                if ((i * j) >= arr.length) {
                    break;
                }
                arr[i * j] = false;
            }

        }

        boolean run = false;
        for (int count = 0; count < arr.length; count++) {
            for (int i = 2; i < arr.length; i++) {
                for (int j = 2; j < arr.length; j++) {
                    if ((i + j) <= arr.length) {
                        if ((count % 2) == 0) {
                            if (arr[i] == true && arr[j] == true) {
                                if ((i + j) == count) {
                                    System.out.println(count + " summe: " + count + " = " + i + " + " + j);
                                    run = true;
                                } else if (run == true) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (run == true) {
                    break;
                }
            }
            run = false;
        }
    }
}


