/*Given a sorted and rotated array A of N distinct elements which are rotated at some point, and given an element K. The task is to find the index of the given element K in array A.
*/
class Solution 
{ 
    static int Search(int a[], int target)
	{
	    // code here
	    int low=0;
	    int high=a.length-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(a[mid]==target) return mid;
	        if(a[low]<a[mid]){
	            if(target>=a[low] && target<a[mid]){
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        else{
	            if(target>a[mid] && target<=a[high]){
	                low=mid+1;
	            }
	            else{
	                high=mid-1;
	            }
	        }
	    }
	    return -1;
	}
} 

