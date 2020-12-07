/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author 1830041
 */
public class Test {
	public static void main(String[] args) {
		Clock c = new Clock(22, 30, 0);
		System.out.println(c);
		for (int i = 0; i < 10000; i++) {
			c.increaseSecond();
			System.out.println(c);
		}
	}	
}
