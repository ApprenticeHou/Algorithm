package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xiaomi2 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static boolean fun(String str) {
       //可以通过删除一个字符判断是否为回文数的方法来判断
    	boolean res=false;
    	List<Character> list=new ArrayList<>();
    	for(int x=0;x<str.length();x++){//转化为数组
    		list.add(str.charAt(x));
    	}
    	List<Character> copy;
    	List<Character> rev;//反转
    	boolean b=true;
    	for(int x=0;x<str.length();x++){
    		copy=list;
    		copy.remove(x);
    		rev=copy;
    		Collections.reverse(rev);
    		for(int y=0;y<rev.size();y++){
    			if(rev.get(x)!=copy.get(x)){
    				b=false;
    				break;
    			}
    		}
    		if(b){//出现了回文数的情况
    			res=true;
    		return res;
    		}
    	}
return res;
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;
            
        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
  
        res = fun(_str);
        System.out.println(String.valueOf(res ? 1 : 0));  
    }
}
