import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'entry-form',
  templateUrl: './entry-form.component.html',
  styleUrls: ['./entry-form.component.css']
})
export class EntryFormComponent  {
  name:string;
  email:string;
  age:number;

  saveData(uname:HTMLInputElement, uemail:HTMLInputElement, uage:HTMLInputElement){
    this.name = uname.value;
    this.email = uemail.value;
    this.age = parseInt(uage.value);
    uname.value = "";
    uemail.value = "";
    uage.value = "";
  }
}
