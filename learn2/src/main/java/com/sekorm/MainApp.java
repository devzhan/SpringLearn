package com.sekorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sekorm.model.TextEditor;
import com.sekorm.model.TextEditor2;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// TextEditor textEditor=(TextEditor) context.getBean("textEditor");
		// textEditor.spellCheck();

		TextEditor2 textEditor = (TextEditor2) context.getBean("textEditor2");
		textEditor.spellCheck();

	}

}
