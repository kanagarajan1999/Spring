package Spring.SpringDependenciesObjectType;

public class Student {

	private MathCheat mathcheat;

	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}
	public void cheating(){
		mathcheat.mathCheat();
	}
	
}
