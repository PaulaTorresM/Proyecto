/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var formulario = document.getElementById('form');
var inputs = document.querySelectorAll('#form input');

var expresiones = {
	//usuario: /^[a-zA-Z0-9\_\-]{4,16}$/, // Letras, numeros, guion y guion_bajo
	//tdocumento: 
        textUsuario: /^[a-zA-ZÀ-ÿ\s]{2,30}$/, // Letras y espacios, pueden llevar acentos.
        textClave: /^.{4,12}$/, // 4 a 12 digitos.
        texTipoDocQ: /^[a-zA-ZÀ-ÿ\s]{0,30}$/, // Letras y espacios, pueden llevar acentos.
        textNumDoc: /^\d{5,10}$/, // 5 a 10 numeros.    
        textTelefono: /^\d{5,10}$/, // 5 a 10 numeros.    	
	nacimiento: /^((19|[0-9])[0-9]{2}|(20|[0-9])[0-2]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$/,
        apellido: /^[a-zA-ZÀ-ÿ\s]{2,30}$/, // Letras y espacios, pueden llevar acentos.	
	textCorreo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/
}
var campos = {   
    textUsuario: false,
    textClave: false,
    texTipoDocQ: false,
    textNumDoc: false,
    textTelefono: false,	
    apellido: false,
    nacimiento: false,	
    textCorreo: false    	
}

var validarFormulario = (e) => {
	switch (e.target.name) {
                case "textUsuario":
			validarCampo(expresiones.textUsuario, e.target, 'textUsuario');
		break;
                case "textClave":
			validarCampo(expresiones.textClave, e.target, 'textClave');
			validarPassword2();
		break;	
                case "textTipoDocQ":
			validarCampo(expresiones.texTipoDocQ, e.target, 'textTipoDocQ');
		break;
		case "textNumDoc":
			validarCampo(expresiones.textNumDoc, e.target, 'textNumDoc');
		break;
                case "textTelefono":
			validarCampo(expresiones.textTelefono, e.target, 'textTelefono');
		break;
		
                 case "apellido":
			validarCampo(expresiones.apellido, e.target, 'apellido');
		break;
                case "nacimiento":
			validarCampo(expresiones.nacimiento, e.target, 'nacimiento');
		break;
			
		case "textCorreo":
			validarCampo(expresiones.textCorreo, e.target, 'textCorreo');
		break;	
	}
}

var validarCampo = (expresion, input, campo) => {
	if(expresion.test(input.value)){
		document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-incorrecto');
		document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-correcto');
		document.querySelector(`#grupo__${campo} i`).classList.add('fa-check-circle');
		document.querySelector(`#grupo__${campo} i`).classList.remove('fa-times-circle');
		document.querySelector(`#grupo__${campo} .formulario__input-error`).classList.remove('formulario__input-error-activo');
		campos[campo] = true;
	} else {
		document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-incorrecto');
		document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-correcto');
		document.querySelector(`#grupo__${campo} i`).classList.add('fa-times-circle');
		document.querySelector(`#grupo__${campo} i`).classList.remove('fa-check-circle');
		document.querySelector(`#grupo__${campo} .formulario__input-error`).classList.add('formulario__input-error-activo');
		campos[campo] = false;
	}
}

inputs.forEach((input) => {
	input.addEventListener('keyup', validarFormulario);
	input.addEventListener('blur', validarFormulario);
});

formulario.addEventListener('submit', (e) => {
	e.preventDefault();
	
	if(campos.textUsuario && campos.textClave && campos.texTipoDocQ && campos.textNumDoc && campos.textTelefono && campos.textCorreo  ){
		formulario.reset();

		document.getElementById('formulario__mensaje-exito').classList.add('formulario__mensaje-exito-activo');
		setTimeout(() => {
			document.getElementById('formulario__mensaje-exito').classList.remove('formulario__mensaje-exito-activo');
		}, 5000);

		document.querySelectorAll('.formulario__grupo-correcto').forEach((icono) => {
			icono.classList.remove('formulario__grupo-correcto');
		});
	} else {
		document.getElementById('formulario__mensaje').classList.add('formulario__mensaje-activo');
	}
});