# Flyway MySQL Spring Boot App

This is a **Spring Boot** application that uses **Flyway** for automated database versioning and **MySQL** as the relational database. It supports basic user creation and retrieval via REST APIs.

---

## 🚀 Features

- ✅ Spring Boot backend (Java)
- ✅ Flyway-based database migration
- ✅ MySQL integration
- ✅ REST API endpoints for user management
- ✅ Automatic schema versioning (`V1__initial_schema.sql`, `V2__add_phone_column.sql`)
- ✅ Maven project structure

---

## 🧑‍💻 Technologies Used

- Java 17
- Spring Boot
- Flyway
- MySQL
- Maven
- Eclipse IDE

---

## 🗃️ Database Schema (via Flyway)

### `V1__initial_schema.sql`
```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```
### `V1__initial_schema.sql`
```sql
ALTER TABLE users ADD COLUMN phone_number VARCHAR(20);
```

## 📦 API Endpoints
### ➕Create User
POST /api/users
Request Body:
```json
{
  "username": "ambika",
  "email": "ambika@example.com",
  "phoneNumber": "9876543210"
}
```
## 📥 Get All Users
GET /api/users

## 🛠️ How to Run Locally
1. Make sure MySQL is running
2. Create the database:
```sql
CREATE DATABASE flywaydb;
```
3. Configure application.properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/flywaydb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=none
spring.flyway.enabled=true
```
4. Run the app:
```bash
mvn spring-boot:run
```

## 📁 Project Structure
```bash
src/
 ├── main/
 │    ├── java/com/ambika/flyway
 │    └── resources/db/migration/
 │          ├── V1__initial_schema.sql
 │          └── V2__add_phone_column.sql
```
## ✨ Author
👩 Ambika Joshi - https://github.com/AjIndia77
