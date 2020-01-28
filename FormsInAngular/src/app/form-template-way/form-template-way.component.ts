import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';

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

    // this.myProductName =  new FormControl(<default value>, <validation rules>);
    // this.myProductName =  new FormControl("", Validators.pattern(""));
    // this.myProductName =  new FormControl("", Validators.maxLength(10));
    this.myProductName =  new FormControl("", Validators.required);
    // formGroup is initialized using formbuilder
    this.myFormGroup = formBuilder.group({
        // members of a anonymous class
        // form controls
        "product_name" : this.myProductName,
        // inbuilt angular validation rules
        "product_category" : new FormControl("Books", Validators.required),
        // "product_cost" : new FormControl("500", this.rangeCheck) // method name of constraint
        // add multipe constriant
      //Validators.compose used to apply mutliple constraints
        "product_cost" : new FormControl("500", Validators.compose([Validators.required, this.rangeCheck])) // array of validation rules 
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


  // custom validation function
  // 1. it will passed with a param : FormControl : Control on which constraint to be applied
  // 2. in case of invalidity : return an object with a single data member
  rangeCheck(txtControl : FormControl){
    if(parseInt(txtControl.value) < 100 ||parseInt(txtControl.value) > 1000)
        return {
                  // <constraint name> : <boolean>
                  "range" : true  // if constriant fails
              }



  }



  ngOnInit() {
  }

}
