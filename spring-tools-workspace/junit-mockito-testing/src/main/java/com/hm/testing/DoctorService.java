package com.hm.testing;

import com.hm.testing.repo.DoctorRepo;

public class DoctorService {

	
	private DoctorRepo repo;
	
	

	public DoctorRepo getRepo() {
		return repo;
	}



	public void setRepo(DoctorRepo repo) {
		this.repo = repo;
	}



	public String addDoctor(String doctorName) {
		
		return repo.addDorctor(doctorName);
		
	}
	
}
