# Challenge reactor-core
# Step by Step

- Transformar un CSV una lista de Stream de Java (Usar operadores basicos)
- En vez de usar Java Stream aplicamos reactividad (Reactor Core) con trasnformaciones (Usar operadores basicos)
- Optimizar las consultas y aplicar un servicio web para hacer estos filtros
- Hacer un proceso de migración en donde tomemos los datos del archivo y lo llevemos a una base datos (MangoDB)
- Trabajo directamente los desde una base de datos reactiva y objserva la rendimiento
- Prueba de concurencia con JMeter, donde vamos a colocar 100 hilos de ejeucución para observar los comportamientos de cada servicio

# SOLUCION

Se crean los controladores, el repositorio, el servicice, la entidad, arrancamos el servicio y hacemos el llamado desde Jmeter para ver rendimiento, así:
el llamado desde el navegador

![img_7.png](img_7.png)

el listado de datos

![img_8.png](img_8.png)

ahora en Jmeter

![img.png](img.png)
se crean los  receptores

![img_1.png](img_1.png)

![img_2.png](img_2.png)

se agrega un agente de peticiones HTTP

![img_3.png](img_3.png)

Se ingresa la URL de cada servicio

![img_4.png](img_4.png)

y se le da play

![img_5.png](img_5.png)

ahi se obtendra in informa con el rendiminto del servicio pudioendo comparar cada uno.
![img_6.png](img_6.png)

en conclusion se pude evidenciar que al trabajar reactivanente desde una base de dato, el redimiento aumenta significativamente,debido 
a que no se hacen conversiones de ningun tipo.
