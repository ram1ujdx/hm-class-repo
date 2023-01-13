import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewDepartmentsComponent } from './view-departments/view-departments.component';

const routes: Routes = [
  {
    path:'',component:ViewDepartmentsComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DepartmentsRoutingModule { }
