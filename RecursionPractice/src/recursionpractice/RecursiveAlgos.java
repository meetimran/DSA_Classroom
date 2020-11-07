package recursionpractice;
public class RecursiveAlgos {
    int Factorial(int N){
        if (N==0){
            return 1;
        }
        else{
            return N*Factorial(N-1);
        }
    }
    int LinearSum(int A[], int N){
        if (N==1){
            return A[N-1];
        }
        else{
            return A[N-1] + LinearSum(A, N-1);
        }
        
    }
}
