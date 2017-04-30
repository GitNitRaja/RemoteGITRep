import com.nt.mod1.ArithmeticOperation;
import com.nt.mod2.LogicalOperations;

public class SampleApp {

	public static void main(String[] args) {

		System.out.println("welcome to GIT1");
		System.out.println("welcome to GIT2");
		System.out.println("welcome to GIT3-->Dev2-->hello--hello1");
		System.out.println("welcome to GIT4");
		//hello1
		ArithmeticOperation operation=new ArithmeticOperation();
		int result=operation.sum(100,200);
		System.out.println("sum:"+result);
		System.out.println("sub:"+operation.sub(100,200));
		LogicalOperations lop=new  LogicalOperations();
		System.out.println("big value:"+lop.findBig(10,20));
		System.out.println("small value:"+lop.findSmall(10,20));
	}//main
}//class
