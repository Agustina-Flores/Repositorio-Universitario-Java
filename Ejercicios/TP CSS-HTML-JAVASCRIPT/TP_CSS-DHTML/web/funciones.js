/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function tamanioPequenio(){
    var par=document.getElementById('miparrafo');
    par.style.fontSize='10pt';
}

function tamanioMediano(){
    var par=document.getElementById('miparrafo');
    par.style.fontSize='13pt';
}

function tamanioGrande(){
    var par=document.getElementById('miparrafo');
    par.style.fontSize='20pt';
}

function cambiarHijo(){
    var tit=document.getElementById('nodo');
    var numero=parseInt(tit.childNodes[0].textContent)+1;
    tit.childNodes[0].nodeValue=numero.toString();
    
}

function cambiarTamFuente(){
    var puntero=document.getElementById('parrafo1');
    var padre=puntero.parentNode;
    padre.style.fontSize='40pt';
}

function cambiarColor(){
    var parrafos=document.getElementsByTagName('p');
    for(i=0; i<parrafos.length; i++){
        parrafos[i].style.color="blue";
    }
}

function mostrarSoluciones(){
    var lista=document.getElementById('lista');
    var node1=document.createElement('li');
    var texto1=document.createTextNode("li uno");
    node1.appendChild(texto1);
    lista.appendChild(node1);
    var node2=document.createElement('li');
    var texto2=document.createTextNode("li dos");
    node2.appendChild(texto2);
    lista.appendChild(node2);
}

function definirAtributo(){
    var tabla=document.getElementById('tabla1');
    tabla.setAttribute('border', 5);
}

function enviarDatos(){
    var nombre=document.getElementById('nombre');
    var contrasenia=document.getElementById('cont');
    var confirmarCont=document.getElementById('confCont');
    if(nombre.value=="" || contrasenia.value=="" || confirmarCont.value==""){
        alert("Debe ingresar todos los campos");
    }else if(contrasenia.value!=confirmarCont.value){
        alert("Las contraseñas no coinciden");
    }
}