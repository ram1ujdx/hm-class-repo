import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Recipe } from './Recipe';

@Injectable({
  providedIn: 'root'
})
export class RecipeClientService {
  RECIPE_SERVICE_URI="https://www.themealdb.com/api/json/v1/1/search.php?s=";
  constructor(private _httpClient:HttpClient) { }

  findRecipe(itemName:string):Observable<Recipe>{
     return this._httpClient.get<Recipe>(this.RECIPE_SERVICE_URI+itemName);
  }

}
