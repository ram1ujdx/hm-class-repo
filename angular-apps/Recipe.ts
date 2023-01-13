export class Recipe{
    meals:Array<Recipe>
}

interface Meal {
        strMeal:string;
        strArea:string;
        strCategory:string;
        strInstructions:string;
        strMealThumb:string;
}