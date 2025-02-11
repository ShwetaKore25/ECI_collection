package com.tka.eci.candidate.controller;

import java.util.List;

import com.tka.eci.candidate.entity.Candidate;
import com.tka.eci.candidate.service.CandidateService;

public class ElectionController {
	
	    private CandidateService candidateService = new CandidateService();

	    // Add a new candidate
	    public void addCandidate(String name, String assembly, String stateName, String partyName, int age, String gender) {
	        Candidate candidate = new Candidate(name, assembly, stateName, partyName, age, gender);
	        candidateService.addCandidate(candidate);
	    }

	    // Display all candidates
	    public List<Candidate> getAllCandidates() {
	        return candidateService.getAllCandidates();
	    }

	    // Display candidates by party
	    public List<Candidate> getCandidatesByParty(String partyName) {
	        return candidateService.getCandidatesByParty(partyName);
	    }

	    // Display candidates by gender
	    public List<Candidate> getCandidatesByGender(String gender) {
	        return candidateService.getCandidatesByGender(gender);
	    }

	    // Display candidates by age range
	    public List<Candidate> getCandidatesByAgeRange(int minAge, int maxAge) {
	        return candidateService.getCandidatesByAgeRange(minAge, maxAge);
	    }
	}
