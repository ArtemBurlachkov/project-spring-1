# Тема: CRUD на Spring MVC

Нужно сделать список задач (todo-list) с возможностью просматривать список задач, добавлять новые задачи, редактировать
и удалять существующие задачи.

Желательно, не использовать Spring Boot, а самому разобраться как все сконфигурировать.

Что нужно сделать:

<details>
    <summary><H3>Задача 1</H3></summary>
    Развернуть sql скрипт

    CREATE DATABASE  IF NOT EXISTS `todo` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
    USE `todo`;
    DROP TABLE IF EXISTS `task`;
    /*!40101 SET @saved_cs_client     = @@character_set_client */;
    /*!40101 SET character_set_client = utf8 */;
    CREATE TABLE `task` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `description` varchar(100) NOT NULL,
      `status` int(11) NOT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4;
    /*!40101 SET character_set_client = @saved_cs_client */;

    LOCK TABLES `task` WRITE;
    /*!40000 ALTER TABLE `task` DISABLE KEYS */;
    INSERT  IGNORE INTO `task` VALUES (1,'aaa',1),(2,'bbb',2),(3,'ccc',0),(4,'ddd',1),(5,'eee',2),
    (6,'fff',0),(7,'ggg',1),(8,'hhh',2),(9,'jjj',0),(10,'kkk',1),(11,'lll',2),(12,'mmm',0),
    (13,'nnn',1),(14,'ooo',2),(15,'ppp',0);
    /*!40000 ALTER TABLE `task` ENABLE KEYS */;
    UNLOCK TABLES;

</details>

- [x] Сделано

<details>
    <summary><H3>Задача 2</H3></summary>
    Создать новый Maven проект.
</details>

- [x] Сделано

<details>
<summary><H3>Задача 3</H3></summary>
    Добавить зависимости, которые нужны для работы с MySQL, Hibernate, Spring, Spring MVC, Thymeleaf.
</details>

- [x] Сделано

<details>
<summary><H3>Задача 4</H3></summary>
Добавить в проект ентити слой (пакет domain). Добавить класс Task – он будет отвечать за задачу в списке дел. Необходимые поля: description – описание задачи, status – статус выполнения задачи. В качестве статуса используй энам:

```java
public enum Status {
    IN_PROGRESS,
    DONE,
    PAUSED
}
```

</details>

- [x] Сделано

<details>
<summary><H3>Задача 5</H3></summary>
Добавь пакет config. В нем размести необходимые классы настройки Spring MVC приложения, работы с БД (через Hibernate) и все прочие настройки.
</details>

- [x] Сделано

<details>
<summary><H3>Задача 6</H3></summary>
Добавь dao слой, в котором должен быть класс <span style="border: 1px solid black; padding: 2px 4px; border-radius: 3px;">TaskDAO</span>, который будет отвечать за работу с БД. Методы, которые должны быть – CRUD и поддержка пейджинга.
</details>

- [x] Сделано

<details>
<summary><H3>Задача 7</H3></summary>
Добавь сервисный слой, в котором размести логику по созданию и редактированию задач.
</details>

- [x] Сделано

<details>
<summary><H3>Задача 8</H3></summary>
 Теперь слой контроллера: в нем должны быть методы:
<ul>
  <li>получить список задач (с учетом пейджинга)</li>
  <li>добавить новую задачу</li>
  <li>отредактировать существующую задачу</li>
  <li>удалить задачу</li>
</ul>
</details>

- [x] Сделано

<details>
<summary><H3>Задача 9</H3></summary>
Последний шаг – шаблон (html или js файл). Опционально, можно вынести стили и скрипты в разные файлы по типам. Как обычно, для бекэнд разработчика важен функционал, а не внешний вид, поэтому каким будет визуал приложенния – на твое усмотрение. У меня вышло так:
</details>

- [x] Сделано

<details>
<summary><H3>Опциональное задание:</H3></summary>
Упаковать наше приложение в docker контейнер, добавить docker-compose файл, в котором настроить работу связки приложение-БД в docker-контейнерах.
</details>

- [x] Сделано