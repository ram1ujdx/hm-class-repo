import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

  constructor() {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    console.log("Interceptor Worked")
    const token = sessionStorage.getItem("hm.auth");
    if(token){
   request = request.clone(
      {
        setHeaders:{
          auth:token
        }
      }
    )
    }
    return next.handle(request);
  }
}
