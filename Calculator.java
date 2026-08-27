public class Calculator{
  public int add(int a,int b){
  	int c=a+b;
	return c;
  }
  public static void main(String[] args){
      Calculator calc=new Calculator();
      System.out.println("The Sum is:" + (calc.add(5,10)));
  }
}
