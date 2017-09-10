package 剑指offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 找到输入数组中连续数字加和的最大值，当然其中包括负数
 * @author HOU
 *采用的是动态规划的方法
 */
public class FindSumMax {
public int finsum(List<Integer> i){
	if(i==null)
		return 0;
	int sum=0;
	int res=0x80000000;
	System.out.println(res);
	for(int x:i){
		if(sum<=0)//如果加和小于零则不要此值
			sum=x;
		else
			sum+=x;//如果加和没有小于零则代表其还有利用价值则继续加上当前值
		if(sum>res)
			res=sum;//如果加和大于记录的最大加和则替换
	}
	return res;
}
public static void main(String[] args) {
	FindSumMax fs=new FindSumMax();
	List<Integer> l=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		l.add(sc.nextInt());
	}
	System.out.println(fs.finsum(l));
}
}
