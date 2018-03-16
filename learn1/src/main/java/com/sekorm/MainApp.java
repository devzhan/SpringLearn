package com.sekorm;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sekorm.model.HelloWorld;

public class MainApp {
	public static void main(String[] args) {
		/**
		 * Spring ApplicationContext 容器该容器添加了更多的企业特定的功能，例如从一个属性文件中解析文本信息的能力，
		 * 发布应用程序事件给感兴趣的事件监听器的能力。该容器是由 org.springframework.context.ApplicationContext
		 * 接口定义。
		 */

		// 采用application
		// ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/**
		 * Spring BeanFactory 容器它是最简单的容器，给 DI 提供了基本的支持，它用
		 * org.springframework.beans.factory.BeanFactory 接口来定义。 BeanFactory 或者相关的接口，如
		 * BeanFactoryAware，InitializingBean，DisposableBean， 在 Spring 中仍然存在具有大量的与 Spring
		 * 整合的第三方框架的反向兼容性的目的。
		 */
		XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	}
}