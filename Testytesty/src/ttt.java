import static org.junit.Assert.*;

import org.junit.Test;


public class ttt {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void calculateTest(){

		//CalculateActivity cA = new CalculateActivity();

		int a=calculate("1, 4  ,5 ");
		assertEquals("not correctly calculated",20,a);
	}
	
	public int calculate(String msg){
		msg.trim();
		System.out.println(msg);
		StringBuilder sb=new StringBuilder();
		int number=1;
		for(int i=0;i<msg.length();i++){
			if(msg.charAt(i)==','){
				number*=Integer.parseInt(sb.toString().trim());
				sb=new StringBuilder();
			}else{
				sb.append(msg.charAt(i));
			}
		}
		number*=Integer.parseInt(sb.toString().trim());
		return number;
	}
}
