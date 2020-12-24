# HOW TO USE
1. execute the improt.sql
2. config application-dev.yml for jdbc connection
3. git clone https://github.com/vanniuner/maven-archetype-springboot.git
4. install this project maven-archetype-springboot
    mvn clean install
5. generate maven skeleton project
    mvn archetype:generate -DarchetypeGroupId=com.github.drtrang -DarchetypeArtifactId=maven-archetype-springboot -DarchetypeVersion=1.1.0 -DinteractiveMode=false -DarchetypeCatalog=local -DgroupId=${groupId} -DartifactId=${artifactId} -Dversion=${version} -Dpackage=${package}
6. mvn spring-boot:run


# V1.1.0 Changelog
1. spring-boot 2.1.7.RELEASE
2. mybatis-plus
3. yml configuration file for mutlity environment
4. lombok 1.18.16
5. maven-surefire-plugin.version 3.0.0-M5
6. remove mybatis generate
7. Redefine The environment variable
8. disable import sql
