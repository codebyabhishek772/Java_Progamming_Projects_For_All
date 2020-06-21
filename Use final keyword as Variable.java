package FinalKeyword;

public class Employee {

final int Reg_No;
Employee(int num)
{
Reg_No = num;
}
void display()
{
System.out.println("Employee number is: " + Reg_No);
}

public static void main(String args[])
{
Employee em = new Employee(201);
em.display();
}
}
