package com.apolis.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apolis.Day12_June6.Adult;
import com.apolis.Day12_June6.Animal;
import com.apolis.Day12_June6.Worker;
import com.apolis.model.Rentables;
import com.apolis.model.Tenent;
import com.apolis.model.Unit;

@SuppressWarnings("unused")
public class MainClass {

	public static void main(String[] args) {
		
		//BeanFactory fact = new XmlBeanFactory(new 
		//		ClassPathResource("com/apolis/common/application-context.xml"));
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/apolis/common/context_June6.xml");
		
		Animal pet = (Animal) context.getBean("cat1");
		Adult owner = (Adult) context.getBean("owner1");
		
		System.out.println(owner);
		System.out.println(pet);
		
		Worker plumber = (Worker) context.getBean("plumber2");
		
		plumber.printTools();
		
		
		/* Code from June 3
		Tenent myBrother = (Tenent) context.getBean("tenent1");
		Unit unit1 = myBrother.getUnit();
		System.out.println(unit1);
		Rentables myApts = (Rentables) context.getBean("theApartments");
		System.out.println("Tools Available:");
		for(String s : myApts.getToolList()) {
			System.out.println(s);
		}
		System.out.println("Who lives in " + myApts.getComplexName() + "?");
		for(int i = 0; i < myApts.getOccupationList().size(); i++) {
			String s =  myApts.getOccupationList().get(Integer.valueOf(i));
			System.out.println(s);
		}
		*/
		
	}

}
