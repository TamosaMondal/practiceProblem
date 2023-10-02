/*Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.
*/
class Solution{
    static int searchInSorted(int Arr[], int N, int k)
    {
        
        // Your code here
        int low=0;
        int high=N-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(Arr[mid]==k) return 1;
            if(k>Arr[mid]){
                
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
        
    }
}
