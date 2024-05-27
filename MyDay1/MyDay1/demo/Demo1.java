package demo;

import basics.AccessSpecifier1;
/*
 * Access specifiers are used to declare the accessibility of the memeber.
 * Access specifiers can be used with variables, methods and constructors.
 * 
 * public: All class of same package and different package 
 * 			also will be able to access it.
 * 
 * protected: All classes of same package and only child class of different
 * 				package will be able to access it.
 * 
 * default: All classes of same package only. Any class in different package 
 * 				will not be able to access these members.
 * 
 *  private: We can only access these members within the same class.
 *  			No other class will be able to access it.
 */
public class Demo1 extends AccessSpecifier1{

	public static void main(String[] args) {

		AccessSpecifier1 as=new AccessSpecifier1();
		System.out.println("i= "+as.i);
		//System.out.println("k= "+as.k);
		//System.out.println("m= "+as.m);
		
		Demo1 d=new Demo1();
		System.out.println("j= "+d.j);
		//System.out.println("k= "+d.k);
	}

}
