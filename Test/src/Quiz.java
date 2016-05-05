
public class Quiz {
	
private int midSc;
private int finalSc;
private String name;

public Quiz(int midSc, int finalSc, String name) {
	this.midSc = midSc;
	this.finalSc = finalSc;
	this.name = name;
}

public int getMidSc() {
	return midSc;
}

public void setMidSc(int midSc) {
	this.midSc = midSc;
}

public int getFinalSc() {
	return finalSc;
}

public void setFinalSc(int finalSc) {
	this.finalSc = finalSc;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}

