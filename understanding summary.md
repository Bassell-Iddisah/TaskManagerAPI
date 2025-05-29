# Understanding Spring, IoC, and REST

## 1. Spring Framework

Spring is a lightweight, open-source Java framework used to create scalable and maintainable applications. It simplifies Java development by taking care of most of the configuration and provides support for building RESTful APIs and features like Dependency Injection.

---

## 2. Inversion of Control (IoC)

IoC is a principle where control of object creation and dependency management is delegated to a container, rather than being handled manually by the developer.

### In Spring:
- Spring manages object lifecycles using its IoC container.
- Dependencies are injected automatically via annotations like `@Component`, `@Service`, `@Repository`, and `@Autowired`.

#### Benefits:
- Loose coupling between classes
- Better testability
- Easier to manage and scale
---

## 3. REST (Representational State Transfer)

REST is an architectural style for designing stateless, scalable web services over HTTP. It uses standard HTTP methods like:

- `GET` for retrieving data
- `POST` for creating data
- `PUT` for updating data
- `DELETE` for removing data

### REST in this project:
- The application exposes RESTful endpoints for managing tasks.
- Follows stateless communication, resource-based URIs (`/api/tasks`), and proper HTTP methods for operations.

---

## Summary

This project demonstrates the practical use of:
- **Spring Boot** for rapid development,
- **IoC** for clean and maintainable code structure,
- **REST** for creating a standard web API interface.

These were applied following clean architecture principles and packaged with Docker for consistent deployment.