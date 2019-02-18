import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-modificar-profesor',
  templateUrl: './modificar-profesor.component.html',
  styleUrls: ['./modificar-profesor.component.scss'],
  animations: [routerTransition()]
})
export class ModificarProfesorComponent implements OnInit {
  profesorActual: Profesor;
  constructor(private rutaActiva: ActivatedRoute, private profesorService: AlumnoService, private router: Routerter) {

  }

  ngOnInit() {
    const id = this.rutaActiva.snapshot.params.idAlumno;
    this.profesorService.findById(id).subscribe(data => {
      this.profesorActual = data;
      console.log(this.profesorActual);
    });
  }

  modificar(a: Profesor) {
    this.profesorService.modificar(a).subscribe(data => {
      this.router.navigate(['profesores']);
    });
  }
}
