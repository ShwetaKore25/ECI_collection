package com.tka.eci.candidate.client;

import java.util.List;
import com.tka.eci.candidate.controller.ElectionController;
import com.tka.eci.candidate.entity.Candidate;

public class ElectionApp {

	
	    public static void main(String[] args) {
	        ElectionController electionController = new ElectionController();

	        // Add candidates to the system
	        electionController.addCandidate("Devendra Fadnavis", "Nagpur South", "Maharashtra", "BJP", 54, "Male");
	        electionController.addCandidate("Aarti Deshmukh", "Pune", "Maharashtra", "Congress", 42, "Female");
	        electionController.addCandidate("Uddhav Thackeray", "Shivaji Park", "Maharashtra", "Shiv Sena", 63, "Male");
	        electionController.addCandidate("Anjali Rajput", "Kolhapur", "Maharashtra", "BJP", 36, "Female");
	        electionController.addCandidate("Ajit Pavar", "Baramati", "Maharashtra", "NCP", 64, "Male");

	        // Displaying all candidates
	        System.out.println("All Candidates:");
	        List<Candidate> allCandidates = electionController.getAllCandidates();
	        allCandidates.forEach(System.out::println);

	        // Displaying candidates by party
	        System.out.println("\nCandidates from BJP:");
	        List<Candidate> bjpCandidates = electionController.getCandidatesByParty("BJP");
	        bjpCandidates.forEach(System.out::println);

	        // Displaying candidates by gender
	        System.out.println("\nMale Candidates:");
	        List<Candidate> maleCandidates = electionController.getCandidatesByGender("Male");
	        maleCandidates.forEach(System.out::println);

	        // Displaying candidates by age range (e.g., 40-60 years)
	        System.out.println("\nCandidates aged between 40 and 60:");
	        List<Candidate> ageRangeCandidates = electionController.getCandidatesByAgeRange(40, 60);
	        ageRangeCandidates.forEach(System.out::println);
	    }
	}
