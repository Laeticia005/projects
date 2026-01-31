# JDBC PostgreSQL Demo

## Objectif du projet
Ce projet a pour objectif de mettre en œuvre JDBC afin de permettre à une application Java d’accéder à une base de données PostgreSQL .  
Il vise à démontrer la compréhension du rôle du driver JDBC, de la connexion à une base de données relationnelle et de l’exécution d’opérations CRUD depuis Java.

---

## Technologies et outils utilisés
- Langage : Java  
- JDK : Java 24  
- SGBD : PostgreSQL 16  
- Interface graphique : pgAdmin 4  
- Gestionnaire de dépendances : Maven  
- Driver JDBC : PostgreSQL JDBC Driver 42.7.3  
- IDE : IntelliJ IDEA  
- Système d’exploitation : Windows  

---

## Base de données
- Nom de la base : `jdbc_demo`
- Table utilisée : `student`

### Script SQL de création de la table
```sql
CREATE TABLE student (
  id SERIAL PRIMARY KEY,
  full_name VARCHAR(120) NOT NULL,
  email VARCHAR(120) UNIQUE NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```
## Configuration Maven (pom.xml)

Le fichier pom.xml contient :

la dépendance du driver JDBC PostgreSQL, nécessaire pour permettre à Java de communiquer avec PostgreSQL ;

le plugin exec-maven-plugin, qui permet de spécifier la classe principale et d’exécuter l’application via Maven.

## Dépendance JDBC PostgreSQL
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
</dependency>
## Structure du projet

Le projet est structuré de la manière suivante :

Main.java
Classe principale de l’application. Elle établit la connexion à la base de données et appelle les méthodes du DAO.

Db.java
Classe responsable de la configuration et de l’établissement de la connexion JDBC à PostgreSQL via DriverManager.

StudentDao.java
Classe DAO (Data Access Object) qui contient les méthodes permettant d’exécuter les opérations CRUD (INSERT et SELECT) à l’aide de PreparedStatement.
## Mise en œuvre JDBC

La connexion à la base de données est réalisée à l’aide de l’API JDBC.
L’URL JDBC utilisée est :
jdbc:postgresql://localhost:5432/jdbc_demo
Le driver JDBC PostgreSQL agit comme intermédiaire entre l’application Java et le serveur PostgreSQL.
Les requêtes SQL sont exécutées via PreparedStatement, ce qui permet de remplacer les paramètres ? par des valeurs à l’aide de méthodes comme setString() et d’éviter les injections SQL.

Les opérations CRUD sont exécutées en mode auto-commit (mode par défaut de JDBC), ce qui signifie que chaque requête est validée automatiquement par la base de données.

## Exécution du projet

L’application peut être exécutée :

directement depuis l’IDE IntelliJ IDEA en lançant la classe Main.java ;

ou via Maven grâce au plugin exec-maven-plugin.
## Résultats

Les données insérées depuis l’application Java sont correctement persistées dans la base de données PostgreSQL.
Les résultats peuvent être visualisés dans pgAdmin à l’aide de requêtes SELECT.

## Conclusion

Ce projet a permis de comprendre concrètement le rôle de JDBC comme pont entre une application Java et une base de données relationnelle PostgreSQL. Il a également permis de mettre en pratique la gestion des dépendances avec Maven, l’exécution de requêtes SQL sécurisées et l’organisation d’un projet Java selon de bonnes pratiques.

