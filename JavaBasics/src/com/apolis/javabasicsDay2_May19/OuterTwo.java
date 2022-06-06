package com.apolis.javabasicsDay2_May19;

public class OuterTwo {
	String example = "example.";
	
	public void printExample() {
		
		String example = " is an ";
		
		class InnerClass{
			String example = "This";
			void printExample() {
				System.out.print(example);
			}
		}
		InnerClass inner = new InnerClass();
		inner.printExample();
		System.out.print(example);
	}
	
	public static void main(String[] args) {
		
		OuterTwo outer = new OuterTwo();
		outer.doTheStuff();
	}
	
	void doTheStuff() {
		OuterTwo outer = new OuterTwo();
		OuterTwo.InnerClass myInner = outer.new InnerClass();
		outer.printExample();
		System.out.print(outer.example);
	}

}
