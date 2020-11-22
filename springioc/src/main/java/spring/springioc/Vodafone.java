package spring.springioc;

public class Vodafone implements Sim {

	public void calling(){
		System.out.println("calling using vodafone sim");
	}
	
	public void data(){
		System.out.println("using data in vodafone sim");
	}
}
