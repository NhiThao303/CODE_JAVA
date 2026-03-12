/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide1;
public class Animal {
	protected String name;
	protected int age;
	
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name + " đang ăn");
	}
	
	public void sleep() {
		System.out.println(name + " đang ngủ");
	}

    void keu() {
     System.out.println(name + " đang kêu");
    }
}

