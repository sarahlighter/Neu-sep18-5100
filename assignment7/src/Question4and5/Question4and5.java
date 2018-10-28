package Question4and5;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Interval {
	 int start;
	 int end;
	 Interval() { start = 0; end = 0; }
	 Interval(int s, int e) { start = s; end = e; }
}
class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
    	if(a.start<b.start)
    		return -1;
    	else if(a.start == b.start)
    		return 0;
    	else return 1;
    }
}

class Solution {
	//Question 4
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals.size()<=1||intervals==null) return intervals;
		List<Interval> list=new LinkedList<>();
		Collections.sort(intervals, new IntervalComparator());
		int n=intervals.size();
		for(int i=0;i<n;i++){
			if(list.isEmpty()|| list.get(list.size()-1).end< intervals.get(i).start){
				list.add(intervals.get(i));
			}
			else{
				list.get(list.size()-1).end=Math.max(list.get(list.size()-1).end, intervals.get(i).end);
			}
	        
	    }
		return list;
	}
	//Question 5
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n=nums1.length, m=nums2.length,j=0,k=0;
		int[] nums=new int[m+n];
		int length=m+n;
		for(int i=0;i<length;i++){
			if(j<n&&k<m){
				if(nums1[j]<=nums2[k]){
					nums[i]=nums1[j]; j++;
				}else{
					nums[i]=nums2[k]; k++;
				}
			}else if(k<m){
				nums[i]=nums2[k];
				k++;
			}else{
				nums[i]=nums1[j];
				j++;
			}
		}
		double result;
		
		if((length)%2==0) result=(double)(nums[length/2]+nums[length/2-1])/2;
		else result=nums[length/2];
		return result;
		
	}
}
public class Question4and5 {
	public static void main(String[] args) {
		Solution s=new Solution();
		List<Interval> list=new LinkedList<>();
		list.add(new Interval(1,3));
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		List<Interval> result=s.merge(list);
		for(Interval i:result){
			System.out.println(i.start+","+i.end);
		}
		System.out.println("-------------------");
		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		System.out.println(s.findMedianSortedArrays(nums1, nums2));
	}
}
