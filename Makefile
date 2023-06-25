MYSQL_ROOT_PASSWORD = secret
MYSQL_DATABASE = taskdb
MYSQL_CONTAINER_NAME = mysqldb

to_mysql_root:
	docker exec -it $(MYSQL_CONTAINER_NAME) mysql -u"root" -p"$(MYSQL_ROOT_PASSWORD)" $(MYSQL_DATABASE)
