import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule, FormsModule } from '@angular/forms';
import { MaterialModule } from './material.module';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ReactiveFormsModule, FormsModule, MaterialModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  myFormGroup: FormGroup;

  constructor(private fb: FormBuilder) {
    this.myFormGroup = this.fb.group({
      name: ['', [Validators.required, Validators.minLength(8)]],
      email: ['', [Validators.required, Validators.email]],
      subject: ['', [Validators.required, Validators.maxLength(40)]],
      issue: ['', [Validators.required, Validators.maxLength(350)]],
    });
  }

  
  touch(controlName: string) {
    const c = this.myFormGroup.get(controlName);
    if (c && !c.touched) {
      c.markAsTouched();
      c.updateValueAndValidity({ onlySelf: true });
    }
  }

  onSubmitReact(): void {
    if (!this.myFormGroup.valid) {
      this.myFormGroup.markAllAsTouched(); 
    } else {
      console.log('Form submitted:', this.myFormGroup.value);
      this.myFormGroup.reset();
    }
  }
}
