import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-form-template-way',
  templateUrl: './form-template-way.component.html',
  styleUrls: ['./form-template-way.component.css']
})
export class FormTemplateWayComponent implements OnInit {


  name : string;
  category : string;
  cost : number;
  // virtual Form 
  myFormGroup : FormGroup;
  myProductName : FormControl;

  // FormModule/ReactiveFormsModule : they inject a FormBuilder to constructors of all component
  constructor(formBuilder : FormBuilder) { 

    this.myProductName =  new FormControl();

    // formGroup is initialized using formbuilder
    this.myFormGroup = formBuilder.group({
        // members of a anonymous class
        // form controls
        "product_name" : this.myProductName,
        "product_category" : new FormControl(),
        "product_cost" : new FormControl()
    });

      /*var first ={
        name : "First",
        age : 20  
      };*/
  }

  saveProduct(){
    // this.name = this.myFormGroup.controls['product_name'].value;
    this.name = this.myProductName.value;
    this.category = this.myFormGroup.controls['product_category'].value;
    this.cost = parseInt(this.myFormGroup.controls['product_cost'].value);

  }

  ngOnInit() {
  }

}
