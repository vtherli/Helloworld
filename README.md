``` 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://app.skaffolder.com/#!/register?friend=5c9aa686c888b454cd596559
*
* You will get 10% discount for each one of your friends
* 
```


```
   _____ _          __  __      _     _           
  / ____| |        / _|/ _|    | |   | |          
 | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __ 
  \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
  ____) |   < (_| | | | || (_) | | (_| |  __/ |   
 |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|   

       _                  
      | |                 
      | | __ ___   ____ _ 
  _   | |/ _` \ \ / / _` |
 | |__| | (_| |\ V / (_| |
  \____/ \__,_| \_/ \__,_|
```

This project was generated by Skaffolder

For more documentation visit https://skaffolder.com/#/documentation


--------------
## PREREQUISITES
--------------
* Apache Maven
* JDK 1.7
* MongoDB Database
--------------
## CONFIGURE DATABASE
--------------

Insert IP, user and pass of database on your properties file in `src/main/resources/config/dev.properties`

--------------
## BUILD FRONTEND
--------------

* If you are using Angular 4 frontend type:
    ``` bash
	$ cd src/client
	$ npm install
    $ npm run build
    ```
	
* If you want to keep updating frontend type:
    ``` bash
	$ npm run watch
    ```

--------------
## START APPLICATION
--------------
* To start the application open a command line in the project's folder an type:
    ``` bash
    $ mvn spring-boot:run
    ```
    This will start a lightweight Java server on your pc and run the application.
* Go to http://localhost:8080
--------------
## START WITH DOCKER
--------------

* To start the application with Docker:
    * Install Docker

    * Change db URL in `src/main/resources/config/dev.properties` to: 
    `mongodb://database:27017`

    * Run command:
        ``` bash
        $ docker-compose up --build
        ```

    * Go to http://localhost:3000

* When code changes you need to rebuild container running:
    ``` bash
    $ docker-compose up --build
    ```

--------------
## SWAGGER API DOCS
--------------
You can find the swagger-ui page on: http://localhost:8080/swagger-ui.html
--------------
## USING SKAFFOLDER-CLI
--------------

With Skaffolder-CLI you can easily manage your Skaffolder project from command line and customize your generator template from your IDE.

Install Skaffolder-CLI with
``` bash
$ npm install -g skaffolder-cli
```

Login running the command
``` bash
$ sk login
```

Generate your project with the command
``` bash
$ sk generate
```

You can customize your generator template working with files in .skaffolder folder in your project root.

Please refer to https://skaffolder.com/#/documentation/skaffolder-cli for more information.

