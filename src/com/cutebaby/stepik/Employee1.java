package com.cutebaby.stepik;

public class Employee1 {

	class Employee {
		String name;
		String email;
		int experience;
	}
	class Developer extends Employee {
		String mainLanguage;
		String[] skills;
	}

	class DataAnalyst extends Employee {

	}

	public static void main(String[] args) {
		String[] skills = { "git", "Scala", "JBoss", "UML" };
		Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

		String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
		DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
	}
}
