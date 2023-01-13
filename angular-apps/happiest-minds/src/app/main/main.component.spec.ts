import { MainComponent } from "./main.component"

describe('Main-Component', ()=>{

  let component:MainComponent;

  beforeEach(()=>{
    component =new MainComponent()
  })


  afterEach(()=>{
    
  })

  it('should increment a number by 1 when increment() is called', ()=>
  {
    expect(component.increment(10)).toEqual(11);
  })
}
)