import java.util.Scanner;
class Account
{
double bal  =80000;
int amount;
void display()
{
System.out.println("Available balance is "+bal+"Rs");
}
void withdraw()
{
if(amount>bal)
{
System.out.println("insufficient balance");
return;}
else if(amount <=bal)
{
System.out.println(amount+"Rs withdraw");
}}
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
Account a1 = new Account();

a1.display();


System.out.println("press 1 for withdraw");
System.out.println("press 2 for balance inquiry");
int press = s.nextInt();
switch(press)
{
case 1 :
System.out.println("enter amount");
a1.amount = s.nextInt();
a1.withdraw();
System.out.println("Available balance is"+((a1.bal)-(a1.amount))+"Rs");
break;
case 2 :
a1.display();
break;
default :
System.out.println("invalid input");
}

}}