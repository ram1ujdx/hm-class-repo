import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DepartmentsRoutingModule } from './departments-routing.module';
import { ViewDepartmentsComponent } from './view-departments/view-departments.component';


@NgModule({
  declarations: [
    ViewDepartmentsComponent
  ],
  imports: [
    CommonModule,
    DepartmentsRoutingModule
  ]
})
export class DepartmentsModule { }
