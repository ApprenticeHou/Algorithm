package test;

	import java.util.Scanner;
	
	public class Solution1 {
		 /**
	     * 计算你能获得的最大收益
	     * 
	     * @param prices Prices[i]即第i天的股价
	     * @return 整型
	     */
		 public int calculateMax(int[] prices) {
			 if(prices.length<=1)
				 return 0;
	           int res=0;
	           int temp=0;
	           //第一种情况只要一个或者不要
	           for(int i=0;i<prices.length;i++){
	        	   int x=prices[i];
	        	   for(int y=i;y<prices.length;y++){
	        		   if(prices[y]>x){
	        			   temp=prices[y]-x;
	        			   if(temp>res)
	        				   res=temp;
	        			 
	        		   }
	        	   }
	           }
	      //     System.out.println("长度"+prices.length);
	           //第二种情况两次计算
	           int temp1=0;
	           for(int x=0;x<prices.length;x++){
	        	   for(int y=x+1;y<prices.length;y++){
	        		   if(prices[x]<prices[y]){
	        			   temp=prices[y]-prices[x];
	        		   for(int z=y+1;z<prices.length;z++){
	        			   for(int k=z+1;k<prices.length;k++)
	        			   if(prices[z]<prices[k]){
	        				   temp1=prices[k]-prices[z];
	        				   if(temp+temp1>res)
	        					   res=temp+temp1;
	        		   }
	        	   }
	        	   }
	             }
	           }
	           return res;
		    }
		 public static void main(String[] args) {
			 Solution1 s=new Solution1();
			Scanner sc=new Scanner(System.in);
			String[] st=sc.nextLine().split(",");
			int[] i=new int[st.length];
			for(int x=0;x<st.length;x++){
				i[x]=Integer.parseInt(st[x]);
			}
			System.out.println(s.calculateMax(i));;
		}
	}
