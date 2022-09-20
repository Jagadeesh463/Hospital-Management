	package com.mindtree;
	
	import java.util.Date;
	import static org.junit.jupiter.api.Assertions.assertEquals;
	import static org.mockito.Mockito.when;
	import java.util.*;
	import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
	import org.junit.jupiter.api.Order;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.TestMethodOrder;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	
	import com.mindtree.controller.PatientController;
	import com.mindtree.entity.Patient;
	import com.mindtree.service.IPatientService;
	
	
	
	@SpringBootTest(classes={Application.class})
	@TestMethodOrder(OrderAnnotation.class)
	class ApplicationTests {
	
		@Mock
		IPatientService patService;
	
		@InjectMocks
		PatientController con;
	
		List<Patient> patList;
		Patient pat;
		ResponseEntity<?> resp;
	
		@Test
		@Order(1)
	
		public void testGetAllPatients() {
	
			patList = new ArrayList<>();
			patList.add(new Patient(1,"arun","bharat", new Date(),"Lt"));
			patList.add(new Patient(2,"bhagya","sindu", new Date(),"Lt"));
	
			when( patService.fetchAllPatients()).thenReturn(patList);
	
			resp = con.getAllPatients();
	
			assertEquals(HttpStatus.OK, resp.getStatusCode());
		}
		@Test
		@Order(2)
		public void test_getallPatientbyId() {
			pat = new Patient(1,"arun","Guha",null,"Lt");
	
	int id = 1;
	
	when( patService.fetchAPatient(id)).thenReturn(pat);
	
	resp = con.getAPatient(id);
	
	assertEquals(HttpStatus.OK, resp.getStatusCode());
	
	}
		@Test
		@Order(3)
		public void test_addPatient(){

			pat = new Patient(4,"Jagadesh","uha",new Date(),"Lt");

			when( patService.addPatient(pat)).thenReturn(pat);

			resp = con.addPatient(pat);

			assertEquals(HttpStatus.CREATED, resp.getStatusCode());
		}}