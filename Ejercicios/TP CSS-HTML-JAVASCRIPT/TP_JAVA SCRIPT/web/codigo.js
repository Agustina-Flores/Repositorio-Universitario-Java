/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function mostrarAlert(){
    var texto1 = "Hola mundo";
    var texto2 = "Soy el primer script"
    alert(texto1);
    alert(texto2);
    //alert("Hola Mundo!");
    //alert("Soy el primer script");
}

function mostrarMeses(){
    var meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
        for (var i = 0; i < meses.length; i++){
            alert(meses[i]);
        }
}

function completarIf(){
    var numero1 = 5;
    var numero2 = 8;
        if (numero1 < numero2) {
            alert("numero1 no es mayor que numero2");
        }
        if (numero2 > 0) {
            alert("numero2 es positivo");
        }
        if (numero1 < 0 || numero1 != 0) {
            alert("numero1 es negativo o distinto de cero");
        }
        if ((numero1+1)<numero2) {
            alert("Incrementar en 1 unidad el valor de numero1 no lo hace mayor o igual que numero2");
        }
}

function dniYLetra(){
    var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
    var dni=prompt("Introduzca su número de DNI");
    var letraDni=prompt("Introduzca la letra del DNI");
    var resto;
    if(parseInt(dni)<0 || parseInt(dni)>999999999){
        alert("El número ingresado no es válido");
    }else{
        resto=parseInt(dni)%23;
        if(letras[resto]!=letraDni){
            alert("La letra que ha indicado no es correcta");
        }else{
            alert("El número de DNI y la letra son correctos");
        }
    }
}

function mostrarResultado(){
    var numero=prompt("Introduzca un número");
    var cadena=parImpar(parseInt(numero));
    alert(cadena);
}
function parImpar(n){
    
    if(n%2==0){
        
        return "El número es par";
    }
    else{
        return "El número es impar";
    }
}

function imprimirAlert(){
    var palabra=prompt("Ingrese una palabra").toLowerCase();
    palindromo(palabra);
}

function palindromo(cadena){
    cadena=cadena.replace(/ /g, "");
    var nuevaCadena=cadena.split("");
    
    for(var i=0; i<nuevaCadena.length; i++){
        var esPal;
        if(nuevaCadena[i]===nuevaCadena[nuevaCadena.length-1-i]){
            esPal= true;
        }else{
            esPal= false;
        }
    }
    if(esPal===true){
        alert("La palabra es un palíndromo");
        
    }else{
        alert("La palabra no es un palíndromo");
        
    }
}

function consultarSueldo(){
 
    var sueldo=document.getElementById('sueldo').value;//
    sueldo=parseInt(sueldo);
    var antiguedad=document.getElementById('antiguedad').value;
    antiguedad=parseInt(antiguedad);
    
    var s;
    if(sueldo<500 && antiguedad>=10){
        s=sueldo+sueldo*0.2;//incremento del 20%
        s=String(s);
        document.getElementById('sueldoCobrar').value=s;
    }else if(sueldo<500 && antiguedad>10){
        s=sueldo+sueldo*0.05;
        s=String(s);
        document.getElementById('sueldoCobrar').value=s;
    }else if(sueldo>=500){
        s=sueldo;
        s=String(s);
        document.getElementById('sueldoCobrar').value=s;
    }
}

function promedioEdades(){//
    var i=1, edad=0, promedioM=0, promedioT=0, promedioN;
    while(i<=22){
        if(i<=5){
            alert("Turno Mañana");
            var edadPedidaM=prompt("Ingrese la edad");
            edad+=parseInt(edadPedidaM);
            if(i===5){
                promedioM=edad/5;
            }
        }else if(i>5 && i<=11){
            edad=0;
            alert("Turno Tarde");
            var edadPedidaT=prompt("Ingrese la edad");
            edad+=parseInt(edadPedidaT);
            if(i===11){
                promedioT=edad/6;
            }
        }else{
            edad=0;
            alert("Turno Noche");
            var edadPedidaN=prompt("Ingrese la edad");
            edad+=parseInt(edadPedidaN);
            if(i===22){
                promedioN=edad/11;
            }
        }
        
        i++;
    }
    alert("Los promedios son: \nTurno Mañana "+promedioM+"\nTurno Tarde "+promedioT+"\nTurno Noche "+promedioN);
        
        if(promedioM<promedioT && promedioT<promedioN && promedioM<promedioN){
            alert("El turno con mayor promedio de edades es el turno noche");
        }else if(promedioM>promedioT && promedioT>promedioN && promedioM>promedioN){
            alert("El turno con mayor promedio de edades es el turno mañana");
        }else if(promedioM>promedioT && promedioT<promedioN && promedioM<promedioN){
            alert("El turno con mayor promedio de edades es el turno noche");
        }else if(promedioM<promedioT && promedioT>promedioN && promedioM>promedioN){
            alert("El turno con mayor promedio de edades es el turno tarde");
        }
}

function mostrarPrecio(){
    var cod=parseInt(document.getElementById("pizzas").value);
    switch(cod){
        case 1:
            document.getElementById('precio').value=100;
            break;
        case 2:
            document.getElementById('precio').value=125;
            break;
        case 3:
            document.getElementById('precio').value=150;
            break;
    }
}

function validarEdad(){
    var edades=document.getElementsByName('edad');
    for(i=0; i<edades.length; i++){
        if(edades[i].checked && edades[i].value=="mas18"){
            alert("Puede ingresar al sitio");
            break;
        }else{
            alert("No puede ingresar al sitio");
            break;
        }
    }
    
}

function llamarPagina(){
    window.open("ejercicio11b.html","Otra Página", "width=600,height=300");
}

function duplicarValor(){
    var numero=parseInt(document.getElementById('numero'));
    document.getElementById('numero').innerHTML=numero*2;//
}
class Suma {
    
    valor1;
    valor2;
    
    primerValor(n){
        this.valor1=n;
    }
    segundoValor(n){
        this.valor2=n;
    }
    
    retornarResultado(){
        return this.valor1+this.valor2;
    }
}
function suma(){
    var s=new Suma();
    s.primerValor(10);
    s.segundoValor(20);
    
    document.write("<p>La suma de los valores es: "+s.retornarResultado()+"</p>");
    
}

function validarForm(){
    
    var formulario=document.getElementById('registroCliente');
    if(isNaN(formulario.telefono.value)==true ||  /^[1-9]\d$/.test(formulario.telefono.value)==false){//esto ver
        alert("Debe ingresar un número" + formulario.telefono.value);
    }
    if(isNan(formulario.mail.value)==true || /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3,4})+$/.test(formulario.mail.value)==false){
        alert("Debe ingresar @ y .com"+ formulario.mail.value);
    }
}

function mostrarVector(){
    vector1=new Array(10);
    vector2=new Array();
    vector3=new Array();
    for(i=0; i<vector1.length;i++){
        vector1[i]=Math.floor((Math.random() * 500) + 1);//
    }
    for(i=0; i<vector1.length; i++){
        if(vector1[i]<250 && i==0){//i==0
            vector2[i]=vector1[i];
        }else if((vector1[i]<250 && vector1[i-1]>=250) || (vector1[i]<250 && vector1[i-1]<250)){//
            vector2[i-1]=vector1[i];
        }else if(vector1[i]>=250 && i==0){
            vector3[i]=vector1[i];
        }else if((vector1[i]>=250 && vector1[i-1]<250) || (vector1[i]>=250 && vector1[i-1]>=250)){
            vector3[i-1]=vector1[i];
        }
    }
    document.writeln("Tamaño vector2: "+vector2.length+"<br>");
    document.writeln("Tamaño vector3: "+vector3.length+"<br>");
    for(i=0; i<vector1.length; i++){
        document.write(vector1[i]+" ");
    }
    document.writeln("<br>");
    for(i=0; i<vector2.length; i++){
        document.write(vector2[i]+" ");
    }
    document.writeln("<br>");
    for(i=0; i<vector3.length; i++){
        document.write(vector3[i]+" ");
    }
    document.writeln("<br>");
}