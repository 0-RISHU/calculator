import java.util.Stack;
public class consicutiveseq1{
    public static int[] consicutive_sequence(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
            st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
            if(i==n-1 || arr[i]!=arr[i+1]){
              st.pop();
            }
        }
        }
        int res[]= new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,3,4,4,4,5,6,7,8,8,9};
        int res[]=consicutive_sequence(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}