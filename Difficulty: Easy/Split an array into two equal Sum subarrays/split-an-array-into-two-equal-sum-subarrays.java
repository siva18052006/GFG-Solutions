//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int a=arr.length;
        int low=0,high=a-1,first=0,second=0;
        first+=arr[low];
        second+=arr[high];
        while(low!=high){
            if(first==second && low==high-1){
                return true;
            }
            if(first<second){
                low++;
                first+=arr[low];
            }
            else{
                high--;
                second+=arr[high];
            }
        }
        return false;
    }
}