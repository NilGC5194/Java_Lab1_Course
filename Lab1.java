public class Lab1 {

    public static void main(String[] args) {

        // rader som denna är kommentarer

        // vi deklarar en array som heter a
        int[] a = { 21, 19, 3,  15, 53, 33, 239, 233, 14, 97,
                9,  8,  45, 35, 73, 55, 731,  81, 51, 49 };

        // skriver ut en hälsning och sedan element 1 av array a (dvs värdet 19)
        System.out.println("Hello!");
        System.out.println(a[1]);

        // lösning för del 1
        System.out.println("Del 1:");
        // din kod här
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // lösning för del 2
        System.out.println("Del 2:");
        // din kod här
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);

        // lösning för del 3
        System.out.println("Del 3:");
        // din kod här
        int sum=0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println("sum:"+sum);
        System.out.println("those values from array that are greater than the sum of all even numbers in the array:");
        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                if (a[i]>sum){
                    System.out.println(a[i]);
                }
            }
        }

        // frivilligt: lösning för del 4
        System.out.println("Del 4:");
        // din kod här
        for (int i = 0; i < a.length; i++) {
            boolean isPrime = true;
            if (a[i] <= 1) {
                isPrime = false;  // 0 and 1 are not prime numbers
            } else {
                for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                    if (a[i] % j == 0) {
                        isPrime = false;
                        break;  // If it's not prime, no need to continue checking
                    }
                }
            }

            if (isPrime) {
                System.out.println("Prime number: " + a[i]);
            }
        }
    }


    /*
        int v=0;
        for (int i = 0; i < a.length; i++) {
            v=0;
            if (a[i] > 1) {
            for (int j = 2; j < a[i]; j++){
            if(a[i]%j!=0){
                v=1;
            }
            else {
                v=0;
            }
            }
                if(v==1)
                {
                    System.out.println("Primt tal:");
                    System.out.println(a[i]);
                }
            }
        }

    }*/

}