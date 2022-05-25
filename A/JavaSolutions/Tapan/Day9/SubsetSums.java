public class SubsetSums{
    public static void main(String[] args) {
        
    }

    //    https://practice.geeksforgeeks.org/problems/subset-sums2234/1#

    class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        
        ArrayList<Integer>list=new ArrayList();
        
        solve(list, new ArrayList(), arr,N,0);
        
        return list;
    }
    
    private void solve(ArrayList<Integer>list,
    ArrayList<Integer>temp, 
    ArrayList<Integer>arr,int n,int start
    ){
        
        
        list.add(sum(temp));
        
        for(int i=start;i<n;i++){
            
            temp.add(arr.get(i));
            
            solve(list,temp, arr, n, i+1);
            
            temp.remove(temp.size()-1);
            
            
        }
    }
    
    private int sum(ArrayList<Integer>temp){
        
        int sum1=0;
        for(int i=0;i<temp.size();i++){
            sum1+=temp.get(i);
        }
        return sum1;
    }
}
}