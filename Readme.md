# HOW TO USE
1. git clone https://github.com/vanniuner/maven-archetype-springboot.git
2. mvn clean install
3. mvn archetype:generate -DarchetypeGroupId=com.github.drtrang -DarchetypeArtifactId=maven-archetype-springboot -DarchetypeVersion=1.1.0 -DinteractiveMode=false -DarchetypeCatalog=local -DgroupId=${groupId} -DartifactId=${artifactId} -Dversion=${version} -Dpackage=${package}


# V1.1.0 Changelog
1. spring-boot 2.1.7.RELEASE
2. mybatis-plus
3. yml configuration file for mutlity environment
4. lombok 1.18.16
5. maven-surefire-plugin.version 3.0.0-M5
6. remove mybatis generate
7. Redefine The environment variable
8. disable import sql
