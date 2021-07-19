package javapro.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javapro.di.entity.Exam;
import javapro.di.entity.PlayExam;
import javapro.di.ui.ExamConsole;
import javapro.di.ui.GridExamConsole;
import javapro.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		//<bean id="exam" class="javapro.di.entity.PlayExam"/>
		//이걸 붙여놔서 아래 코드 실행안해도 됨.
		//Exam exam = new PlayExam();
		//부모(인터페이스), 구현클래스(클래스)
		
		//ExamConsole console = new InlineExamConsole(exam);
		//ExamConsole console = new GridExamConsole(exam);
		//ExamConsole console = new InlineExamConsole();
	
		//ExamConsole console = new GridExamConsole();

		//console.setExam(exam);
		ApplicationContext context = new ClassPathXmlApplicationContext("javapro/di/setting.xml");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
