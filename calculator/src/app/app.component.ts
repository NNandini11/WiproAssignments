import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'calculator';
 inputone: number =0;
 inputtwo: number =0;
 result: number=0;
  add() {
    this.result = this.inputone + this.inputtwo;
  }
  subtract() {
    this.result = this.inputone - this.inputtwo;
  }
  multiply() {
    this.result = this.inputone * this.inputtwo;
  }
   division() {
    this.result = this.inputone / this.inputtwo;
  }




}
