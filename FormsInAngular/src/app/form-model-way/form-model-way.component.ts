import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form-model-way',
  templateUrl: './form-model-way.component.html',
  styleUrls: ['./form-model-way.component.css']
})
export class FormModelWayComponent implements OnInit {

  name : string;
  category : string;
  cost :number;

  constructor() { }

  ngOnInit() {
  }

  saveProduct(frm:any){
      this.name = frm.pname;
      this.category = frm.pcat;
      this.cost = parseInt(frm.pcost);

  }

}
