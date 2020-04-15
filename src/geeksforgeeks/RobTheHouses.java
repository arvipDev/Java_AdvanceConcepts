package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
In Byteland there is a circular colony of N houses . Each house in the colony has some money.
The value of money can either be positive or negative.
Find the maximum amount of money you can have after robbing any number of contiguous houses.

        Note: Robbing a house having negative money will reduce your money by that amount.
        Input:
        First line of input contains a single integer T which denotes the number of test cases.
        First line of each test case contains a single integer N which denotes the total number of houses.
        Second line of each test case contains N space separated integers denoting money in the houses.

        Output:
        For each test case print the maximum money by robbing the consecutive houses.
        User Task:
        The task is to complete the function maxMoney() which returns the maximum money.

        Constraints:
        1 <= T <= 100
        1 <= N <= 106
        -106 <= Arr[i] <= 106

        Example:
        Input:
        3
        7
        8 -8 9 -9 10 -11 12
        8
        10 -3 -4 7 6 5 -4 -1
        8
        -1 40 -14 7 6 5 -4 -1

        Output:
        22
        23
        52
        Explanation:
        Testcase 1: Starting from last house of the colony, robbed 12 units and moving in circular fashion,
        we can rob  8, -8, 9, -9, 10, which gives maximum robbed monney as 22.
*/

public class RobTheHouses {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());// input size of array
            int arr[] = new int[n];
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
            }

            Sol obj = new Sol();

            System.out.println(obj.maxMoney(arr, n));// print the circularSubarraySum
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Sol{

    // a: input array
    // n: size of array
    static int maxMoney(int a[], int n) {

        // Your code here
        return 0;

    }

}
