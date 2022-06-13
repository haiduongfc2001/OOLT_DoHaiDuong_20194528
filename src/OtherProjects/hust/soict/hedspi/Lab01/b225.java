package OtherProjects.hust.soict.hedspi.Lab01;

import javax.swing.JOptionPane;

public class b225 {
	
	static double Sum(Double a,Double b) {
		return a + b;
	}
	
	static double Difference(Double a,Double b) {
		return a - b;
	}
	
	static double Product(Double a,Double b) {
		return a * b;
	}
	
	static double Quotient(Double a,Double b) {
		return a / b;
	}	
	
	static double CheckDivisor(Double a,Double b) {
		return b;
	}
	
	public static void main(String args[]) {
		String strNum1,strNum2;
		Double Num1,Num2;
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number",  "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		Num1 = Double.parseDouble(strNum1);
		Num2 = Double.parseDouble(strNum2);
		
		JOptionPane.showMessageDialog(null, "Sum of 2 double numbers is: " + Sum(Num1, Num2) + "\n" + 
											"Difference of 2 double numbers is: " + Difference(Num1, Num2) + "\n" + 
											"Product of 2 double numbers is: " + Product(Num1, Num2) + "\n" + 
											"Quotient of 2 double numbers is: " + Quotient(Num1, Num2) + "\n" + 
											"The divior of division is " + CheckDivisor(Num1, Num2), "2 double numbers", JOptionPane.INFORMATION_MESSAGE);

	}
}
