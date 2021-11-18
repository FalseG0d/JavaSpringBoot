# Java Spring Boot

A framework which can acheive any Buisness Purpose and Integrates well with other Frameworks such as Hibernate and Struts.

**Beans :** The Objects that form the Back-Bone of our application and that are managed by the Spring IoC Container are called Beans.

**Spring IoC container :** It forms the Core of the Spring Framework. It creates the Objects, configures and assembles their Dependencies, manages their Life Cycle.

Spring Features : 
    1. POJO
    2. Dependency Framework
    3. MVC
    4. REST
    5. Security
    6. Batch
    7. Data
    9. AOP

POJO : Stands for Plain Old Java Object, an Ordinary Java Object not bound by any restrictions other than those of Java Language Specification. They are used for increasing the Readability and Reusability of a Program.

![SpringBootBeforeSpring](./Images/SpringBootBeforeSpring.png)

application.properties : To Add the properties that we want in the Project.

## Dependency Injection

**What :** When we build a Project there are several Objects which are Dependent on one or more other Objects. Dependency Injection is a technique in which an Object receives other Objects that it Dependes upon.

@Component : An annotation that allows Spring to automatically detect our Custom Bean.
@Autowired : Used to autowire bean on the setter method.

Autowiring is a feature of Spring Framework that enables one to inject the Object Dependency implicitly. It internally uses setters or constructor injection.

## Annotations

@Autowired  : Used to inject the Object Dependency implicitly.

@Data       : Bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together.

@Component  : Allows spring to automatically detect out Custom Beans.

*Autowiring : To implicitly inject the Object Dependency.*

@Scope      : To indicates the name of a scope to use for instances of the annotated type.

@Qualifier  : Similar to @Autowired except this will search by Name over Class. We can give different names to the Classes by @Component("<name>")

