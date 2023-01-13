import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

  constructor(private _router:Router) {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    console.log("Request Intercepted")
    const jwt = sessionStorage.getItem("hm.auth");
    if(jwt){
      request = request.clone({
        setHeaders:{
          auth:jwt
        }
      })
    }
    // else{
    //   this._router.navigate(['/login'])
    // }
    
    return next.handle(request);
  }
}
