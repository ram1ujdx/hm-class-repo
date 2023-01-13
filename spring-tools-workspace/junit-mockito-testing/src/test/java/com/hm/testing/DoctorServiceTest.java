package com.hm.testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import com.hm.testing.repo.DoctorRepo;


@ExtendWith(MockitoExtension.class)
class DoctorServiceTest {

	@InjectMocks
	DoctorService service;
	
	@Mock
	DoctorRepo repo;
	
	@Test
	void testAddDoctor() {
		String doctorName = "Harsh";
		
		when(repo.addDorctor(doctorName)).thenReturn("Added "+doctorName);
		
		assertEquals("Added Harsh", service.addDoctor(doctorName));
		
	}

}
