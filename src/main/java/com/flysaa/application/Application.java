package com.flysaa.application;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
import com.flysaa.person.Customer;
import com.flysaa.person.Person;
import com.flysaa.person.Employee;

class Application{

public static void  main(String[] args){
Scanner scan = new Scanner(System.in);
Calendar calendar1 = new GregorianCalendar();
Customer customer = new Customer();
Customer customer1 = new Customer();
Employee employee = new Employee();
Employee employee1 = new Employee();
Person person = new Person();
Person person1 = new Person();
ArrayList < String > province = new ArrayList <> ();


for(int a = 0;a < 15; a++){
System.out.println(" <<< Welcome to the SAA Menu >>> \n ");
System.out.println("\n Choose option:\n 1.Buy Tickets:\n 2.Manage Employees(Log In or Sign Up):\n 3.Board Flight:\n 4.Manage Customers:\n 5.Exit \n");
int option = scan.nextInt();

//MENU OPTION 1
if(option==1){
System.out.println("\n SEll TICKETS \n");


   System.out.println("Welcome to SAA reception. The place to book a flight ");

    System.out.println("  " + " \n Enter Your First Name:");
    String firstName00 = scan.nextLine();
    customer.setFirstName(scan.nextLine());

    System.out.println("Enter your Surname:");
    customer.setSurName(scan.nextLine());

    System.out.println("Choose destination province:" + " \n 0.Limpopo \n 1.Mpumalanga \n 2.Gauteng \n 3.FreeState \n 4.Kwazulu Natal \n 5.Eastern Cape \n 6.Western Cape \n 7.Northen Cape  ");
    int number0 = scan.nextInt();
    province.add("Limpopo");
    province.add("Mpumalanga");
    province.add("Gauteng");
    province.add("FreeState");
    province.add("KwaZulu Natal");
    province.add("Eastern Cape");
    province.add("Western Cape");
    province.add("Northan Cape");
    province.add("North West");

    System.out.println("Choose departure Airport:" + "\n 0.OR Tambo \n 1.Cape Town \n 2.King Shaka \n 3.Bram Fischer");
    int number1 = scan.nextInt();
    ArrayList <String> airport = new ArrayList <> ();
    airport.add("O.R Tambo International Airport");
    airport.add("Cape Town International Airport");
    airport.add("King Shaka INternational AIrport");
    airport.add("Bram Fischer International Airport");

    System.out.println("Choose landing Airport:" + "\n 0.OR Tambo \n 1.Cape Town \n 2.King Shaka 3.Bram Fischer");
    int number2 = scan.nextInt();
    ArrayList <String> landing = new ArrayList <> ();
    landing.add("O.R Tambo International Airport");
    landing.add("Cape Town International Airport");
    landing.add("King Shaka INternational AIrport");
    landing.add("Bram Fischer International Airport");


    System.out.println("Choose flight:" + "\n 0.First Class \n 1.Economy \n 2.Private");
    int number3 = scan.nextInt();
    ArrayList <String> flight = new ArrayList <> ();
    flight.add("First Class");
    flight.add("Economy");
    flight.add("Air Private ");

   System.out.println("Enter date: yyyy-mm-dd-hr-min ");
     int year = scan.nextInt();
     int month = scan.nextInt();
     int day = scan.nextInt();
     int hour = scan.nextInt();
     int minutes = scan.nextInt();
Calendar calendar = new GregorianCalendar(year, month, day, hour, minutes);
   System.out.println(calendar.getTime());

     System.out.println("Choose departure time:" + "\n 0.06h00 \n 1.12h00 \n 2.18h00 \n 3.00h00");
     int number4 = scan.nextInt();
      ArrayList <String> arrivalTime = new ArrayList <> ();
      arrivalTime.add("06h00");
      arrivalTime.add("12h00");
      arrivalTime.add("18h00");
      arrivalTime.add("00h00");


System.out.println("\n Username: "+ customer.getUserName());
System.out.println("Surname: "+ customer.getSurName());
System.out.println("Destination Province: "+ province.get(number0));
System.out.println("Departure Airport: "+ airport.get(number1));
System.out.println("Landing Airport: "+ landing.get(number2));
System.out.println("Flight: "+ flight.get(number3));
System.out.println("Departure Date"+ calendar.getTime());
System.out.println("Arrival time: "+ arrivalTime.get(number4));



//MENU OPTION 2
}else if(option==2){
System.out.println("\n MANAGE EMPLOYEES /n");


System.out.println(" \n Buy Tickets \n");

      //Employee Login or Signup
    System.out.println("\n 1.Log in or 2.Sign up \n");

  int manageEmployee = scan.nextInt();
       if(manageEmployee ==1){

    System.out.println("Enter Username: ");
    employee.setUserName(scan.nextLine());

    System.out.println("Enter Password: ");
    employee.setPassword(scan.nextLine());

              if(employee.getUserName().equals(employee.getUserName()) && employee.getPassword().equals(employee.getPassword())){
              System.out.println(employee.login());
              System.out.println(employee.bookflight());

  System.out.println("\n Employee Name is: "+ employee.getFirstName());
  System.out.println("Employee Surnname is: "+ employee.getSurName());
  System.out.println("\n Employee Username is: "+ employee.getUserName());
  System.out.println("\n Employee Password is: "+ employee.getPassword());
  System.out.println("\n Employee Position is: "+ employee.getPosition());
  System.out.println("Employee Nationality: "+ employee.getNationality());
  System.out.println("Employee Sex: "+ employee.getSex());
  System.out.println("Employee Age: "+ employee.getAge());
  System.out.println("Employee Phonenumbers: "+ employee.getPhoneNumber());
  System.out.println("Employee Email: "+ employee.getEmail());
  System.out.println("Employee Address: "+ employee.getAddress());

                }else{
System.out.print("Invalid Username or Password. 2/3 attempts left! ");

System.out.println(" \n Enter Username: ");
  employee.setUserName(scan.nextLine());

  System.out.println("Enter Password: ");
  employee.setPassword(scan.nextLine());

              if(employee.getUserName().equals(employee.getUserName()) && employee.getPassword().equals(employee.getPassword())){
             System.out.println(employee.login());
             System.out.println(employee.bookflight());

System.out.println("\n Employee Name is: "+ employee.getFirstName());
System.out.println("Employee Surnname is: "+ employee.getSurName());
System.out.println("\n Employee Username is: "+ employee.getUserName());
System.out.println("\n Employee Password is: "+ employee.getPassword());
System.out.println("\n Employee Position is: "+ employee.getPosition());
System.out.println("Employee Nationality: "+ employee.getNationality());
System.out.println("Employee Sex: "+ employee.getSex());
System.out.println("Employee Age: "+ employee.getAge());
System.out.println("Employee Phonenumbers: "+ employee.getPhoneNumber());
System.out.println("Employee Email: "+ employee.getEmail());
System.out.println("Employee Address: "+ employee.getAddress());


              }else{

              System.out.println("Invalid Username or Password. 1/3 attempts left! \n");

  System.out.println("Enter Username:");
  employee.setUserName(scan.nextLine());

  System.out.println("Enter Password \n");
  employee.setPassword(scan.nextLine());

              if(employee.getUserName().equals(employee.getUserName()) && employee.getPassword().equals(employee.getPassword())){
             System.out.println(employee.login());
             System.out.println(employee.bookflight());

System.out.println("\n Employee Name is: "+ employee.getFirstName());
System.out.println("Employee Surnname is: "+ employee.getSurName());
System.out.println("\n Employee Username is: "+ employee.getUserName());
System.out.println("\n Employee Password is: "+ employee.getPassword());
System.out.println("\n Employee Position is: "+ employee.getPosition());
System.out.println("Employee Nationality: "+ employee.getNationality());
System.out.println("Employee Sex: "+ employee.getSex());
System.out.println("Employee Age: "+ employee.getAge());
System.out.println("Employee Phonenumbers: "+ employee.getPhoneNumber());
System.out.println("Employee Email: "+ employee.getEmail());
System.out.println("Employee Address: "+ employee.getAddress());



             }else{
             System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED!");
             System.out.println(" Please contact admin at admin@saa.co.za");
             break;}

}
}



 //Employee Sign Up
     } else if(manageEmployee==2){

     System.out.println("1.Sign Up as Customer or 2.Sign Up as Employee");

      System.out.println("\n Enter your Peronal Details.\n");
      System.out.println("\n Enter your First Name:");
      employee.setFirstName(scan.nextLine());

      System.out.println("Enter your Surname:");
      employee.setSurName(scan.nextLine());

      System.out.println("\n Enter desired Username: \n");
      employee.setUserName(scan.nextLine());

      System.out.println("Enter desired Password: ");
      employee.setPassword(scan.nextLine());

     System.out.println("\n Enter your Position: ");
     employee.setPosition(scan.nextLine());

     System.out.println("Enter your Nationality:");
     employee.setNationality(scan.nextLine());

     System.out.println("Enter your Sex:");
     employee.setSex(scan.nextLine());

     System.out.println("Enter your age:");
     employee.setAge(scan.nextLine());

     System.out.println("Enter your phonenumber:");
     employee.setPhoneNumber(scan.nextLine());

     System.out.println("Enter your Email:");
     employee.setEmail(scan.nextLine());

     System.out.println("Enter your Address:");
     employee.setAddress(scan.nextLine());

System.out.println("\n Employee Name is: "+ employee.getFirstName());
System.out.println("Employee Surnname is: "+ employee.getSurName());
System.out.println("\n Employee Username is: "+ employee.getUserName());
System.out.println("\n Employee Password is: "+ employee.getPassword());
System.out.println("\n Employee Position is: "+ employee.getPosition());
System.out.println("Employee Nationality: "+ employee.getNationality());
System.out.println("Employee Sex: "+ employee.getSex());
System.out.println("Employee Age: "+ employee.getAge());
System.out.println("Employee Phonenumbers: "+ employee.getPhoneNumber());
System.out.println("Employee Email: "+ employee.getEmail());
System.out.println("Employee Address: "+ employee.getAddress());

}
//MENU OPTION 3
}else if(option==3){
System.out.println("\n BOARDING \n");

System.out.println("Press 1 to check in");
int checkin = scan.nextInt();
if(checkin==1){
System.out.println(customer.checkIn());
}

System.out.println("Press 1 to check out");
int checkout = scan.nextInt();
if(checkout==1){
System.out.println(customer.checkOut());
}


//MENU OPTION 4
}else if(option==4){
System.out.println("\n MANAGE CUSTOMERS \n");

     //Manage Customer Login Option
    System.out.println("\n 1.Log in or 2.Sign up \n");

 int manageCustomer = scan.nextInt();
      if(manageCustomer ==1){


 System.out.println("Enter Username: ");
 customer.setUserName(scan.nextLine());

 System.out.println("Enter Password: ");
 customer.setPassword(scan.nextLine());

              if(customer.getUserName().equals(customer.getUserName()) && customer.getPassword().equals(customer.getPassword())){
              System.out.println(customer.login());
              System.out.println(customer.bookflight());

System.out.println("\n Name: "+ customer.getFirstName());
System.out.println("Surnname: "+ customer.getSurName());
System.out.println("\n User Name: "+ customer.getUserName());
System.out.println("\n Password: "+ customer.getPassword());
System.out.println("Nationality: "+ customer.getNationality());
System.out.println("Sex: "+ customer.getSex());
System.out.println("Age: "+ customer.getAge());
System.out.println("Phonenumbers: "+ customer.getPhoneNumber());
System.out.println("Email: "+ customer.getEmail());
System.out.println("Address: "+ customer.getAddress());
System.out.println("Flight Destination: "+ customer.getDestination());
System.out.println("Arrival time is: "+ customer.getTime());

               }else{
               System.out.print("Invalid Username or Password. 2/3 attempts left! ");

System.out.println(" \n Enter Username: ");
customer.setUserName(scan.nextLine());

System.out.println("Enter Password: ");
 customer.setPassword(scan.nextLine());

             if(employee.getUserName().equals(employee.getUserName()) && employee.getPassword().equals(employee.getPassword())){
            System.out.println(customer.login());
            System.out.println(customer.bookflight());

System.out.println("\n Name: "+ customer.getUserName());
System.out.println("Surnname: "+ customer.getSurName());
System.out.println("Nationality: "+ customer.getNationality());
System.out.println("Sex: "+ customer.getSex());
System.out.println("Age: "+ customer.getAge());
System.out.println("Phonenumbers: "+ customer.getPhoneNumber());
System.out.println("Email: "+ customer.getEmail());
System.out.println("Address: "+ customer.getAddress());
System.out.println("Flight Destination: "+ customer.getDestination());
System.out.println("Arrival time is: "+ customer.getTime());

             }else{

             System.out.println("Invalid Username or Password. 1/3 attempts left! \n");

 System.out.println("Enter Username:");
 customer.setUserName(scan.nextLine());

 System.out.println("Enter Password \n");
 customer.setPassword(scan.nextLine());

             if(customer.getUserName().equals("admin") && customer.getPassword().equals("1234")){
             System.out.println(customer.login());
             System.out.println(customer.bookflight());

System.out.println("\n Name: "+ customer.getUserName());
System.out.println("Surname: "+ customer.getSurName());
System.out.println("Nationality: "+ customer.getNationality());
System.out.println("Sex: "+ customer.getSex());
System.out.println("Age: "+ customer.getAge());
System.out.println("Phonenumbers: "+ customer.getPhoneNumber());
System.out.println("Email: "+ customer.getEmail());
System.out.println("Address: "+ customer.getAddress());
System.out.println("Flight Destination: "+ customer.getDestination());
System.out.println("Arrival time is: "+ customer.getTime());


             }else{
             System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED!");
             System.out.println(" Please contact admin at admin@saa.co.za");
             break;
}
}
}
}

//MENU OPTION 5
}else if(option==5){
System.out.println("THANK YOU FOR FLYING WITH US! HOPE WE SEE YOU AGAIN!");
break;}


}
}
}


