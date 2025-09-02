
# Planche présentation 1

## Quel est le point commun ?

* ANT
* CSS
* Expression régulière
* Gradle
* Graphviz's dot language
* HQL / Hibernate Query Language
* Make
* PlantUML
* SQL / Structured Query Language


## DSL, qu'est ce que c'est

### What is a Domain Specific Language?
A Domain Specific Language (DSL) is a computer programming language of limited expressiveness focused on a particular domain. 
Most languages you hear of are General Purpose Languages, which can handle most things you run into during a software project. 
Each DSL can only handle one specific aspect of a system.


### Elements clés:
* langage de programmation : utilisé par les humains pour faire faire un traitement par un ordinateur.
* nature du langage : c'est un langage de programmation qui doit être lisible et fluide, composé d'expressions complexes.
* expressivité limitée : contrairement à un langage de programmation général, un DSL supporte un nombre minimal de fonctionnalités
* focalisé sur un domain métier : il doit être focalisé sur un domain clair, précis et limité.



## Problématiques classiques résolvables par DSL

* definir des données de manière lisible
* définir des instructions métier de manière simple
* isoler la partie métier de la partie technique 
* partie métier du code non lisible par un expert
* changer des fonctionnements sans mise à jour de l'application



## Problèmes avec les DSLs

* multiplication de langages
  * formation
  * switch
* coût
  * définition
  * conception
  * maintenance
* ghettoisation du langage
  * application restreinte du langage (projet unique)
* aveuglement par l'abstraction
  * masquage de détails des concepts exprimés par le DSL 



## Approches internes

* Fluent API
* Builder API
* Command Query API
* Litteral collections
* Sucre syntaxique
* etc.


## Approches externes
* langage ligne à ligne
* langage avec grammaire évoluée
    * lex/yacc
    * flex/bison
    * ANTLR



## Exemple sur construction d'un modèle de données

Interconnexion dans un avion d'équipements via des câbles.
Par exemple :
* avion
* equipements
  * Cockpit
  * Radio HF
  * Senseurs Radar
  * Senseur Infra-Rouge
  * 4 cables


## Approche interne par API Fluent 

Exemple


## Approche interne Command Query
* Séparation de la modification du modèle de sa consultation
* Pattern registry



## Grammaire évoluée
* Une grammaire est définie par 
  * un lexer qui identifie les tokens
  * un parser qui identifie les déclarations et instructions 
    * génère un AST
* AST : Abstract Syntax Tree
* Parsing layer



## Outillage grammaire évoluée
* C
  * lex/yacc
  * flex/bison
* Java 
  * JFlex / CUP (Portage Java, plus de MàJ)
  * ANTLR


## Approche externe par grammaire évoluée

Exemple 


## Usages pratiques 1/2

* definir des données de manière lisible
  * fichiers de configuration
  * données complexes / lisibilité
  * alternative spécialisée à XML et JSON
  * modèle métier
* définir des instructions métier de manière simple
  * lisibles par des experts
  * usage d'un vocabulaire, voire des notations communes avec les exigences et autres documents métier


## Usages pratiques 2/2

* isoler la partie métier de la partie technique
    * se concentrer sur le métier sans s'encombrer de la partie technique
* partie métier du code non lisible par un expert
    * mise au point d'un algo métier avec l'expert
* changer des fonctionnements sans mise à jour de l'application
    * configuration avancée
    * algorithmes de haut niveau




## Sources

* [Domain Specific Languages de Martin Fowler](https://martinfowler.com/books/dsl.html)
* [Domain-Specific Languages Guide de Martin Fowler](https://martinfowler.com/dsl.html)
* [ANTLR from Terence Parr](https://www.antlr.org/)
* [Compilers: Principles, Techniques, and Tools](https://suif.stanford.edu/dragonbook/)
