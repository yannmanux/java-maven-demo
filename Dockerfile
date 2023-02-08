FROM openjdk:17-alpine
COPY . /app  
WORKDIR  /app 
RUN ./mvnw clean install package
ENTRYPOINT [ "java", "-jar", "/app/target/*.jar" ]







