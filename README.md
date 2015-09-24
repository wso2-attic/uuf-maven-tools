This repository contains three main modules.

1. uuf.unit.creator - contains the archetype of unit component
2. uuf.app.creator- contains the archetype of app component
3. uuf.multiple.unit.container - contains the archetype of multiple unit skeleton

# How to install archetypes

  1. Clone this repository. git clone `https://github.com/wso2-incubator/uuf-maven-tools.git`

  2. Build the project with `maven install` to install the archetypes to the local machine.

## How to create a unit

  1. Go to the directory that you want to create the unit and type the following command.

        mvn archetype:generate -DarchetypeCatalog=local

  2. This will show you all the local archetypes that have installed in your local repository.

  3. Choose the number of the following archetype listed there and enter the number.

        local -> uuf.maven.tools:uuf.unit.creator (uuf.unit.creator))

  4. Then give the following details prompt.
    

          group-id :  e.g. org.wso2.uuf.<product_name>.<app_name>.units.<unit_name>
     
          artifact-id : e.g. org-wso2-uuf-<product_name>-<app_name>-units-<unit_name>
      
          version : e.g. 1.0-SNAPSHOT
      
          package: pom
          
          Confirm Properties configuration : Y
      
      
  5. This will create a project for the unit including a pom file in the directory you are in.
     Then open up the project using an IDE and modify the created unit as per your need.

## How to get unit zip 

   After finishing the unit implementation build the module  with `mvn clean install`

   It creates a zip file with the deployable unit in the target directory.

## How to get set of units  as a zip

  To get a bundle of units as a single zip file use the `uuf.multiple.unit.container` which is installed as an 
  archetype when the project build.
  
  Follow the same process of unit project to create a multiple unit container with following details.
  Archetype to select :
    
       local -> uuf.maven.tools:uuf.multiple.unit.container (uuf.multiple.unit.container)
      

  Details to create the project with the multiple unit container :

          group-id :  e.g. org.wso2.uuf.<product_name>.<app_name>.units.<unit_name>
          
          artifact-id : e.g. org-wso2-uuf-<product_name>-<app_name>-units-<unit_name>
          
          version : e.g. 1.0-SNAPSHOT  
          
          package: pom
          
          Confirm Properties configuration : Y
        

  This will create a container of units with a empty folder named `units`

## Adding units to the units container :

   1. Go to the directory `units` inside the container project.

   2. If you want to create a unit use the same way of unit creation being inside this folder.

   3. After implementation of units is done build the project

    A zip file containing the set of deployable units  is created in the target folder of the container when the
    project is build.


## How to Create an App :

   1. Go to the directory that you want to create the app and type the following command.

        mvn archetype:generate -DarchetypeCatalog=local

   2. This will show you all the local archetypes that have installed in your local repository.

   3. Choose the number of the following archetype listed there and enter the number.

        local -> uuf.maven.tools:uuf.app.creator (uuf.app.creator)

   4. Then give the following details prompt.

          group-id :  e.g. org.wso2.uuf.<product_name>.<app_name>.units.<unit_name>
      
          artifact-id : e.g. org-wso2-uuf-<product_name>-<app_name>-units-<unit_name>
       
          version : e.g. 1.0-SNAPSHOT
       
          package: pom
       
          Confirm Properties configuration : Y
       

   5. This will create a project for the app including a pom file in the directory you are in.
      Then open up the project using an IDE and modify the created app as per your need by creating units inside the
      units directory as mentioned above or importing units into the app.

## How to get the deployable app :

  There are two types of dependencies which need to be added to the app.

  Those are :

### 1. Dependency of uuf-template-app  
       
  To do this you have to first build the uuf-template-app.
        
  1. Clone this repository. `git clone https://github.com/wso2-incubator/uuf-template-app.git` to your machine.
        
  2. Go to the root directory of the uuf-template-app and build it using `mvn clean install`
        
  This will add the dependencies of the uuf-template app to your local maven repository.
        
  3. Again go to the app project that you created using the uuf.app.creator archetype and build the project with `mvn clean install`
        
  This will add the libraries and configurations from the uuf-template-app to the application project you created.
                
### 2. Dependencies of units which are imported.
       
  You can add units which are created by other users to your application                
          
          -- This feature is under development --
          
          

 After finishing the unit implementation build the project  with `mvn clean install`

 It creates a zip file with the deployable app in the target directory which can be copied to 
  `<CARBON_PRODUCT_HOME>/repository/deployment/server/jaggeryapps/` directory of the WSO2 product to use.


