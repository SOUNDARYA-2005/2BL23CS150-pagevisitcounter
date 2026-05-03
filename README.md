# 2BL23CS150-pagevisitcounter
A Java Servlet-based web application that counts the number of times a user visits a page during a session using HttpSession.

# Page Visit Counter Web Application

## 📌 Description
This project is a Java-based web application developed using Servlets and Apache Tomcat.  
It tracks the number of times a user visits a page during a session using HttpSession.

Each visit increases the counter and displays:
- Total number of visits in the session
- Session creation time

---

## 🎯 Objective
- To understand HttpSession in Servlets
- To maintain user-specific data across requests
- To implement session-based visit counting

---

## 🛠️ Technologies Used
- Java (Servlet API - Jakarta)
- HTML
- Apache Tomcat v10.1
- Eclipse IDE

---


PageVisitCounter/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── tara/          (or your package name)
│       │           └── PageVisitServlet.java
│       │
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml
│           │
│           ├── index.html
│
├── screenshots/
│   ├── screenshot1.png
│   ├── screenshot2.png
│
├── README.md


---

## ⚙️ Working

1. User opens index page
2. Clicks "Visit Page"
3. Servlet is called using URL mapping `/visit`
4. Session is created/retrieved
5. Visit count is stored and incremented
6. Output is displayed

---

## 💻 Core Logic

```java
HttpSession session = request.getSession();
Integer count = (Integer) session.getAttribute("count");

if(count == null) {
    count = 1;
} else {
    count++;
}

session.setAttribute("count", count);

▶️ How to Run
Import project into Eclipse
Configure Apache Tomcat
Run on server
Open:

http://localhost:8081/PageVisitCounter/index.html

📸 Output
Displays visit count
Displays session creation time
Count increases on each visit

📊 Minimum Requirements
HTML file ✔
Servlet file ✔
web.xml ✔
Screenshots ✔
README ✔

📚 Conclusion

This project demonstrates session tracking using HttpSession in Java Servlets and helps understand state management in web applications.

author
soundarya
BE
