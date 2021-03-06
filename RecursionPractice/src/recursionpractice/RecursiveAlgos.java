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
    void ReverseList(int A[],int i,int j){
        int temp;
        if (i<j){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            ++i;
            --j;
            ReverseList(A,i,j);
        }
    }
    int EuGCD(int A,int B){
        if (B>A){
            int temp = A;
            A = B;
            B = temp;
        }
        int R = A%B;
        if (R==0){
            return B;
        }
        else{
            return EuGCD(B,R);
        }
    }
    int Fibonacci(int F){
        if(F<=1){
            return F;
        }
        else{
            return Fibonacci(F-1)+Fibonacci(F-2);                        
        }
    }
    int Triangular(int T){
        if(T==1){
            return 1;
        }
        else{
            return T + Triangular(T-1);
        }
    }
    int SquareSum(int N){
        if(N==1){
            return 1;
        }
        else{
            return N*N+SquareSum(N-1);
        }
    }
    
    int BinarySum(int A[],int i,int j){
        if(j==1){
            return A[i];
        }
        else{
            return BinarySum(A,i,j/2) + BinarySum(A,i+(j/2),j/2);
        }
    }
    
    int BinarySearch(int key, int A[], int LI, int HI){
        if (LI>HI){
            return -1;
        }
        if (key == A[(LI+HI)/2]){
            return (LI+HI)/2;
        }
        else if(key<(LI+HI)/2){
            return BinarySearch(key, A, LI, ((LI+HI)/2)-1);
        }
        else{
            return BinarySearch(key,A,((LI+HI)/2)+1,HI);
        }
    }
    
    int NumPower(int n, int p){
        if(p==1){
            return n;
        }
        else{
            return n * NumPower(n,p-1);
        }
    }
    
    int sumofDigits(int n){
        if(n==0){
            return 0;
        }
        if(n%10==0){
            return n;
        }
        else{
            return n%10+sumofDigits(n/10);
        }
    }
    
//    int sumofDigitsbySir(int n){
//        if(n<10){
//            return n;
//        }
//        else{
//            return n%10+sumofDigits(n/10);
//        }
//    }
}
