# KZ-Prototype
Service based on Spring, Hibernate, Gradle, JS

## How to run
Service requires existing mariadb database server. 

###MariaDB
You can create one with docker using:

```
docker run --name CONTAINER -dp 3306:3306 -e MYSQL_ROOT_PASSWORD=root mariadb
```
Once image is downloaded and container is created type:
```
docker exec -it CONTAINER mysql -u root -proot
```
At this point you should have access to server. Try to create database:
```mysql
CREATE DATABASE kzprot;
CREATE USER kzuser;
```
Next select kzprot database and grant priveleges to kzuser
```mysql
USE kzprot;
GRANT ALL PRIVELEGES ON *.* TO kzuser;
```
Tables will be created once application starts.
Yet for it to be operational you might want to initialize **logde** table with some data. Try:
```mysql
INSERT INTO lodge VALUES (1, 400, 'Buczynka'),(2, 400, 'Kalinka'),(3, 800, 'Jaworzynka');
```
It will fill lodge select input once the page is reloaded.