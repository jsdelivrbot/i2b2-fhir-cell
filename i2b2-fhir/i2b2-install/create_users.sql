#create user 'i2b2demodata'@'localhost' identified by 'demouser';
grant all on i2b2demodata.* to 'i2b2demodata'@'localhost'; 
#create user 'i2b2hive'@'localhost' identified by 'demouser';
grant all on i2b2hive.* to 'i2b2hive'@'localhost'; 
create user 'i2b2imdata'@'localhost' identified by 'demouser';
grant all on i2b2imdata.* to 'i2b2imdata'@'locahost'; 
create user 'i2b2metadata'@'locahost' identified by 'demouser';
grant all on i2b2metadata.* to 'i2b2metadata'@'localhost'; 
create user 'i2b2pm'@'locahost' identified by 'demouser';
grant all on i2b2pm.* to 'i2b2pm'@'localhost'; 
create user 'i2b2workdata'@'locahost' identified by 'demouser';
grant all on i2b2workdata.* to 'i2b2workdata'@'localhost'; 