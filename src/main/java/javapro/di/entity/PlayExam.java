package javapro.di.entity;

public class PlayExam implements Exam {
	private int kor,eng,math;

	public int total() {
		return kor+eng+math;
	}

	public float avg() {
		return total()/3.0f;
	}	
}