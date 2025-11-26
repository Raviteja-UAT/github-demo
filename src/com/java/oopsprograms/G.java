package com.java.oopsprograms;

public class G {

	int a;

	public static void main(String[] args) {

		G g1 = new G();
		System.out.println(g1.a);// 0
		g1.a = 1;
		System.out.println(g1.a);// 1
		G g2 = new G();
		System.out.println(g2.a);
		G g3 = new G();
		System.out.println(g3.a);
		g3.a = 10;
		System.out.println(g3.a);
	}

}
