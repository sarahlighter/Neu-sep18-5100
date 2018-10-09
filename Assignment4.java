package assignment4;

import java.util.HashMap;
import java.util.Map;
public class Assignment4 {
	public static void main(String[] args) {
		function f=new function();
		System.out.println("test firstUniqChar ");
		assert(f.firstUniqChar("leetcode")==0);
		assert(f.firstUniqChar("loveleetcode")==2);
		assert(f.firstUniqChar("askjflkjasdkslj")==4);
		System.out.println("test addDigits");
		assert(f.addDigits(38)==2);
		System.out.println("test moveZeroes");
		int[] nums={0,1,0,3,12};
		int[] nums1={0,0,1};
		f.moveZeroes(nums);
		System.out.println("test longestPalindrome");
		String s="cadbcbdaad";
		System.out.println(f.longestPalindrome(s));
		System.out.println("test rotate");
		int[][] matrix={{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		int[][]matrix1={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] rotatematrix= f.rotate(matrix1);
		int n=rotatematrix.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(rotatematrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}

class function {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) {
    		//TODO
    	if(s.length()==0) return -1;
    	Map<Character,Integer> map = new HashMap<>();
    	for(int i=0;i<s.length();i++){
    		if(map.containsKey(s.charAt(i)))
    			map.put(s.charAt(i),-1);
    		else map.put(s.charAt(i),i);
    	}
    	int j=0;
    	for(int i=0;i<s.length();i++){
    		int key=map.get(s.charAt(i));
    		if(key!=-1){
    			return key;
    		}
    	}
    	return -1;
     }
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
    		//TODO
    	if(n<10) return n;
    	int sum=0;
    	int a=0;
    	while(n>=10){
    		a=n%10;
    		sum+=a;
    		n=n/10;
    	}
    	sum+=n;
    	if(sum>=10)
    	return addDigits(sum);
    	else 
    		return sum;
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
    		//TODO
    	int end=nums.length-1;
    	for(int i=0;i<=end;i++){
    		if(nums[i]==0){
    			int j=i;
    			while(j<end){
    				nums[j]=nums[j+1];
    				j++;
    			}
    			nums[end]=0;
    			end--;
    			i--;
    		}
    	}
    	for(int i=0;i<nums.length;i++){
    		System.out.print(nums[i]+", ");
    	}
    	System.out.println();
     }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public String longestPalindrome(String s) {
		//TODO
		int length=0;
		String longest="";
		if(s.length()==0) return "";
		for(int i=0;i<s.length();i++){
			int len1=expand(s,i,i);
			int len2=expand(s,i,i+1);
			int longer=Math.max(len1, len2);
			if(length<longer){
				length=longer;
				longest=s.substring(i-length/2, i+length/2+1);
			}
		}
		return longest;
    }
	public  int expand(String s, int i, int j){
		while(i>0&&j<s.length()&& s.charAt(i)==s.charAt(j)){
			i--;j++;
		}
		return j-i-2;
	}
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [   [1,2,3],
  			      				[4,5,6],
  			      				[7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 								 [8,5,2],
  								  								 [9,6,3] ],
     */
    public  int[][] rotate(int[][] matrix) {
    		//TODO
    	int n=matrix.length;
    	for(int i=0;i<n/2;i++){
    		for(int j=0;j<(n+1)/2;j++){
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[n-1-j][i];
    			matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
    			matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
    			matrix[j][n-1-i] = temp;
    		}
    	}
    	return matrix;
   }
    
}

