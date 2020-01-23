import { Component } from '@angular/core';

// flag annotation to define a class as component
@Component({
  selector: 'my-app-root', // custom tag-name
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title  = 'base-app'; // any
}
