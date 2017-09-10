package test;

import java.util.Scanner;

public class Solution2 {
	/**
     * 返回git树上两点的最近分割点
     * 
     * @param matrix 接邻矩阵，表示git树，matrix[i][j] == '1' 当且仅当git树中第i个和第j个节点有连接，节点0为git树的跟节点
     * @param indexA 节点A的index
     * @param indexB 节点B的index
     * @return 整型
     */
	public int getSplitNode(String[] matrix, int indexA, int indexB) {
		int[][] i=new int[matrix.length][matrix[0].length()];
		for(int x=0;x<i.length;x++){
			for(int y=0;y<i.length;y++){
				i[x][y]=matrix[x].charAt(y)-'0';//将元素导入到二维数组中去
			}
		}
		boolean[] b=new boolean[matrix.length];
		int res=indexA;
		for(int x=indexA;x>=0;x--){
			if(i[x][indexA]==1){
			b[x]=true;//找到父亲节点
			indexA=x;//转化当前节点
			}
		}
		//System.out.println(i[indexB][res]);
		if(i[indexB][res]==1)
			return indexB<res?indexB:res;
		for(int x=indexB;x>=0;x--){
			if(b[x]==true){//如果出现了父亲节点
				//System.out.println("后面");
			return x;
			}
		}
		
		for(int x=0;x<b.length;x++){
			System.out.println(b[x]);
		}
		return 0;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] s1=s.split("]");
	String s2=s1[0].substring(1, s1[0].length());
	String[] matrix=s2.split(",");
	String s3=s1[1].substring(1,s1[1].length());
	String[] A=s3.split(",");
	int a=Integer.parseInt(A[0]);
	int b=Integer.parseInt(A[1]);
	Solution2 so=new Solution2();
	System.out.println(so.getSplitNode(matrix, a, b));
}
}
