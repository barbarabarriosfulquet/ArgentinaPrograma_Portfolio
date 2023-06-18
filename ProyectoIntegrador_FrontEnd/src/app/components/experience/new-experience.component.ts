import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Experience } from 'src/app/model/experience';
import { ExperienceService } from 'src/app/service/experience.service';

@Component({
  selector: 'app-new-experience',
  templateUrl: './new-experience.component.html',
  styleUrls: ['./new-experience.component.css']
})
export class NewExperienceComponent implements OnInit {
  nameExperience: string = '';
  titleExperience: string = '';
  countryExperience: any;
  yearExperience: any;
  descriptionExperience: string = '';

  constructor(private experienceService: ExperienceService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const newExperience = new Experience(this.nameExperience, this.titleExperience, this.yearExperience, this.countryExperience, this.descriptionExperience);
    this.experienceService.save(newExperience).subscribe(
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