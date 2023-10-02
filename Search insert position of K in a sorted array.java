/*Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k, the task is to find the index of k, if its present in the array Arr[]. Otherwise, find the index where k must be inserted to keep the array sorted.
*/
class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int low=0;
        int high=N-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(Arr[mid]==k) return mid;
            if(k>Arr[mid]){
                index=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return index+1;
    }
}
