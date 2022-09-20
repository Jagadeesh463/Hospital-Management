import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { CreateddoctorComponent } from './createddoctor/createddoctor.component';
import { CreatedpatientComponent } from './createdpatient/createdpatient.component';
import { DoctorComponent } from './doctor/doctor.component';
import { HomePageComponent } from './home-page/home-page.component';
import { PatientComponent } from './patient/patient.component';
import { ServicesComponent } from './services/services.component';
import { ShowdoctorComponent } from './showdoctor/showdoctor.component';
import { ShowpatientComponent } from './showpatient/showpatient.component';

const routes: Routes = [  {path : "", component: HomePageComponent},
{path : "addPatient", component : PatientComponent, pathMatch : "full"},
{path : "addDoctor", component : DoctorComponent, pathMatch : "full"},
{path : "showDoctor", component : ShowdoctorComponent, pathMatch : "full"},
{path: 'showPatient',component: ShowpatientComponent},
{path : "createddoctor", component: CreateddoctorComponent},
{path : "contactUs", component : ContactUsComponent, pathMatch : "full"},
{path : "about", component : AboutComponent, pathMatch : "full"},
{path : "services", component : ServicesComponent, pathMatch : "full"},
{path : 'createdpatient', component: CreatedpatientComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
