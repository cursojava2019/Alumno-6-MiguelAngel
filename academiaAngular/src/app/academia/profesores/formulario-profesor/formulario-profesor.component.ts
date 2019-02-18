import { Component, OnInit, Input, Output, EventEmitter  } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-formulario-profesor',
  templateUrl: './formulario-profesor.component.html',
  styleUrls: ['./formulario-profesor.component.scss']
})
export class FormularioProfesorComponent implements OnInit {

  miFormulario: FormGroup;

  @Input()
  modificar = false;

  @Input()
  profesorModificar: Profesor;

  @Output()
  modificado = new EventEmitter<Profesor>();

  constructor(private fb: FormBuilder) {

  }

  ngOnInit() {
    this.miFormulario = this.fb.group({
      nombre: this.fb.control('', [
        Validators.required,
        Validators.minLength(3)
      ]),
      apellido1: this.fb.control('', [
        Validators.required,
        Validators.minLength(3)
      ]),
      apellido2: this.fb.control('', [
        Validators.required,
        Validators.minLength(3)
      ]),
      nif: this.fb.control('', [
        Validators.required,
        Validators.minLength(9),
        Validators.maxLength(9)
      ]),
      telefono: this.fb.control('', [
        Validators.required
      ]),
      correo: this.fb.control('', [
        Validators.required,
        Validators.email
      ]),
      titulacion: this.fb.control('', [
      ]),
    });
    if (this.modificar === true) {
      this.miFormulario.setValue(this.profesorModificar);
    }
  }

  guardarCambios() {
    if (this.modificar === false) {
      const profesorForm: Profesor = this.miFormulario.value;
      profesorForm.fechaAlta = new Date();
      this.modificado.next(profesorForm);
    } else {
      const profesorForm: Profesor = this.miFormulario.value;
      this.modificado.next(profesorForm);
    }
  }

}
