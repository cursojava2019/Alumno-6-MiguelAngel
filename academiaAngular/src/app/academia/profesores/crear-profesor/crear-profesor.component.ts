import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';
import { Router } from '@angular/router';

@Component({
  selector: 'app-crear-profesor',
  templateUrl: './crear-profesor.component.html',
  styleUrls: ['./crear-profesor.component.scss'],
  animations: [routerTransition()]
})
export class CrearProfesorComponent implements OnInit {

  constructor(private profesorService: ProfesorService, private router: Router) { }

  ngOnInit() {
  }

  crear(a: Profesor) {
    this.profesorService.create(a).subscribe(data => {
      this.router.navigate(['profesores']);
    });
  }
}
