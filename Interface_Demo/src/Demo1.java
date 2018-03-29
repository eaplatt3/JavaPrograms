
public class Demo1 implements MyFirstInterface, Comparable<Integer> { //Integer,Double, etc. is wrapper Class

	@Override
	public int getSum1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSum2(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int getSum3(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

interface MyFirstInterface{
	//Default Way//
	//default int getSum(int a, int b) {
	//	return a+b;
	//}
	//Static Way//
	//static int getSum(int a, int b) {
	//	return a+b;
	//}
	
	final int MAX = 10;
	 abstract int getSum1(int a, int b);
	 int getSum2(int a, int b);
	 default int getSum3(int a, int b) {
		 return a+b;
	 }
	 static int getSum4(int a, int b) {
		 return a+b;
	 }
}
