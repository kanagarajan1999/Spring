package Spring.SpringAutowire;

public class Heart {
	private String NameOfAnimal;
	private int NoOfHearts;

public String getNameOfAnimal() {
		return NameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		NameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHearts() {
		return NoOfHearts;
	}

	public void setNoOfHearts(int noOfHearts) {
		NoOfHearts = noOfHearts;
	}
public void pump(){
	System.out.println("your heart is pumping");
}
}
