import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { AbstractControl, AsyncValidator, ValidationErrors } from "@angular/forms";
import { catchError, map, Observable,of } from "rxjs";
import { Employee } from "./Employee";
import { EmployeeApiService } from "./employee-api.service";


export class ForbiddenKeywordsValidator implements AsyncValidator{
constructor(private _http:HttpClient,){
    console.log("Object Created")
}
    validate(control: AbstractControl<any, any>): Promise<ValidationErrors | null> | Observable<ValidationErrors | null> {
        console.log(this._http)
        throw new Error("Method not implemented.");
    }
    registerOnValidatorChange?(fn: () => void): void {
        throw new Error("Method not implemented.");
    }
    
    
    
    

}