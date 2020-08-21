package com.flysaa.application;

import java.util.Scanner;
import com.flysaa.person.Customer;
import com.flysaa.person.Person;
import com.flysaa.person.Employee;

class Application{

public static void  main(String[] args){
Scanner scan = new Scanner(System.in);
Customer customer = new Customer();
Customer customer1 = new Customer();

Employee employee = new Employee();
Employee employee1 = new Employee();

Person person = new Person();
Person person1 = new Person();


for(int a = 0;a < 15; a++){
System.out.println(" <<< Welcome to the SAA Menu >>> \n ");
System.out.println("\n Choose option:\n 1.Buy Tickets:\n 2.Manage Employees:\n 3.Board Flight:\n 4.Manage Customers:\n 5.Exit \n");
int option = scan.nextInt();

//MENU OPTION 1
if(option==1){
System.out.println("\n SEll TICKETS \n");


   System.out.println("Welcome to SAA reception. The place to book a flight ");

    System.out.println("  " + " \n Enter Your First Name:");
    String firstName00 = scan.nextLine();
    customer.firstName = scan.nextLine();

    System.out.println("Enter your Surname:");
    customer.surName = scan.nextLine();

    System.out.println("Choose destination province:" + " \n 0.Limpopo \n 1.Mpumalanga \n 2.Gauteng \n 3.FreeState \n 4.Kwazulu Natal \n 5.Eastern Cape  ");
    int number0 = scan.nextInt();
    String province[] = new String[9];
    province[0] = "Limpopo";
    province[1] = "Mpumalanga";
    province[2] = "Gauteng";
    province[3] = "FreeState";
    province[4] = "KwaZulu Natal";
    province[5] = "Eastern Cape";
    province[6] = "Western Cape";
    province[7] = "Northan Cape";
    province[8] = "North West";

    System.out.println("Choose departure Airport:" + "\n 0.OR Tambo \n 1.Cape Town \n 2.King Shaka \n 3.Bram Fischer");
    int number1 = scan.nextInt();
    String airport[] =new String[4];
    airport[0] = "O.R Tambo International Airport";
    airport[1] = "Cape Town International Airport";
    airport[2] = "King Shaka INternational AIrport";
    airport[3] = "Bram Fischer International Airport";

    System.out.println("Choose landing Airport:" + "\n 0.OR Tambo \n 1.Cape Town \n 2.King Shaka 3.Bram Fischer");
    int number2 = scan.nextInt();
    String landing[] = new String[4];
    landing[0] = "O.R Tambo International Airport";
    landing[1] = "Cape Town International Airport";
    landing[2] = "King Shaka INternational AIrport";
    landing[3] = "Bram Fischer International Airport";


    System.out.println("Choose flight:" + "\n 0.First Class \n 1.Economy \n 2.Private");
    int number3 = scan.nextInt();
    String flight[] = new String[3];
    flight[0] = "First Class";
    flight[1] = "Economy";
    flight[2] = "Air Private ";

    System.out.println("Choose departure time:"+ "\n 0.00h00 \n 1.06h00 \n 2.12h00 \n 3.18h00");
    int number4 = scan.nextInt();
     String time1[] = new String[4];
     time1[0] = "00h00";
     time1[1] = "06h00";
     time1[2] = "12h00";
     time1[3] = "18h00";

     System.out.println("Choose departure time:" + "\n 0.06h00 \n 1.12h00 \n 2.18h00 \n 3.00h00");
      String arrivalTime[] = new String[4];
      arrivalTime[0] = "06h00";
      arrivalTime[1] = "12h00";
      arrivalTime[2] = "18h00";
      arrivalTime[3] = "00h00";


System.out.println("\n Username: "+ customer.userName);
System.out.println("Surname: "+ customer.surName);
System.out.println("Destination Province: "+ province[number0]);
System.out.println("Departure Airport: "+ airport[number1]);
System.out.println("Landing Airport: "+ landing[number2]);
System.out.println("Flight: "+ flight[number3]);
System.out.println("Departure Time: "+ time1[number4]);
System.out.println("Arrival time: "+ arrivalTime[number4]);



//MENU OPTION 2
}else if(option==2){
System.out.println("\n MANAGE EMPLOYEES /n");


System.out.println(" \n Buy Tickets \n");

      //Employee Login or Signup
    System.out.println("\n 1.Log in or 2.Sign up \n");

  int manageEmployee = scan.nextInt();
       if(manageEmployee ==1){

    System.out.println("Enter Username: ");
    employee.userName = scan.nextLine();

    System.out.println("Enter Password: ");
    employee.password = scan.nextLine();

              if(employee.userName.equals(employee.userName) && employee.password.equals(employee.password)){
              System.out.println(employee.login());
              System.out.println(employee.bookflight());

  System.out.println("\n Employee Name is: "+ employee.firstName);
  System.out.println("Employee Surnname is: "+ employee.surName);
  System.out.println("\n Employee Username is: "+ employee.userName);
  System.out.println("\n Employee Password is: "+ employee.password);
  System.out.println("\n Employee Position is: "+ employee.position);
  System.out.println("Employee Nationality: "+ employee.nationality);
  System.out.println("Employee Sex: "+ employee.sex);
  System.out.println("Employee Age: "+ employee.age);
  System.out.println("Employee Phonenumbers: "+ employee.phoneNumber);
  System.out.println("Employee Email: "+ employee.email);
  System.out.println("Employee Address: "+ employee.address);

                }else{
System.out.print("Invalid Username or Password. 2/3 attempts left! ");

System.out.println(" \n Enter Username: ");
  employee.userName = scan.nextLine();

  System.out.println("Enter Password: ");
  employee.password = scan.nextLine();

              if(employee.userName.equals(employee.userName) && employee.password.equals(employee.password)){
             System.out.println(employee.login());
             System.out.println(employee.bookflight());

System.out.println("\n Employee Name is: "+ employee.firstName);
System.out.println("Employee Surnname is: "+ employee.surName);
System.out.println("\n Employee Username is: "+ employee.userName);
System.out.println("\n Employee Password is: "+ employee.password);
System.out.println("\n Employee Position is: "+ employee.position);
System.out.println("Employee Nationality: "+ employee.nationality);
System.out.println("Employee Sex: "+ employee.sex);
System.out.println("Employee Age: "+ employee.age);
System.out.println("Employee Phonenumbers: "+ employee.phoneNumber);
System.out.println("Employee Email: "+ employee.email);
System.out.println("Employee Address: "+ employee.address);


              }else{

              System.out.println("Invalid Username or Password. 1/3 attempts left! \n");

  System.out.println("Enter Username:");
  employee.userName = scan.nextLine();

  System.out.println("Enter Password \n");
  employee.password = scan.nextLine();

              if(employee.userName.equals(employee.userName) && employee.password.equals(employee.password)){
             System.out.println(employee.login());
             System.out.println(employee.bookflight());

System.out.println("\n Employee Name is: "+ employee.firstName);
System.out.println("Employee Surnname is: "+ employee.surName);
System.out.println("\n Employee Username is: "+ employee.userName);
System.out.println("\n Employee Password is: "+ employee.password);
System.out.println("\n Employee Position is: "+ employee.position);
System.out.println("Employee Nationality: "+ employee.nationality);
System.out.println("Employee Sex: "+ employee.sex);
System.out.println("Employee Age: "+ employee.age);
System.out.println("Employee Phonenumbers: "+ employee.phoneNumber);
System.out.println("Employee Email: "+ employee.email);
System.out.println("Employee Address: "+ employee.address);



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
      employee.firstName = scan.nextLine();

      System.out.println("Enter your Surname:");
      employee.surName = scan.nextLine();

      System.out.println("\n Enter desired Username: \n");
      employee.userName = scan.nextLine();

      System.out.println("Enter desired Password: ");
      employee.password = scan.nextLine();

     System.out.println("\n Enter your Position: ");
      employee.position = scan.nextLine();

     System.out.println("Enter your Nationality:");
     employee.nationality = scan.nextLine();

     System.out.println("Enter your Sex:");
     employee.sex = scan.nextLine();

     System.out.println("Enter your age:");
     employee.age = scan.nextLine();

     System.out.println("Enter your phonenumber:");
     employee.phoneNumber = scan.nextLine();

     System.out.println("Enter your Email:");
     employee.email = scan.nextLine();

     System.out.println("Enter your Address:");
     employee.address = scan.nextLine();

System.out.println("\n Employee Name is: "+ employee.firstName);
System.out.println("Employee Surnname is: "+ employee.surName);
System.out.println("\n Employee Username is: "+ employee.userName);
System.out.println("\n Employee Password is: "+ employee.password);
System.out.println("\n Employee Position is: "+ employee.position);
System.out.println("Employee Nationality: "+ employee.nationality);
System.out.println("Employee Sex: "+ employee.sex);
System.out.println("Employee Age: "+ employee.age);
System.out.println("Employee Phonenumbers: "+ employee.phoneNumber);
System.out.println("Employee Email: "+ employee.email);
System.out.println("Employee Address: "+ employee.address);

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
 customer.userName = scan.nextLine();

 System.out.println("Enter Password: ");
 customer.password = scan.nextLine();

              if(customer.userName.equals(customer.userName) && customer.password.equals(customer.password)){
              System.out.println(customer.login());
              System.out.println(customer.bookflight());

System.out.println("\n Name: "+ customer.firstName);
System.out.println("Surnname: "+ customer.surName);
System.out.println("\n User Name: "+ customer.userName);
System.out.println("\n Password: "+ customer.password);
System.out.println("Nationality: "+ customer.nationality);
System.out.println("Sex: "+ customer.sex);
System.out.println("Age: "+ customer.age);
System.out.println("Phonenumbers: "+ customer.phoneNumber);
System.out.println("Email: "+ customer.email);
System.out.println("Address: "+ customer.address);
System.out.println("Flight Destination: "+ customer.destination);
System.out.println("Arrival time is: "+ customer.time);

               }else{
               System.out.print("Invalid Username or Password. 2/3 attempts left! ");

System.out.println(" \n Enter Username: ");
customer.userName = scan.nextLine();

System.out.println("Enter Password: ");
 customer.password = scan.nextLine();

             if(customer.userName.equals("customer") && customer.password.equals("123#!")){
            System.out.println(customer.login());
            System.out.println(customer.bookflight());

System.out.println("\n Name: "+ customer.userName);
System.out.println("Surnname: "+ customer.surName);
System.out.println("Nationality: "+ customer.nationality);
System.out.println("Sex: "+ customer.sex);
System.out.println("Age: "+ customer.age);
System.out.println("Phonenumbers: "+ customer.phoneNumber);
System.out.println("Email: "+ customer.email);
System.out.println("Address: "+ customer.address);
System.out.println("Flight Destination: "+ customer.destination);
System.out.println("Arrival time is: "+ customer.time);

             }else{

             System.out.println("Invalid Username or Password. 1/3 attempts left! \n");

 System.out.println("Enter Username:");
 customer.userName = scan.nextLine();

 System.out.println("Enter Password \n");
 customer.password = scan.nextLine();

             if(customer.userName.equals("customer") && customer.password.equals("123#!")){
             System.out.println(customer.login());
             System.out.println(customer.bookflight());

System.out.println("\n Name: "+ customer.userName);
System.out.println("Surname: "+ customer.surName);
System.out.println("Nationality: "+ customer.nationality);
System.out.println("Sex: "+ customer.sex);
System.out.println("Age: "+ customer.age);
System.out.println("Phonenumbers: "+ customer.phoneNumber);
System.out.println("Email: "+ customer.email);
System.out.println("Address: "+ customer.address);
System.out.println("Flight Destination: "+ customer.destination);
System.out.println("Arrival time is: "+ customer.time);


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


