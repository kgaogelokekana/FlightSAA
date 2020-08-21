package com.flysaa.person;

public class Customer extends Person{

public String landing;
public String flight;
public String arrivalTime;


public String login(){
return "\n YOU HAVE SUCCESSFULLY LOGGED IN \n";
}

public String checkIn(){
return "YOU HAVE CHECKED INTO SOUTH AFRICAN INTERNATIONAL AIRPORT";
}

public String checkOut(){
return "THANKS FOR FLYING WITH SAA. YOU HAVE CHECKED OUT";
}

}
