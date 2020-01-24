import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormModelWayComponent } from './form-model-way.component';

describe('FormModelWayComponent', () => {
  let component: FormModelWayComponent;
  let fixture: ComponentFixture<FormModelWayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormModelWayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormModelWayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
