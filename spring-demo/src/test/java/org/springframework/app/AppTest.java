package org.springframework.app;

import junit.framework.*;
import org.springframework.context.annotation.*;
import org.springframework.demo.service.*;

/**
 * @author xujungang
 * @date 2020-11-02
 */
public class AppTest extends TestCase {

	public static void main(String[] args) {
		// 初始化Spring容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		System.out.println(applicationContext.getBean(X.class));
	}
}