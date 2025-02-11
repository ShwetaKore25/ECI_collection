package com.tka.eci.candidate.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.eci.candidate.entity.Candidate;

public class CandidateDAO {
	
	
	    // List to store candidates
	    private List<Candidate> candidates = new ArrayList<>();

	    // Add a candidate
	    public void addCandidate(Candidate candidate) {
	        candidates.add(candidate);
	    }

	    // Get all candidates
	    public List<Candidate> getAllCandidates() {
	        return candidates;
	    }

	    // Get candidates by party
	    public List<Candidate> getCandidatesByParty(String partyName) {
	        List<Candidate> result = new ArrayList<>();
	        for (Candidate candidate : candidates) {
	            if (candidate.getPartyName().equalsIgnoreCase(partyName)) {
	                result.add(candidate);
	            }
	        }
	        return result;
	    }

	    // Get candidates by gender
	    public List<Candidate> getCandidatesByGender(String gender) {
	        List<Candidate> result = new ArrayList<>();
	        for (Candidate candidate : candidates) {
	            if (candidate.getGender().equalsIgnoreCase(gender)) {
	                result.add(candidate);
	            }
	        }
	        return result;
	    }

	    // Get candidates by age range
	    public List<Candidate> getCandidatesByAgeRange(int minAge, int maxAge) {
	        List<Candidate> result = new ArrayList<>();
	        for (Candidate candidate : candidates) {
	            if (candidate.getAge() >= minAge && candidate.getAge() <= maxAge) {
	                result.add(candidate);
	            }
	        }
	        return result;
	    }
	}

