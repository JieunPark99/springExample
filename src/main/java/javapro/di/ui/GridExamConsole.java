package javapro.di.ui;

import javapro.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole() {
		//±âº» »ý¼ºÀÚ
	}
	
	public GridExamConsole(Exam exam) {
		this.exam=exam;
	}

	public void print() {
		System.out.println("ÃÑÁ¡		Æò±Õ");
		System.out.println("------------------------------");
		System.out.printf("%d		%f\n",exam.total(),exam.avg());
		System.out.println("------------------------------");
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
