import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCompensationComponent } from './add-compensation.component';

describe('AddBookComponent', () => {
  let component: AddCompensationComponent;
  let fixture: ComponentFixture<AddCompensationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddCompensationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddCompensationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
