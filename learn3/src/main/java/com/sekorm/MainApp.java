package com.sekorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sekorm.model.TextEditor;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 TextEditor textEditor=(TextEditor) context.getBean("textEditor");
		 textEditor.spellCheck();
		
	}

}
