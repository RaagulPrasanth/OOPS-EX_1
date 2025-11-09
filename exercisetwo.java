package sample;


import java.util.Scanner;
public class exercisetwo
{
public static void main(String[] args) { 
	Scanner s = new Scanner(System.in); 
	double total = 0;
for (int i = 1; i <= 12; i++) { 
	System.out.print("Enter unit value: "); 
 double unit = s.nextDouble();
total += unit;
}
double average = total / 12;
System.out.println("The total average is: " + average); 
if (average> 500){
System.out.println("High Energy Consumption");
}
}
}
