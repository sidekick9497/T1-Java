import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-handling',
  templateUrl: './data-handling.component.html',
  styleUrls: ['./data-handling.component.css']
})
export class DataHandlingComponent  {

  name : string;
  age : number;
  email : string;
  job : string;
  hobbies : string[];
  
  constructor() { 
    this.name = "First";
    this.age = 20;
    this.email = "first@mail.com";
    this.job = "Developer";
    this.hobbies = ['Basketball', "Riding", 'Baseball', 'Chess'];
  }

  isEligible():boolean{
    if(this.age >=18)
      return true;
    return false;
  }

  showMessage():string{
    return "Hello All";
  }

  changeVal():void{
    this.name = "Second";
    this.age = 15;
    this.email = "second@email.com";
    this.job = "Manager";
  }
  
}
