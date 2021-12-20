# Spring-02-Sur-la-route

Relance l'application avec mvn spring-boot:run

Et go sur : http://localhost:8080/doctor

Comme demandé dans la quete : 

http://localhost:8080/doctor/9 à 13
- doctorId >= 9 && doctorId <= 13 renvoit le nom du docteur et son ID ;

http://localhost:8080/doctor/ 
- doctorId >= 1 && doctorId <= 8  renvoit une erreur 303 SEE_OTHER : 'Test avec un autre id';

http://localhost:8080/doctor/312342124 par exemple
- Sinon pour l'erreur 404 NOT_FOUND cela renvoit : "Impossible de récupérer l'incarnation..."; 

Tu pourras tester les routes !

