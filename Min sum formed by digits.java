/*Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. All digits of the given array must be used to form the two numbers.

Any combination of digits may be used to form the two numbers to be summed.  Leading zeroes are permitted.

If forming two numbers is impossible (i.e. when n==0) then the "sum" is the value of the only number that can be formed.


*/
class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr);
        long num1=0;
        long num2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
            num1=num1*10+arr[i];
            }
            else{
                num2=num2*10+arr[i];
            }
        }
        return num1+num2;
    }
}
