//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        
            HashMap<Character,Integer> map = new HashMap<>();
        int ans=-1;
        int j=0,i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            while(map.size()>k&&j<=i){
                char ch2=s.charAt(j);
                map.put(ch2,map.get(ch2)-1);
                if(map.get(ch2)==0) map.remove(ch2);
                j++;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()==k) ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}