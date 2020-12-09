package Spring.SpringDependenciesObjectType;

public class AnotherStudent {

	private MathCheat mathcheat;

	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}
	public void cheat(){
		mathcheat.mathCheat();
	}
}
