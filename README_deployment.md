# Procedure to deploy WARs

## API WAR
1. Save version in prod to be able to come back to the current version
2. Uncompress war  
```unzip beebiome-api-0.1-SNAPSHOT.war -d beebiome```
3. Compare properties files  
```sdiff /var/lib/tomcat8/webapps/beebiome/WEB-INF/classes/application.properties beebiome/WEB-INF/classes/application.properties```
4. Set correctly properties in beebiome/WEB-INF/classes/application.properties or copy file from current version  
```cp -p /var/lib/tomcat8/webapps/beebiome/WEB-INF/classes/application.properties beebiome/WEB-INF/classes/application.properties```
5. Empty repository in Tomcat  
```rm -rf /var/lib/tomcat8/webapps/beebiome/*```
6. Copy repository in Tomcat  
```/bin/cp -pR beebiome/* /var/lib/tomcat8/webapps/beebiome/```
7. Reload the api in Tomcat manager (application: /beebiome)

## Webapp WAR
1. Save version in prod to be able to come back to the current version
2. Uncompress war  
```unzip beebiome-web.war -d beebiome-web```
3. Empty repository in Tomcat  
```rm -rf /var/lib/tomcat8/webapps/beebiome-web/*```
4. Copy repository in Tomcat  
```/bin/cp -pR beebiome-web/* /var/lib/tomcat8/webapps/beebiome-web/```
