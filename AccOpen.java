package com.ruthik.www;

class Identity {
 void identification() {
     System.out.println("Enter your valid ID proof");
 }

 void verification() {
     System.out.println("You can successfully open bank account");
 }
}

class Aadhaar extends Identity {
 void verification() {
     System.out.println("Your Aadhaar is verified. Now you can open bank account.");
 }
}

class PAN extends Identity {
 void verification() {
     System.out.println("Your PAN is verified.");
 }
}

class VoterID extends Identity {
 void verification() {
     System.out.println("Your Voter ID is verified. Now you can open bank account.");
 }
}


class Acceptance {
 void Bank(Identity v) {
	 v.identification();
     v.verification();  
 }
}

public class AccOpen {
 public static void main(String[] args) {
	 Acceptance a = new Acceptance();
	 
     Identity id1 = new Aadhaar();
     a.Bank(id1);
     
     Identity id2 = new PAN();
     a.Bank(id2);
     
     Identity id3 = new VoterID();
     a.Bank(id3);
     
 }
}