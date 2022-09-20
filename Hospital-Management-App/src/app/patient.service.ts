import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Patient } from './patient';
@Injectable({
  providedIn: 'root'
})
export class PatientService {

  private patientBaseUrl = 'http://localhost:8100/patient';
  private baseurl="http://localhost:8100/patient/getAllPatients";
  private baseurlByid="http://localhost:8100/patient/getPatient" ;

  constructor(private http:HttpClient) { }

  getAllPatients():Observable<Patient[]>{
    return this.http.get<Patient[]>(`${this.patientBaseUrl}/getAllDoctors`);
  }

  addPatient(patient:Patient):Observable<Object>{
    console.log(patient);
    return  this.http.post<Object>(`${this.patientBaseUrl}/add`,patient);
  }


  getPatientList(): Observable<Patient[]>{
    return this.http.get<Patient[]>(`${this.baseurl}`);

  }

  getPatientById(id:any): Observable<Patient>{
    return this.http.get<Patient>(`${this.baseurlByid}/${id}`);

  }
}
