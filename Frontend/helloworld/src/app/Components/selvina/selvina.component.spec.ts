import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelvinaComponent } from './selvina.component';

describe('SelvinaComponent', () => {
  let component: SelvinaComponent;
  let fixture: ComponentFixture<SelvinaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelvinaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SelvinaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
