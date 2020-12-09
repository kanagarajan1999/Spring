package Spring.SpringAutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("humanheart") 
private Heart heart;
	
public void pump(){
	  if(heart!=null){
		  heart.pump();
		  System.out.println("alive");
		  System.out.println("Name Of Animal Is "+heart.getNameOfAnimal()+" And The No Of Heart Is "+heart.getNoOfHearts());
	  }
	  else{ 
		  System.out.println("you are dead");
	  }
}
}
