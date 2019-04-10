# I Like Java.  What's the Worst that Could Happen?
Welcome to the Java starter.  You can feel free to shamelessly copy this code and use it as a skeleton for your own project.  You may need to add in some things that I've left out as an exercise to you.

In Java, dependencies are stored at the project level, meaning that you must either package dependencies directly with your project (commonly in a “lib” folder) OR use a dependency management tool such as Maven or Gradle.  We recommend Maven.  Many IDEs (such as IntelliJ IDEA) will have integration with these tools built-in.

Maven and Gradle both suggest that you follow a predefined project structure to use them.  They are both very similar, but we will cover Maven projects.

We recommend the below folder structure for those using Maven:

![Java project structure](https://github.com/mfreema1/ssw-555/tree/master/img/java/project.png)

Note that after `src/main/java`, you are free to define whatever packages you would like.

This project shows only the first three user stories as an example, but the rest should be easy to fill in.  The `pom.xml` file is what Maven uses to build your project.  Without it, Maven will not work.

We have provided a default `pom.xml` file which can be found here:

```xml
<project>
   <modelVersion>4.0.0</modelVersion>
   <groupId>com.world.hello</groupId>
   <artifactId>HelloWorld</artifactId>
   <version>1</version>

   <!--  By default, Maven will set your project to use Java 1.5.
     This isn't the Paleolithic era, so we'll use Java 1.8-->
   <properties>
       <maven.compiler.target>1.8</maven.compiler.target>
       <maven.compiler.source>1.8</maven.compiler.source>
   </properties>

   <!--  All I need is JUnit  -->
   <dependencies>
       <dependency>
           <groupId>junit</groupId>
           <artifactId>junit</artifactId>
           <version>4.11</version>
           <scope>test</scope>
       </dependency>
   </dependencies>
</project>
```

This example only has one dependency -- JUnit 4.11.  Many of you will have more dependencies than that.  If you want to add in a dependency:
1. Search [Maven](https://mvnrepository.com/) for your dependency
2. Once found, copy the `<dependency>` tag into your `pom.xml` under the `<dependencies>` tag