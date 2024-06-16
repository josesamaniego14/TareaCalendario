# TareaCalendario
bjetivo: Desarrollar una interfaz gráfica de usuario (GUI) en JavaFX que permita a los usuarios seleccionar una fecha y un color, y visualizar estas selecciones en la interfaz.

Requisitos:

1. DatePicker: Un control de selección de fecha que permita a los usuarios seleccionar una fecha específica desde un calendario desplegable.

2. ColorPicker: Un control de selección de color que permita a los usuarios elegir un color específico desde una paleta de colores.

3. Button: Un botón para confirmar la selección de la fecha y el color.

4. Label: Etiquetas para guiar al usuario sobre qué hacer (por ejemplo, “Selecciona una fecha:” y “Selecciona un color:”).

5. VBox Layout: Utilizar un layout vertical (VBox) para organizar los controles de manera ordenada y clara.

6. Acción al Presionar el Botón: Al presionar el botón, la fecha y el color seleccionados deben mostrarse en la consola o en otro componente de la interfaz.


![image](https://github.com/josesamaniego14/TareaCalendario/assets/169215284/c2cf79c1-cdb1-43cc-8c7a-f400518d889a)


![image](https://github.com/josesamaniego14/TareaCalendario/assets/169215284/575490b2-47d3-49f1-8184-15aa88023d17)

![image](https://github.com/josesamaniego14/TareaCalendario/assets/169215284/4e0a4edb-8690-4843-98a7-8f6076861214)

Este código es una aplicación de JavaFX que crea una interfaz gráfica con dos pestañas, una para seleccionar una fecha y un color, y otra para mostrar los resultados de la selección. En el método start, se crean etiquetas y controles como un DatePicker y un ColorPicker, y se organizan en un VBox. Este VBox se coloca en la primera pestaña de un TabPane. La segunda pestaña contiene un VBox con una etiqueta que mostrará los resultados. Un botón confirma la selección, y al presionarlo, se obtiene la fecha y el color seleccionados, se muestran en la etiqueta de resultados, y se cambia automáticamente a la pestaña de resultados. Finalmente, se crea una escena que incluye el TabPane, se aplica una hoja de estilos CSS, y se muestra en la ventana principal titulada "Tarea FechaColor".
