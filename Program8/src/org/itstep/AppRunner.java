package org.itstep;

import org.itstep.Controller;
import org.itstep.Model;
import org.itstep.View;

public class AppRunner {

	public static void main(String[] args) {
		String word1 = "Anastasiia";   // ��� ��������
		String word2 = "Lunova";	//������� ��������
		int number = 8;	// �������� �� ���������(�� ������ ��������)
		Model model = new Model();
		model.setWord1(word1);
		model.setWord2(word2);
		model.setNumber(number);
		View view = new View();
		Controller controller = new Controller(view, model);
		
		controller.enteringSentence();

	}

}
