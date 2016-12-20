package LeetCode;
/*
 * https://leetcode.com/problems/find-median-from-data-stream/
 * 
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

Examples: 
[2,3,4] , the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.
*
*/
import java.util.*;
import java.util.Queue;

public class MedianOfHeap {
	private PriorityQueue<Integer> small=new PriorityQueue(1,new Comparator<Integer>(){
								public int compare(Integer o1,Integer o2){
									return o2-o1;
								};
								});
	private Queue<Integer> large=new PriorityQueue();
	
	public void addNum(int num){
		large.add(num);
		small.add(large.poll());
		if(large.size()<small.size()){
			large.add(small.poll());
		}
	}
	
	
	public double findMedian(){
		return large.size() > small.size() ? large.peek() : (large.peek()+small.peek())/2.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianOfHeap m=new MedianOfHeap();
		m.addNum(2);
		m.addNum(3);
		System.out.println(m.findMedian());
		m.addNum(1);
		m.addNum(4); 
		m.addNum(5);
		System.out.println(m.findMedian());
	}

}
