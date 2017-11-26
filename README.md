# Servicio de bono monedero

El ejercicio consiste en construir una prueba de concepto de un servicio de bono monedero.
El bono monedero funciona como un monedero "real":
- Almacena un saldo en euros, que el usuario puede utilizar para pagar otros servicios.
- El usuario puede recargar dinero desde una pasarela de pagos de terceros (stripe, paypal, redsys...).
- No existe la posibilidad de devolver ese dinero al medio de pago original.

La estructura básica del monedero es su identificador y su saldo actual. Si consideras que necesitas más campos,
añádelos sin problemas y lo discutiremos en la entrevista.

El ejercicio consiste en que programes endpoints para:
- Consultar un bono por su identificador.
- Descontar saldo del monedero (un cobro).
- Devolver saldo al monedero (una devolución).
- Recargar dinero en ese bono a través de un servicio de pago de terceros.

Para que puedas ir al grano, te damos un proyecto maven con una aplicación Spring Boot, con las dependencias básicas y una
base de datos H2. Tienes perfiles de develop y test.

Tienes también una implementación del servicio que implementaría la pasarela de pago real (ThirdPartyPaymentService).
Esa parte no tienes que programarla, asume que el servicio hace la llamada remota dada una cantidad de dinero.
Está pensado para que devuelva error bajo ciertas condiciones.

No le dediques más de 3 horas. No hace falta que lo documentes, pero puedes anotar lo que quieras para discutirlo
en la entrevista.
