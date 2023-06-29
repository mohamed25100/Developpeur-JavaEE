package _03_Agregation;

public class Notes {

	int maths, english;

	public Notes(int maths, int english) {

		this.maths = maths;
		this.english = english;
	}

	@Override
	public String toString() {
		return "Notes [maths=" + maths + ", english=" + english + "]";
	}
}
