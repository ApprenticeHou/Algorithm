package test;

import java.util.Scanner;

/**
 * 给定一个十进制的正整数number，选择从里面去掉一部分数字，希望保留下来的数字组成的正整数最大。 
 * @author DELL
 *采用先选前几位最大的原则
 */
public class SouHu0 {
	/**
	 * 新的算法，优先考虑第一位数字
	 * @param s
	 * @param n
	 */
	public static void getMaxNum1(String s,int n){
		int[] i=new int[s.length()];
		for(int x=0;x<i.length;x++){
			i[x]=s.charAt(x)-'0';
		}
		int[] res=new int[s.length()-n];
		int start=0,end=n;
		int max=0;
		int x=0;
		/*
		 *找到前n位数字中的最大数字，则为首位数字 
		 */
		for(;x<n+1&&start<=end;x++){
			max=getMax(i, start, end++);
			res[x]=i[max];
		//	System.out.println(res[x]+"res"+"start"+start);
			start=max+1;
		}
		max++;
		for(;x<res.length;x++,max++){
			res[x]=i[max];
		}
		for(int y=0;y<res.length-1;y++){
			System.out.print(res[y]+" ");
		}
		System.out.println(res[res.length-1]);
	}

/**
 * 找到数组中最小元素的位置
 * @param i 数组
 * @param start 起始点
 * @param end 终止点
 * @return 返回数组的最小元素的位置
 */
private static int getMax(int[] i,int start,int end){
	if(end>i.length||i==null||i.length==1||start>=end)
		return start;
	int x=start;
	for(int j=start+1;j<=end;j++){
		if(i[x]<i[j])
			x=j;
	}
	for(int j=x;j<=end;j++){
		if(i[j]==i[x]&&i[getMax(i, x+1, end)]<i[getMax(i, j+1, end)]){
			x=j;
		}
	}
	return x;
}
/**
 * 交换两个元素的位置
 * @param i
 * @param x
 * @param y
 */
private static void swap(int[] i,int x,int y){
	int temp=i[x];
	i[x]=i[y];
	i[y]=temp;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n=Integer.parseInt(sc.nextLine());
	getMaxNum1(s, n);
}
}
