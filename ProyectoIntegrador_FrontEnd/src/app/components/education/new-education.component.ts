import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Education } from 'src/app/model/education';
import { EducationService } from 'src/app/service/education.service';

@Component({
  selector: 'app-new-education',
  templateUrl: './new-education.component.html',
  styleUrls: ['./new-education.component.css']
})
export class NewEducationComponent implements OnInit {
  nameEducation: string = '';
  titleEducation: string = '';
  countryEducation: any;
  yearEducation: any;
  descriptionEducation: string = '';

  constructor(private educationService: EducationService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const newEducation = new Education(this.nameEducation, this.titleEducation, this.yearEducation, this.countryEducation, this.descriptionEducation);
    this.educationService.save(newEducation).subscribe(
      data => {
        alert("Experiencia añadida");
        this.router.navigate(['']);
      }, err => {
        alert("Error");
        this.router.navigate(['']);
      }
    )
  }
}