package ½£Ö¸offer;

public class Fib {
public static int fib1(int n){
	int f1=1,f2=2,fn=0;
	if(n<=0)
		return 0;
	else if(n==1)
		return f1;
	else if(n==2)
		return f2;
	else
		for(int i=2;i<n;i++)
	{
		fn=f1+f2;
		f1=f2;
		f2=fn;
	}
	return fn;
}
public static void main(String[] args) {
	System.out.println(fib1(3));
}
}
