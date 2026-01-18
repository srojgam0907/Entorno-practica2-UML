# Practica 2 UML

## Responde a las siguientes preguntas

**1. ¿Qué tipo de relación existe entre Agenda y Contacto?**

      Es una relación de agregación porque agenda contiene contactos pero se puede crear un contacto 
      en el main que no pertenezca a una agenda.
   
**2. ¿Qué tipo de relación existe entre Contacto y Telefono?**

      Es una relación de agregación porque Contacto contiene telefonos pero se puede crear en el main 
      un telefono que no pertenece a ningún contacto. 

**3. ¿Qué tipo de relación existe entre Contacto y Direccion?**

      Es una relación de agregación porque en el main se puede crear un dirección sin que tenga que 
      pertenecer a un contacto. 
   
**4. ¿Por qué los tipos TipoTelefono y TipoVia se modelan como enumerados?**
      
      Porque hay unos tipos determinados y el valor de la variable no se puede salir de esos tipos.
   
**5. ¿Qué relaciones del diagrama son asociaciones simples y cuáles podrían interpretarse como agregación o composición?**

      Solo hay relaciones de agregación. Contacto/Agenda, Contacto/Direccion, Contacto/Telefono.
   
