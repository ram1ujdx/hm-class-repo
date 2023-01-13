import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { MainComponent } from './main/main.component';
import { EmployeeFormComponent } from './employee-form/employee-form.component';
import { ViewEmployeeComponent } from './view-employee/view-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { GitApiComponent } from './git-api/git-api.component';
import { ShortenPipe } from './shorten.pipe';
import { ShowEmployeeComponent } from './show-employee/show-employee.component';
import { RecipeComponent } from './recipe/recipe.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { EmployeeFormReactiveComponent } from './employee-form-reactive/employee-form-reactive.component';
import { ForbiddenKeywordsValidator } from './ForbiddenKeywordsValidator';
import { EmployeeApiService } from './employee-api.service';
import { AuthInterceptor } from './auth.interceptor';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MainComponent,
    EmployeeFormComponent,
    ViewEmployeeComponent,
    UpdateEmployeeComponent,
    GitApiComponent,
    ShortenPipe,
    ShowEmployeeComponent,
    RecipeComponent,
    ErrorComponent,
    HomeComponent,
    LoginComponent,
    EmployeeFormReactiveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule, 
    HttpClientModule
  ],
  providers: [
    {
      provide:HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi:true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
