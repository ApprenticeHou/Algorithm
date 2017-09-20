package test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xiaomi1 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static long fun(long x) {
        long res=1;
        List<Long> l=new ArrayList<>();//用来存储所要查找数字的因数
        if(x<1)
        	return 1;
        int y=0;
        while(y==0){
        	y=(int) (x>>>1-1);
        	if(x%y==0)
        		break;
        	else{
        		y=0;
        	}
        }
        //找到x的最大因数
        if(y==0){//次数为质数的情况下
        	res=x+1;
        }
        else//不为质数的情况下
        {
        	res=y+1;
        }
        return res;
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;
            
        long _x;
        _x = Long.parseLong(in.nextLine().trim());
  
        res = fun(_x);
        System.out.println(String.valueOf(res));  

    }
}
