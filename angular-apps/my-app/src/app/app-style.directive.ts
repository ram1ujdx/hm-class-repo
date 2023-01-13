import { Directive,  HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appStyle]'
})
export class AppStyleDirective {


  @HostBinding('style.backgroundColor')
  bgColor='white'


  @HostListener('mouseenter')
  mouseEnter(){
    this.bgColor='yellow'
  }

  @HostListener('mouseout')
  mouseExit(){
    this.bgColor='white'
  }


  constructor() { }

}
