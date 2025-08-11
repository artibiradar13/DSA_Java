package recursion;
public class Recursion {
    public static void main(String[] args) {
        //PrintIncreasing(5);
        // PrintDecreasing(5);
        // int result = fact(3);  // Call factorial function
        //System.out.println("Factorial of " + 3 + " is: " + result);
        // for (int i = 0; i <= 4; i++) {
          //  System.out.println(fib(i));}
        // System.out.println(sumOfDigits(1234));
        // System.out.println(countDigits(1234));
        // System.out.println(power(2, 3));//p^q
        // kmultiples(5, 5);//multiples 
        System.out.println(seriessum(3));
    }
    //print n natural number---1 to n
    public static void PrintIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintIncreasing(n-1);
        System.out.println(n);

    }
    //print natural no. decresing n to 1
    public static void PrintDecreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintDecreasing(n-1);
    }
    //factorial of number 
    public static int fact(int n){
        if(n==0){
            return 1;}
        return n*fact(n-1);

    }
    //fibonacci series---
    public static int fib(int n){
        if (n<=1){return n;}
        return fib(n-1)+fib(n-2);
    }

    //sum of digits using recursion 
    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    //count of digit 
    public static int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
    
    //find p^q
    public static int power(int p,int q){
        if(q==0){return 1;}
        int pow=power(p, q/2);
        //even 
        if(q%2==0){
            return pow*pow;
        }
        //odd
        return p*pow *pow;

    }

    /*k multiples
    k=3,n=5 output = 5,10,15*/
    public static void kmultiples(int n,int k){
        if(k==1){System.out.println(n);return  ;}
        kmultiples(n,k-1);
        System.out.println(n*k);
    
    } 
    //series sum 
    // n=5 then 1-2+3-4+5=
    static int seriessum(int n){
        if(n==0){return 0;}
        if(n%2==0){
            return seriessum(n-1)-n;

        }  return seriessum(n-1)+n;
      }

}
