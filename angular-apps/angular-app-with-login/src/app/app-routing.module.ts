import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminHomeComponent } from './admin/admin-home/admin-home.component';
import { AuthGuard } from './auth.guard';
import { FlightBookingComponent } from './flight-booking/flight-booking.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {
    path:'login', component:LoginComponent
  },
  {
    path:'flights', component:FlightBookingComponent, canActivate:[AuthGuard]
  },
  {
    path:'admin', component:AdminHomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
