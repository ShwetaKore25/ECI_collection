package com.tka.eci.candidate.service;

import java.util.List;

import com.tka.eci.candidate.dao.CandidateDAO;
import com.tka.eci.candidate.entity.Candidate;

public class CandidateService {
	
	
	   private CandidateDAO candidateDAO = new CandidateDAO();

	    // Add a candidate
	    public void addCandidate(Candidate candidate) {
	        candidateDAO.addCandidate(candidate);
	    }

	    // Get all candidates
	    public List<Candidate> getAllCandidates() {
	        return candidateDAO.getAllCandidates();
	    }

	    // Get candidates by party
	    public List<Candidate> getCandidatesByParty(String partyName) {
	        return candidateDAO.getCandidatesByParty(partyName);
	    }

	    // Get candidates by gender
	    public List<Candidate> getCandidatesByGender(String gender) {
	        return candidateDAO.getCandidatesByGender(gender);
	    }

	    // Get candidates by age range
	    public List<Candidate> getCandidatesByAgeRange(int minAge, int maxAge) {
	        return candidateDAO.getCandidatesByAgeRange(minAge, maxAge);
	    }
	}

	
	
