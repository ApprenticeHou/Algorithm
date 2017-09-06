package 剑指offer;

import java.util.Arrays;

/**
 * 编写一个查找数组中的最大的k个元素
 * @author Hou
 *实现不同方法
 */
public class FindMaxK {
/*
 * 方法一，利用类似于快速排顺的方法，根据一个元素将划分区域
 * 找到k位置的元素，优点能到以最快的速度达到，缺点需要改变原来的数组，并且k的元素有可能不是排好序的
 */
	public int[] findK(int[] i,int k){
		int[] res =new int[k];
		if(i==null)
			res=null;
		if(i.length<=k)
			res=i;
		else
		{
			int start=0;
			int end=i.length-1;
			int middle=partition(i, start, end);
			if(middle!=k-1){
				if(middle>k-1){
					end=middle-1;
					middle=partition(i, start, end);
				}
				if(middle<k-1){
					start=middle+1;
					middle=partition(i, start, end);
				}
			}
			for(int j=0;j<k;j++){
				res[j]=i[j];
			}
		}
		return res;
	}
	/*
	 * 辅助第一种方法用来找取纽舒元,并且
	 * 采取的是取三个元素的中间元素
	 */
	private int partition(int[] i,int start,int end){
		if(i.length<=0){
			System.out.println("输入的数组有问题");
			return -1;
			}
		if(end<start){
			System.out.println("start不能大于end");
		}
		int middle=(start+end)>>>1;
		if(i[start]>i[middle])
			swap(i,start,middle);
		if(i[start]>i[end])
			swap(i,start,end);
		if(i[middle]>i[end])
			swap(i,middle,end);
		swap(i,middle,end-1);//将中间元素与倒数第二个元素互换
		int last=end-1;//用来最后的交换
		boolean b=end>start;
		end=end-2;//从倒数的三个元素开始遍历
		while(b){
			while(i[end]>i[last])
				end--;
			while(i[start]<i[last])
				start++;
			b=end>start;
			if(b){
				swap(i,start,end);//交换位置不正确的元素
				start++;
				end--;
			}	
		}
		swap(i,last,start);//交换纽疏元
		return start;
	}
	/*
	 * 用来改变数组中的元素位置
	 */
	private void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int[] i={5,6,3,6,7,3,6,97,7,3,6,3,4,4,543,1,3,43,3,43};
		FindMaxK f=new FindMaxK();
		System.out.println(Arrays.toString(f.findK(i, 7)));
	}
}
