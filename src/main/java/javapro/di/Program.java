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
		//�̰� �ٿ����� �Ʒ� �ڵ� ������ص� ��.
		//Exam exam = new PlayExam();
		//�θ�(�������̽�), ����Ŭ����(Ŭ����)
		
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
