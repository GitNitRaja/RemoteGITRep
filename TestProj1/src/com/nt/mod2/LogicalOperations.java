package com.nt.mod2;

public class LogicalOperations {

	public int findBig(int a,int b){
		if(a<b)
			return b;
		else
			return a;
	}
	
	public int findSmall(int a,int b){
		if(a<b)
			return a;
		else
			return b;
	}
	public int findEqauls(int x,int y){
		if(x==y)
			return 1;
		else
			return 0;
	}
	
}
