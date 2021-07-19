package javapro.di.ui;

import javapro.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	public void print() {
		System.out.println("total: "+ exam.total() + " avg: " + exam.avg());
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
