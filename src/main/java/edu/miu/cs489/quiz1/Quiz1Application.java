package edu.miu.cs489.quiz1;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs489.quiz1.model.Contact;
import edu.miu.cs489.quiz1.model.EmailAddress;
import edu.miu.cs489.quiz1.model.PhoneNumber;

@SpringBootApplication
public class Quiz1Application {

	public static void main(String[] args) {

		// Time was running out so i just added contact information manually into
		// dataset
		//Implemented equals so it can remove duplicate without problem once implemented
		SpringApplication.run(Quiz1Application.class, args);

		Contact[] contacts = {
				new Contact("David", "Sanger", "Argos LLC", "Sales Manager"),
				new Contact("Carlos", "Jimenez", "Zappos", "Director"),
				new Contact("Ali", "Gafar", "BMI services", "HR Manager"),
		};
		PhoneNumber pn1 = new PhoneNumber("240-133-0011", "Home", contacts[0]);
		PhoneNumber pn2 = new PhoneNumber("240-112-0123", "Mobile", contacts[0]);
		PhoneNumber pn3 = new PhoneNumber("412-116-9988", "Work", contacts[2]);

		EmailAddress em1 = new EmailAddress("dave.sang@gmail.com", "Home", contacts[0]);
		EmailAddress em2 = new EmailAddress("dsanger@argos.com", "Work", contacts[0]);
		EmailAddress em3 = new EmailAddress("ali@bmi.com", "Work", contacts[2]);


		printContact(contacts);
	}

	private static void printContact(Contact[] contacts) {
		Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));
		StringBuilder sb = new StringBuilder("[");
		for (Contact e : contacts) {
			sb.append(e);
		}
		if (sb.length() > 2) {
			sb.deleteCharAt(sb.length() - 2);
		}

		sb.append("]");
		System.out.println(sb.toString());
	}

	

}
