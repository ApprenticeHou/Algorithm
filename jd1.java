package test;

import java.util.Scanner;
/**
 * 小山看见高度问题
 * @author DELL
 *
 */
public class jd1 {
	/**
	 * 实现方法
	 * @param sum
	 * @param i
	 * @return
	 */
public static int test(int sum,int[] i){
	int res=(sum*(sum-1))>>>1;
	int del=0;
	for(int x=0;x<sum;x++){
		for(int y=0;y<sum;y++){
			if(i[x]<i[y])
				del++;
		}
		if(del>2)
			res-=(del-2);
		del=0;
	}
	return res;
} 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] i=new int[sc.nextInt()];
	for(int x=0;sc.hasNext();x++){
		i[x]=sc.nextInt();
		
	}
	jd1 j=new jd1();
	System.out.println(j.test(i.length, i));
}
}
