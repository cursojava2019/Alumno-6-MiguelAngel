import { Injectable } from '@angular/core';
import { Alumno } from '../entities/alumno';

@Injectable({
  providedIn: 'root'
})
export class AlumnoService {
  listado: Array<Alumno>;
  constructor() {
    this.listado = new Array<Alumno>();
    this.listado.push (
      new Alumno(0, 'Miguel', 'Victor', 'Segado', 'miguelangelvictor3@gmail.com', new Date(), null, '53596606M', 'Bien', false, '605079002')
    );
    this.listado.push (
      new Alumno(1, 'Juan', 'Lopez', 'Carmona', 'm123@gmail.com', new Date(), null, '12345678M', 'mal', true, '123456789')
    );
  }

  findAll() {
    return this.listado;
  }

  findById(index: number) {
    return this.listado[index];
  }

  create(a: Alumno) {
    this.listado.push(a);
  }

  delete(index: number) {
    return this.listado[index];
  }
}
