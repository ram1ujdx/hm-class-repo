import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { EmployeeFormReactiveComponent } from './employee-form-reactive/employee-form-reactive.component';
import { EmployeeFormComponent } from './employee-form/employee-form.component';
import { ErrorComponent } from './error/error.component';
import { GitApiComponent } from './git-api/git-api.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RecipeComponent } from './recipe/recipe.component';
import { ShowEmployeeComponent } from './show-employee/show-employee.component';
import { ViewEmployeeComponent } from './view-employee/view-employee.component';

const routes: Routes = [
{
  path:'', component:HomeComponent
},

{
  path:'login', component:LoginComponent
},

  {
    path: 'add-employee', component: EmployeeFormComponent, canActivate:[AuthGuard]
  },
  {
    path:'add-employee-reactive', component:EmployeeFormReactiveComponent
  },
  {
    path: 'view-employee', component: ViewEmployeeComponent,
    children: [
      {
        path: ':id', component: ShowEmployeeComponent
      }
    ]
  },
  // {
  //   path:'view-employee/:id', component:ShowEmployeeComponent
  // },
  {
    path: 'git-info', component: GitApiComponent
  },
  {
    path:'recipe', component:RecipeComponent
  },
  {
    path:'department', 
    loadChildren: ()=> import('./departments/departments.module').then(m=>m.DepartmentsModule)
  },
  {
    path:'error', component:ErrorComponent
  },
  {
    path:'**', redirectTo:"/error"
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
