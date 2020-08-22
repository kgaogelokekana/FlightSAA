package com.flysaa.person;

public class Person{

private String firstName;
public void setFirstName(String firstName){
this.firstName = firstName;
}
public String getFirstName(){
return firstName;
}

private String surName;
public void setSurName(String surName){
this.surName = surName;
}
public String getSurName(){
return surName;
}

private String userName;
public void setUserName(String userName){
this.userName = userName;
}
public String getUserName(){
return userName;
}

private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return password;
}

private String nationality;
public void setNationality(String nationality){
this.nationality = nationality;
}
public String getNationality(){
return nationality;
}

private String sex;
public void setSex(String sex){
this.sex = sex;
}
public String getSex(){
return sex;
}

public String age;
public void setAge(String age){
this.age = age;
}
public String getAge(){
return age;
}

private String phoneNumber;
public void setPhoneNumber(String phoneNumber){
this.phoneNumber = phoneNumber;
}
public String getPhoneNumber(){
return phoneNumber;
}


private String email;
public void setEmail(String email){
this.email = email;
}
public String getEmail(){
return email;
}

public String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return address;
}

private String destination;
public void setDestination(String destination){
this.destination = destination;
}
public String getDestination(){
return destination;
}


private String time;
public void setTime(String time){
this.time = time;
}
public String getTime(){
return time;
}

private String position;
public void setPosition(String position){
this.position = position;
}
public String getPosition(){
return position;
}

public String login(){
return "Hello World";
}

public String bookflight(){
return "You have booked a flight";
}

public String payment(){
return "Transaction Successful";
}

}
