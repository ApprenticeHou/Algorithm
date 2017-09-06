package 剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * 编写一个找到数组的中位数的方法，若该数组的长度为奇数则选择中间的数字，若为偶数则选择中间两个数字取平均
 * @author DELL
 *未排序的数组来储存插入的时间复杂度为O(1)，查找的时间复杂度为O(n)并且是调用区域划分的最优算法
 *若是使用已排序的数组来存储，则插入的时间复杂度为O(n)，查找的复杂度为O(1)
 *也可以使用排序链表，插入的时间复杂度为O(n)，可以通过俩个指针指向中间来找到中位数，时间复杂度为O(1)
 *也可以使用平衡AVL树，但是两边总数最多差一个，插入的时间复杂度为O(logn)，查找的时间复杂度为O(1)
 *最后一种方法为使用一个最大堆和一个最小堆，用来存储元素，最大堆用来存储前半部分元素，最小堆用来存储后半部分元素
 */
public class FindMiddle {
	static List<Integer> a=new ArrayList<>();
	private static PriorityQueue<Integer> min;
	private static PriorityQueue<Integer> max;
	public void insert(int i){
		a.add(i);
		//偶数加入最大堆
		if((a.size()&1)==1){
			//如果大于了最小堆的元素需要调整
			if(min.size()>0&&i>min.peek()){
				min.add(i);//加入最小堆
				i=min.poll();
				//先将最小元素吐出一个来
			}
			max.add(i);
		}
		//奇数的情况
		else
		{
			if(max.size()>0&&max.peek()>i){
				max.add(i);
				i=max.poll();
			}
			min.add(i);
		}
		//System.out.println(max.size()+"--"+"min"+min.size()+"--"+"a"+a.size());
	}
	/*
	 * 查找用到O(1)，偶数取平均，奇数去中间
	 */
	public int findMiddle(){
		System.out.print(a.size());
		if(max==null)
			return 0;
		int res;
		if((a.size()&1)==0){
			res=(max.peek()+min.peek())>>>1;
			System.out.println("偶数");
		}
		else{
			res=max.peek();
			System.out.println("总数奇数");}
		return res;
	}
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	FindMiddle fd=new FindMiddle();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		l.add(sc.nextInt());
	}
	Iterator<Integer> i=l.iterator();
	 min=new PriorityQueue<>(l.size()>>>1);
	 max=new PriorityQueue<>((l.size()+1)>>>1,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO 自动生成的方法存根
				return o2-o1;
			}
			
		});
	while(i.hasNext())
	fd.insert(i.next());
	System.out.println(fd.findMiddle());
}
}
