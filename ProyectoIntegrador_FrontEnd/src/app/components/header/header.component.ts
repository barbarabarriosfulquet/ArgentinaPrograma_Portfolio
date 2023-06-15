import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { person } from 'src/app/model/person.model';
import { PersonService } from 'src/app/service/person.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isLogged = false;
  person: person = new person("", "", "");
  constructor(public personService: PersonService, private router: Router, private tokenService: TokenService) { }
  ngOnInit(): void {
    if(this.tokenService.getToken()){
      this.isLogged=true;
    }else{
      this.isLogged = false;
    }
    this.personService.getPerson().subscribe(data => { this.person = data })
  }

  logout():void{
    this.tokenService.logOut();
    window.location.reload();
  }

  login() {
    this.router.navigate(['/login'])
  }
}
