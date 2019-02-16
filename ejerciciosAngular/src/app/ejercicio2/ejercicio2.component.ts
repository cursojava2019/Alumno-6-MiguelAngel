import { Component, OnInit } from '@angular/core';
import { Empleado } from '../model/empleado';

@Component({
  selector: 'app-ejercicio2',
  templateUrl: './ejercicio2.component.html',
  styleUrls: ['./ejercicio2.component.css']
})
export class Ejercicio2Component implements OnInit {

  empleado: Empleado;

  constructor() {
    this.empleado = new Empleado('Pablo', 'Rodriguez', 40, [1700, 1600, 1900]);
  }

  ngOnInit() {
  }

}
