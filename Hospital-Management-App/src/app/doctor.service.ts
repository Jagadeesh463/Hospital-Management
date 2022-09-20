import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctor } from './doctor';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  private doctorBaseUrl = 'http://localhost:8100/doctor';
  constructor(private http:HttpClient) { }

  getAllDoctors():Observable<Doctor[]>{
    return this.http.get<Doctor[]>(`${this.doctorBaseUrl}/getAllDoctors`);
  }

  addDoctor(doctor:Doctor):Observable<Object>{
    console.log(doctor);
    return  this.http.post<Object>(`${this.doctorBaseUrl}/add`,doctor);
  }
  
  getDoctorname():Observable<String[]>{
    return this.http.get<String[]>(`${this.doctorBaseUrl}/GetDocName`);
  }
}
