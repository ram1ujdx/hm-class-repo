import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { GreetComponent } from './greet/greet.component';
import { PersonComponent } from './person/person.component';
import { AppStyleDirective } from './app-style.directive';

@NgModule({
  declarations: [
    AppComponent,
    GreetComponent,
    PersonComponent,
    AppStyleDirective
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
