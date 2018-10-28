package Question4and5;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Question4and5Test {

	@Test
	public void test() {
		Solution s=new Solution();
		List<Interval> list=new LinkedList<>();
		list.add(new Interval(1,3));
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		List<Interval> result=s.merge(list);
		assertEquals(result.get(0).start,1);
		assertEquals(result.get(0).end,6);
		assertEquals(result.get(1).start,8);
		assertEquals(result.get(1).end,10);
		assertEquals(result.get(2).start,15);
		assertEquals(result.get(2).end,18);
		
		
		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		assertEquals(s.findMedianSortedArrays(nums1, nums2), 2.5,0.01);
		
		int[] nums3 = {1, 2};
		int[] nums4 = {1};
		assertEquals(s.findMedianSortedArrays(nums3, nums4), 1,0.01);
	}

}
