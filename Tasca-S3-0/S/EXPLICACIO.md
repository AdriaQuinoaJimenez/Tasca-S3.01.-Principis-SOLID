## Què estava malament?
El mateix mètode register() tenía massa responsabilitat fent diferents funcions alhora en un sol mètode.

## Per què incomplia el principi?
El principi de la S correspon al **Single Responsibility** que tracta que cada classe ha de tenir una única responsabilitat simple. Llavors, el mètode register() no complía el principi de Single responsibility perquè tenía un únic mètode que feia tot alhora, en comptes de tenir desglossat el mètode en submètodes més simples amb una única responsabilitat.

## Quina solució has aplicat i per què?
He separat les diferents funcions que fa el mètode register() per a que es compleixi el Single Responsibility, afegint la classe UserRegistrationService perquè aquesta gestioni tot el que té a veure amb el registre d'usuari. He separat les funcions de validació en una altra classe que es diu UserValidator perquè aquesta classe gestioni tot el que té a veure amb la validació de dades del registre, i he creat una altra classe per a gestionar la notificació que s'envia a l'usuari un cop registrar en la classe NotificationUser. D'aquesta forma he separat responsabilitats en gestionar les validacions, gestionar tot el que tè a veure amb el registre d'usuari i amb les notificaciones que s'envien a l'usuari.