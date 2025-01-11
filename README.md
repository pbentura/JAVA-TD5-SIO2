
![separe](https://github.com/studoo-app/.github/blob/main/profile/studoo-banner-logo.png)
# TD 5 Java : Implémentation des tests unitaires
[![Version](https://img.shields.io/badge/Version-2025-blue)]()

## Objectifs

- Apprendre à écrire et exécuter des tests unitaires en Java avec JUnit.
- Tester la logique métier d'une application Java.
- Vérifier le comportement de composants d'une interface graphique JavaFX à l'aide de tests.

## Contexte :

Vous allez développer et tester une application JavaFX simple permettant de gérer une liste de tâches (To-Do List).
L'application doit permettre d'ajouter, de supprimer et de marquer des tâches comme terminées.

## Énoncé :
### Partie 1 : Développement de l'application

1. **Modèle métier** :
   - Créez une classe Task avec les propriétés suivantes :
     - String title : le titre de la tâche.
     - boolean completed : pour indiquer si la tâche est terminée.
   - Implémentez les méthodes suivantes :
     - Un constructeur pour initialiser une tâche.
     - Une méthode updateCompletion() pour mettre à jour le status d'une tâche.
     - Les accesseurs (getters) et mutateurs (setters) nécessaires.
2. **Logique métier** :
   - Créez une classe TaskManager qui gère une liste de tâches. Elle doit inclure :
     - Une liste de tâches (List<Task>).
     - Une méthode addTask(Task task) pour ajouter une tâche.
     - Une méthode removeTask(Task task) pour supprimer une tâche.
     - Une méthode getTasks() pour récupérer toutes les tâches.
3. **Interface utilisateur** :
   - Créez une interface JavaFX avec les fonctionnalités suivantes :
     - Une zone de texte pour saisir le titre d’une tâche.
     - Un bouton pour ajouter une tâche.
     - Une liste affichant les tâches.
     - Un bouton pour supprimer une tâche sélectionnée.
     - Un bouton pour mettre à jour le status d'une tâche sélectionnée.

### Partie 2 : Tests unitaires
1. **Tests du modèle métier** :
   - Écrivez des tests pour la classe Task :
     - Tester que le constructeur initialise correctement les valeurs.
     - Tester que la méthode updateCompletion() fonctionne correctement.
   - Écrivez des tests pour la classe TaskManager :
     - Tester que l’ajout d’une tâche fonctionne.
     - Tester que la suppression d’une tâche fonctionne.
     - Tester que la méthode getTasks() renvoie la liste correcte.
2. **Tests de l’interface utilisateur** :
   - Installez la bibliothèque TestFX pour tester JavaFX.
   - Écrivez des tests pour vérifier :
     - Que l’ajout d’une tâche via l’interface met à jour la liste des tâches.
     - Que la suppression d’une tâche via l’interface fonctionne.
     - Que la mise à jour d’une tâche via l’interface fonctionne.
