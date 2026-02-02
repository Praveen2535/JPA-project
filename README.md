# Spring Data JPA – Model & Repository Demo

This is a **minimal Spring Boot project** created to understand how **Spring Data JPA** works.
The project focuses **only on Entity (Model) and Repository layers** — no full system, no controllers, no services.

---

## 🎯 Purpose of This Project

* Learn how **Spring Data JPA** works internally
* Understand **Entity mapping** with JPA annotations
* Practice using **JpaRepository** methods
* Explore basic **CRUD operations** with a database

> ⚠️ This is **not a complete application**. It is a **learning/demo project**.

---

## 🛠 Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA (Hibernate)**
* **Maven**
* **H2 / MySQL** (any relational DB)

---

## 📂 Project Structure

```
src/main/java
└── com.example.jpa
    ├── model        // JPA Entities
    └── repository   // JpaRepository interfaces

src/main/resources
└── application.properties

pom.xml
README.md
```

---

## 🧩 What Is Implemented

### ✅ Entity (Model)

* Annotated with `@Entity`
* Primary key using `@Id` and `@GeneratedValue`
* Column mapping using `@Column`

Example:

```java
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String instructor;
}
```

---

### ✅ Repository

* Uses `JpaRepository`
* No implementation class needed
* Built-in CRUD methods available

Example:

```java
public interface CourseRepository extends JpaRepository<Course, Long> {
}
```

---

## ⚙️ Configuration

Sample `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.h2.console.enabled=true
```

---

## ▶️ Running the Project

```bash
mvn spring-boot:run
```

The application starts and **initializes the JPA entities and repositories**.

---

## 📚 Key Learnings

* How JPA maps Java objects to database tables
* How `JpaRepository` provides CRUD methods automatically
* How Hibernate creates tables from entities
* How configuration affects schema generation


---

## 👨‍💻 Author

**Praveen Kumar**
Java | Spring Boot | Backend Development

---

⭐ This project is meant purely for **learning Spring Data JPA fundamentals**.
