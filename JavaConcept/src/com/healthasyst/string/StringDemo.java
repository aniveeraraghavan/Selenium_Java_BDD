package com.healthasyst.string;

public class StringDemo {

	public static void main(String[] args) {
	
		String color = "red";
		color = "blue";
		color = "black";
		String color2 = "brown";
		color2 = "black";
		
		System.out.println(color);
		
  if(color.equals(color2))
		{
	System.out.println("both the colors are same");

}else 
{ System.out.println("colors are different");

	}
  
  String a = "rede";
  int len = a.length();//checking the length of the string
  System.out.println(len==3);//checking the length equal 3 or not---returns boolean value
  
  StringBuilder builder = new StringBuilder("Rose");
    builder.append("apple");
    
    System.out.println(builder);
    
    int num= 10;
    String b = String.valueOf(num);
    System.out.println(b);//int to string
    
    int zz= Integer.parseInt(b);//string to int
    System.out.println(zz+zz);
    
    
  
	}
}