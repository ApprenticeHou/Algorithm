package test;

import java.util.Scanner;

public class JD4 {
public static int[] getNew(int[] x,int[] y){
	int[] res=new int[x.length+y.length];
	int start1=0,start2=0,end1=x.length-1,end2=y.length-1,min1=0,min2=0;
	while(start1<=end1&&start2<=end2){
	min1=findMin(x, start1, end1);
	min2=findMin(y, start2, end2);
	if(x[min1]<y[min2]){//如果第一个数组中的元素小则经行添加
		res[start1+start2]=x[min1];
	swap(x,start1,min1);
	start1++;
	}
	else{
		res[start1+start2]=y[min2];
		swap(y,start2,min2);
		start2++;
	}
	}
	if(start1>end1){//将第二个数组的剩余元素加到大数组中去
		while(start2<=end2){
			res[start1+start2]=y[min2];
			swap(y,start2,min2);
			start2++;
		}
	}
	else{
		while(start1<=end1){
			res[start1+start2]=x[min1];
			swap(x,start1,min1);
			start1++;
		}
	}
	return res;
}
public static void swap(int[] i,int x,int y){
	if(i==null)
		return;
	int temp=i[x];
	i[x]=i[y];
	i[y]=temp;
}
public static int findMin(int[] i,int start,int end){
	int res=start;
	if(start>end||i==null)
		return res;
	if(start==end)
		return res;
	for(int x=start;x<end;x++){
		if(i[x]<i[res])
			res=x;
	}
	return res;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int j=sc.nextInt();
	int[] x=new int[i];
	int[] y=new int[j];
	for(int n=0;n<i;n++){
		x[n]=sc.nextInt();
	}
	for(int n=0;n<j;n++){
		y[n]=sc.nextInt();
	}
	int[] res=JD4.getNew(x, y);
	for(int n=0;n<res.length-1;n++)
		System.out.print(res[n]+" ");
	System.out.print(res[res.length-1]);
}
}
