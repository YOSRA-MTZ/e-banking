"# e-banking" 
<h1>Spring Angular Spring Security JWT : E-Banking</h1>
<h2>Introduction</h2>
<p>
Le but est de créer une application pour gérer les comptes bancaires en suivant un processus en trois étapes essentielles. Tout d'abord, il s'agit de développer la couche DAO avec Spring Boot, puis de concevoir l'interface utilisateur avec Angular, et enfin, de garantir la sécurité en utilisant Spring Security et les JSON Web Tokens.

Cette application offrira une gestion complète des comptes bancaires, en différenciant deux types : les comptes courants et les comptes épargne.
</p>
<h2>Conception:</h2>
<img src="captures/useCase.png">

<h2>Partie 1 : Couche DAO et Service</h2>

<h3>Création du Projet Spring Boot:</h3>
<p>La première étape de notre projet consiste à mettre en place l'environnement de développement en créant un projet Spring Boot. Grâce à son infrastructure simplifiée, Spring Boot facilite le développement d'applications Java en permettant une configuration rapide et une gestion aisée des dépendances.</p>

<h3>Création des entités JPA : Customer, BankAccount, Saving Account, CurrentAccount, AccountOperation:</h3>
<p>Une fois le projet Spring Boot mis en place, la prochaine étape cruciale consiste à créer les entités JPA (Java Persistence API). Ces entités, telles que Customer, BankAccount, Saving Account, CurrentAccount et AccountOperation, définissent la manière dont les données sont organisées et manipulées par l'application. Chaque entité correspond à une table dans la base de données, et les relations entre elles reflètent la logique métier propre au système bancaire.</p>
<img src="captures/entities.png">

<h3>Création des interfaces JPA Repository basées sur Spring Data:</h3>
<p>Les interfaces JPA Repository, intégrées à Spring Data, jouent un rôle essentiel en simplifiant l'accès aux données. En définissant ces interfaces, nous tirons parti de la capacité de Spring Data à générer automatiquement les requêtes SQL nécessaires pour les opérations CRUD (Create, Read, Update, Delete). Cette méthode simplifie considérablement la couche DAO en évitant la rédaction manuelle de requêtes SQL.</p>
<img src="captures/repos.png">

<h3>Mapping Héritage:</h3>
<p>Dans ce projet nous allons essayer les 3 strategies à noter le Single Table , Table Per class et Joined</p>
<img src="captures/mappingHeritage.png">

<h4>Stratégie "Single Table":</h4>
<p>CurentAccount </p>
<img src="captures/single4.png">
<p>SavingAccount </p>
<img src="captures/single5.png">
<p>BankAccount </p>
<img src="captures/single6.png">
<p>Simulation H2database : all customers</p>
<img src="captures/single1.png">
<p>Simulation H2database : Bank_Account Customer </p>
<img src="captures/single2.png">
<p>Simulation H2database : Account_Operation Customer </p>
<img src="captures/single3.png">

<h4>Stratégie "Table Per Class":</h4>
<p>CurentAccount</p>
<img src="captures/perClass1.png">
<p>SavingAccount </p>
<img src="captures/perClass2.png">
<p>BankAccount </p>
<img src="captures/perClass3.png">

<img src="captures/perClass4.png">
<img src="captures/perClass5.png">
<img src="captures/perClass6.png">
<img src="captures/perClass7.png">

<h4>Stratégie "Joined":</h4>
<p>CurentAccount </p>
<img src="captures/joined.png">
<p>SavingAccount</p>
<img src="captures/joined1.png">
<p>BankAccount </p>
<img src="captures/joined2.png">

<img src="captures/joined3.png">
<img src="captures/joined4.png">
<img src="captures/joined5.png">


<h3>Consultation d'un customer:</h3>
<img src="captures/consulter.png">


<h3>Basculement vers MySQL en utilisant la stratégie "Single Table":</h3>
<img src="captures/mysql.png">


<h3>Affichage des customers sous format json:</h3>
<img src="captures/cust.png">



