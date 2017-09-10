package test;

import java.util.Scanner;
public class Solution {
	    /**
	     * 获得两个整形二进制表达位数不同的数量
	     * 
	     * @param m 整数m
	     * @param n 整数n
	     * @return 整型
	     */
	    public int countBitDiff(int m, int n) {
	        int temp=(m^n);
	        int res=0;
	        while(temp!=0){
	        	res+=(temp&1);
	        	temp=(temp>>>1);
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	    	Solution s=new Solution();
	        Scanner sc=new Scanner(System.in);
	        int m=sc.nextInt();
	        int n=sc.nextInt();
	        System.out.println(s.countBitDiff(m,n));
	    }
	}
