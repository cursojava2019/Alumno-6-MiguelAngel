import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProfesoresRoutingModule } from './profesores-routing.module';
import { ProfesoresComponent } from './profesores.component';
import { CrearProfesorComponent } from './crear-profesor/crear-profesor.component';
import { FormularioProfesorComponent } from './formulario-profesor/formulario-profesor.component';
import { ModificarProfesorComponent } from './modificar-profesor/modificar-profesor.component';

@NgModule({
  declarations: [ProfesoresComponent, CrearProfesorComponent, FormularioProfesorComponent, ModificarProfesorComponent],
  imports: [
    CommonModule,
    ProfesoresRoutingModule
  ]
})
export class ProfesoresModule { }
