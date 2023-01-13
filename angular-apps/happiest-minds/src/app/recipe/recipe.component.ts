import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Recipe } from '../Recipe';
import { RecipeClientService } from '../recipe-client.service';

@Component({
  selector: 'app-recipe',
  templateUrl: './recipe.component.html',
  styleUrls: ['./recipe.component.css']
})
export class RecipeComponent implements OnInit {

  constructor(private _recipeClient:RecipeClientService) { }
  recipe?:Recipe;
  ngOnInit(): void {
    this._recipeClient.findRecipe('pizza')
            .subscribe(
              (recipe)=>{
                this.recipe=recipe;
                console.log(this.recipe.meals[0])
              }
            )
  }

}
