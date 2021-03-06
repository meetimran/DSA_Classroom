
package recursionpractice;
import java.util.Scanner;
public class RecursionPractice {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int N1, N2;
        RecursiveAlgos recObj = new RecursiveAlgos();
        
        int choice;            
        while(true)
        {
            System.out.println("\n########## RECURSION MENUE ##########");
            System.out.println("\t1. Euclidean GCD");
            System.out.println("\t2. Fibonacci Term");
            System.out.println("\t3. Fibonacci Series");
            System.out.println("\t4. Triangular Series");
            System.out.println("\t5. Sum of Squares");
	    System.out.println("\t6. Factorial ");
            System.out.println("\t7. Linear Sum");
            System.out.println("\t8. Reverse List");
            System.out.println("\t9. Binary Sum");
            System.out.println("\t10. Binary Search");
            System.out.println("\t11. Power of a Number");
            System.out.println("\t12. Sum of Digits");
            System.out.println("\t0. Exit Programe");
            System.out.println("------------------------------------");
            System.out.print("Enter Your Choice (0/1/2/3/4/5/6/7/8/9/10/11/12) : ");
            
            choice =  input.nextInt();
            
            if(choice == 1)
            {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter First Number: ");
                N1 = input.nextInt();
                while(N1<1){
                    System.out.println("Incorrect Format, please try entering a valid positive number");
                    System.out.print("\nEnter First Number: ");
                    N1 = input.nextInt();
                }
                System.out.print("\nEnter Second Number: ");
                N2 = input.nextInt();
                while(N2<1){
                    System.out.println("Incorrect Format, please try entering a valid positive number");
                    System.out.print("\nEnter Second Number: ");
                    N2 = input.nextInt();
                }
                int GCD = recObj.EuGCD(N1, N2);
                System.out.print("\nThe GCD of "+N1+" and "+N2+" : "+GCD);
            }
            else if(choice == 2)
            {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Number for Fib Term : ");
                int F = input.nextInt();
                int Term = recObj.Fibonacci(F);
                System.out.print("\nThe "+F+"th Term of Fibonacci Seireis is "+Term);
            }
            else if(choice == 3)
            {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Number of Fib Terms : ");
                int N = input.nextInt();
                int Term;
                for(int i=1; i<=N; i++)
                {
                    Term = recObj.Fibonacci(i);
                    System.out.print(Term+" ");
                }
                System.out.println();
                System.out.println("\n------------------------------------");
            }
            else if(choice == 4)
            {
		System.out.println("\n------------------------------------");
                System.out.print("Enter the Triangular Series Range : ");
                int R = input.nextInt();
                int Term = 0;
                System.out.println("The Triangular Series : ");
                for(int i=1; i<=R; i++)
                {
                    Term = recObj.Triangular(i);
                    System.out.print(Term+" ");
                }
                System.out.println();
                System.out.println("\n------------------------------------");     
            }
            else if(choice == 5)
            {
                System.out.println("\n------------------------------------");
                System.out.print("Sum of Square Range: ");
                int R = input.nextInt();
                System.out.print("The Sum of Squares of First "+R+" Integers: ");
                int SUM = recObj.SquareSum(R);
                System.out.println(SUM);
                System.out.println("\n------------------------------------"); 
            }
	    else if(choice == 6)
            {
                System.out.println("\n------------------------------------");
                System.out.print("Enter Number to Find its Factorial : ");
                int N = input.nextInt();
                System.out.print("The Factorial of "+N+" :");
                int Fact = recObj.Factorial(N);
                System.out.println(Fact);
                System.out.println("\n------------------------------------");  
            }
            
	    else if(choice == 7)
            {
                System.out.println("\n------------------------------------");
                System.out.print("Enter Number of Elements in Array : ");
                int N = input.nextInt();
                int A[] = new int[N];
                for(int i=0; i<N; ++i){
                    int no;
                    System.out.print("Enter number at position "+(i+1) + ": ");
                    no = input.nextInt();
                    A[i] = no;
                }
                int sum = recObj.LinearSum(A, A.length);
                System.out.println("\nThe Sum of Array is: " + sum);
                System.out.println("\n------------------------------------");  
            }
            
	    else if(choice == 8)
            {
                System.out.println("\n------------------------------------");
                System.out.print("Enter Number of Elements in Array : ");
                int N = input.nextInt();
                int A[] = new int[N];
                for(int i=0; i<N; ++i){
                    int no;
                    System.out.print("Enter number at position "+(i+1) + ": ");
                    no = input.nextInt();
                    A[i] = no;
                }
                
                System.out.println("Array Before:");
                for(int i: A){
                    System.out.print(i + " ");
                }
                recObj.ReverseList(A,0,A.length-1);
                
                System.out.println("\nArray After");
                for(int i:A){
                    System.out.print(i + " ");
                }
                System.out.println("\n------------------------------------");  
            }
            else if(choice == 9)
            {
                System.out.println("\n------------------------------------");
                System.out.print("Enter Number of Elements in Array : ");
                int N = input.nextInt();
                int A[] = new int[N];
                for(int i=0; i<N; ++i){
                    int no;
                    System.out.print("Enter number at position "+(i+1) + ": ");
                    no = input.nextInt();
                    A[i] = no;
                }
                int sum = recObj.BinarySum(A,0, A.length);
                System.out.println("\nThe Sum of Array is: " + sum);
                System.out.println("\n------------------------------------");  
            }
            else if(choice == 10)
            {
                System.out.println("\n------------------------------------");
                System.out.print("Enter Number of Elements in Array : ");
                int N = input.nextInt();
                int A[] = new int[N];
                for(int i=0; i<N; ++i){
                    int no;
                    System.out.print("Enter number at position "+(i+1) + ": ");
                    no = input.nextInt();
                    A[i] = no;
                }
                System.out.print("Enter Target: ");
                int target = input.nextInt();
                int T = recObj.BinarySearch(target,A,0, A.length-1);
                System.out.println("\nThe Target is at Index: " + T);
                System.out.println("\n------------------------------------");  
            }
            
            else if(choice == 11)
            {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Number: ");
                int N = input.nextInt();
                
                System.out.print("Enter Power: ");
                int P = input.nextInt();
                
                System.out.println("The Number "+N+" to the Power "+P+" results in: "+ recObj.NumPower(N,P));
                System.out.println("\n------------------------------------");
            }
            
            else if(choice == 12)
            {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Number: ");
                int N = input.nextInt();
                
                System.out.println("Sum of Digits of "+N+" is: "+recObj.sumofDigits(N));
                System.out.println("\n------------------------------------");
            }
            
            else if(choice == 0)
            {
                System.out.println("\n--------------------------------");
                System.out.println("Programe Exiting.......! \nThank You for Being Here");
                System.out.println("\n--------------------------------");
                System.exit(0);
            }
        }
    
    }
    
}
