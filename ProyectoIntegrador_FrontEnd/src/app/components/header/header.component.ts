import { Component, OnInit } from '@angular/core';
import { person } from 'src/app/model/person.model';
import { PersonService } from 'src/app/service/person.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  person: person = new person("", "", "");
  constructor(public personService: PersonService) { }
  ngOnInit(): void {
    this.personService.getPerson().subscribe(data => { this.person = data })
  }
}
