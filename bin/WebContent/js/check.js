document.getElementById("botoncheck").addEventListener("click", function () {
  let contenido = document.getElementById("contenido");
  let cant = document.getElementById("txtnumcheck").value;

  if (parseInt(cant) > 10 || cant == "") {
    alert("La cantidad debe ser entre 1 y 10");
    contenido.innerHTML = "";
  } else {
    contenido.innerHTML = "";
    for (let index = 0; index < cant; index++) {
        let f = 1;
       
      contenido.innerHTML += `${"<input type='text' class='check'  placeholder='ingrese check'></br>"}`; 
      f++;
    }
    contenido.innerHTML += `${"<button class='btn waves-effect waves-light' type='submit' name='action'>Enviar</button>"}`;
    document.getElementById('txtnumcheck').value ="";
  }

});
