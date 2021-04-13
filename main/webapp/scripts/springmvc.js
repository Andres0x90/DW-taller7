document.getElementById("explicar").addEventListener("click", function()
{
    let texto = "<p>Spring Web MVC es un sub-proyecto Spring que esta dirigido a facilitar y optimizar el proceso creacion de aplicaciones web utilizando el patron MVC (Modelo-Vista-Controlador), donde el Modelo representa los datos o informacion que manejara la aplicacion web, la Vista son todos los elementos de la UI (Interfaz de Usuario), con ellos el usuario interactua con la aplicacion, ejemplo: botones, campos de texto, etc., finalmente el Controlador sera el encargado manipular los datos en base a la interaccion del usuario.</p>";
    document.getElementById("explicacion").innerHTML = texto;
});

