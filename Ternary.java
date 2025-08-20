package com.ruthik.www;

public class Ternary {

	public static void main(String[] args) {
		String customerMood = "Angry";
		String response;
		response =(customerMood.equals("Happy")||customerMood.equals("Excited"))?"Thankyou for your feedback !":
			(customerMood.equals("Angry")||customerMood.equals("frustrated"))?"We apologize for the inconvience":
				"How may I assist you today";
		System.out.println("The overall feedback = "+response);
	}

}


