import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewReportComponent } from './view-reports.component';

describe('ViewBookComponent', () => {
  let component: ViewReportComponent;
  let fixture: ComponentFixture<ViewReportComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewReportComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewReportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
