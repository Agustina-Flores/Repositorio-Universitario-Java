/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


window.addEventListener('load', function(){ 
     document.getElementById('btnIniciar').addEventListener('click',function(){
    
         var usuario = document.getElementById('usuario').value;
         var clave = document.getElementById('clave').value;
         
         if (usuario.length === 0 || /^\s+$/.test(usuario)) {
            alert('Por favor escriba usuario');
            return false;
            }
           
            if(clave === "" && clave > 5){
           
            return true;
             }else{
                 
                  alert('La clave debe tener al menos 6 caracteres!');
             }
             if(usuario!==0 && clave!==""){
             document.getElementById('forminicio').submit();//envia la peticion
            }else {
             
             alert('Por favor rellene todos los campos');
         }
         
         
     });
});