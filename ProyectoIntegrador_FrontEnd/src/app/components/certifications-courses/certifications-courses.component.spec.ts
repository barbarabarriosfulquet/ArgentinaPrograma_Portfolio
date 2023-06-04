import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CertificationsCoursesComponent } from './certifications-courses.component';

describe('CertificationsCoursesComponent', () => {
  let component: CertificationsCoursesComponent;
  let fixture: ComponentFixture<CertificationsCoursesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CertificationsCoursesComponent]
    });
    fixture = TestBed.createComponent(CertificationsCoursesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
