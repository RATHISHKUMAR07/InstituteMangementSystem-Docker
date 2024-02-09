FROM openjdk:17-oracle
COPY target/*.jar instituteapp.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","instituteapp.jar"]