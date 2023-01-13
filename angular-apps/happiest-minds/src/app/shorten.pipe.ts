import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'shorten'
})
export class ShortenPipe implements PipeTransform {

  transform(value: string, count:number=0): string {
    const str = value;
      if(str.length>=count){
      const c = str.charAt(0)
      const surname = str.split(' ')[1]
      return c+". "+surname
  }
    return value;
  }

}


