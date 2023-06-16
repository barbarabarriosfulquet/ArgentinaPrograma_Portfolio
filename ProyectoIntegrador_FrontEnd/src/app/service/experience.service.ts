import { Injectable } from '@angular/core';
import { Experience } from '../model/experience';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ExperienceService {
  workexpURL = 'http://localhost:8080/workexp/'
  constructor(private httpClient: HttpClient) { }

  public list(): Observable<Experience[]> {
    return this.httpClient.get<Experience[]>(this.workexpURL + 'list');
  }

  public detail(id: number): Observable<Experience> {
    return this.httpClient.get<Experience>(this.workexpURL + `detail/${id}`);
  }

  public save(experience: Experience): Observable<any> {
    return this.httpClient.post<any>(this.workexpURL + 'create', experience);
  }

  public update(id: number, experience: Experience): Observable<any> {
    return this.httpClient.put<any>(this.workexpURL + `update/${id}`, experience);
  }

  public delete(id: number): Observable<any> {
    return this.httpClient.delete<any>(this.workexpURL + `delete/${id}`);
  }
}