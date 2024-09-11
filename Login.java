package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver  d = new ChromeDriver();
		d.get("https://letcode.in/");
		//to Search the element of the webpage & perform the  action  clicking  on signup btn
		d.findElement(By.linkText("Sign up")).click();
		// To Search element-name if the webpage & perform action enter 
		
		
		
	}

	
	}

