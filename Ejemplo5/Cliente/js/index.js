function Conn(){

    var texto = document.getElementById("operacion").value;
    console.log(texto);

    var url='http://localhost:8080/Calcular/';

    $.post(url,{text:texto},function(data,status){
        if(status.toString()=="success"){
            alert("El resultado es: "+data.toString());
        }else{
            alert("Error estado de conexion:"+status);
        }
    });
}