package test;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculateActivityTest extends TestCase {
	
	
	@Test
	public void calculateTest(){

		//CalculateActivity cA = new CalculateActivity();

		int a=calculate("1,4,5");
		assertEquals("not correctly calculated",20,a);
	}
	
	public int calculate(String msg){
		msg.trim();
		StringBuilder sb=new StringBuilder();
		int number=1;
		for(int i=0;i<msg.length();i++){
			if(msg.charAt(i)==','){
				number*=Integer.parseInt(sb.toString());
				sb=new StringBuilder();
			}else{
				sb.append(msg.charAt(i));
			}
		}
		number*=Integer.parseInt(sb.toString());
		return number;
	}
}
