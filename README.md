# 📝 Full Stack Task Manager App (React + Spring Boot + MongoDB)

This is a complete 3-tier task management application where users can create, view, and delete tasks. It features a React frontend (Vite), a Spring Boot backend (REST API), and MongoDB Atlas for persistent storage.

---

## 📂 Project Structure

```
task-manager-app/
├── backend/           # Spring Boot + MongoDB (Java)
├── task-frontend/     # React + Vite (UI)
└── README.md
```

---

## 🚀 Tech Stack

- **Frontend**: React, Vite, Fetch API
- **Backend**: Java Spring Boot, REST APIs
- **Database**: MongoDB Atlas (Cloud NoSQL)
- **Build Tools**: Maven, Node.js, npm

---

## 🛠 Features

- Add tasks via form input
- View all tasks in a list
- Delete tasks with real-time updates
- Connected to MongoDB Atlas using Spring Data MongoDB

---

## 📦 How to Run the App Locally

### 🔧 Backend (Spring Boot)
```bash
cd backend
./mvnw spring-boot:run
```

Ensure MongoDB URI is configured in:
```
backend/src/main/resources/application.properties
```

### 🎨 Frontend (React)
```bash
cd task-frontend
npm install
npm run dev
```

Visit: `http://localhost:5173`  
Backend API: `http://localhost:8080/api/tasks`

---

## ✅ Functional Demo

- ✔ Add a task
- ✔ View saved tasks
- ✔ Delete tasks
- ✔ Data persists in MongoDB Atlas


## 🙌 Author

**Neel Joshi**  
💼 Data Engineer 
🌐 [LinkedIn](https://www.linkedin.com/in/neelabhiramjoshi)
