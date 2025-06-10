package exception.types;

public class ExceptionTypes {
//two types of exception - 1. checked 2. unChecked
	/*
	 * 
	 * UnChecked Exception types:
1. ArithmeticException:-
---------------------------

		int ans = 10 / 0;

2. ArrayIndexOutpufBoundException:-
-----------------------------------

	int a[] = new int[5];

	a[15]  = 10;// raise excception ArrayIndex...


3. StringIndexoutofBoundException
---------------------------------
	//		01234
	String name =  "royal";

	SOP(name.charAt(5));

4. NullPointerException:--
------------------------------
	String name = null;

	SOP(name.length());// NullpointerException

5. NumberFormateException:--
------------------------------
	String value = "1t2a3";
	int no = Integer.parseInt(value);  //NumberFormateException

6. CLassCastException:--
------------------------------

               A
               |
  ----------------------------
  |                          |
  B                          C
  
  A obj = new B();
  C c = new C(obj); // since B and C does not have any relation with each other so
  classCasrException will be raised
	*/

}
