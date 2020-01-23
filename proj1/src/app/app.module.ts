import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

// annotation to register current class as a Module
@NgModule({
  // array to register all the child component
  declarations: [ 
    AppComponent
  ],
  // classes mentioned here will be imported to all child elements
  imports: [
    BrowserModule
  ],
  // used to inject objects in child elements
  providers: [],
  // which component allowed to be used in index.html
  bootstrap: [AppComponent]
})
export class AppModule { }
