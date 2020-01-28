import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormTemplateWayComponent } from './form-template-way.component';

describe('FormTemplateWayComponent', () => {
  let component: FormTemplateWayComponent;
  let fixture: ComponentFixture<FormTemplateWayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormTemplateWayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormTemplateWayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
