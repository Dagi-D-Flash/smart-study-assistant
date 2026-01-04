<<<<<<< HEAD
=======



## system architecture diagrams

## Module Diagram
![Module Diagram](<GeniusGuide - Module Diagram.drawio (2) (2).png>)
## Data flow Diagram

![Data flow diagram](<Data Flow Diagram .drawio.png>)

## High Level Database Schema
![High Level Database Schema](<GeniusGuide – High Level Database Schema.drawio.png>)

## Class diagram method definitions

## Streak

## ● updateStreak()

## ○ Increments streak if active daily

## Question

## ● getQuestionText()

## ○ Returns the text of the question

## ● getCorrectAnswer()

## ○ Returns the correct answer

## ● validateAnswer(answer)

## ○ Checks if the answer is correct

## ● getOptions()

## ○ Returns all answer options

## Leaderboard

## ● updateRanking(student)

## ○ Updates student rank

## Notification

## ● sendNotification()

## ○ Sends message to user

## AIRequest

## ● sendRequest()

## ○ Sends prompt to AI service

## AIResponse

## ● getResponse()

## ○ Returns AI explanation

## Pseudocode or algorithms

## Detailed Database Tables

## 1.User Table (Abstract → User, Parent of Student & Admin)

## CREATE TABLE users (

## user_id INT AUTO_INCREMENT PRIMARY KEY,

## name VARCHAR(100) NOT NULL,

## email VARCHAR(150) NOT NULL UNIQUE,

## password_hash VARCHAR(255) NOT NULL,

## role ENUM('STUDENT', 'ADMIN') NOT NULL,

## created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

## );

##

## 2. Students Table (inherits User)

## CREATE TABLE students (

## student_id INT PRIMARY KEY,

## FOREIGN KEY (student_id) REFERENCES users(user_id)

## ON DELETE CASCADE

## );

##

## 3. Admins Table (inherits User)

## CREATE TABLE admins (

## admin_id INT PRIMARY KEY,

## FOREIGN KEY (admin_id) REFERENCES users(user_id)

## ON DELETE CASCADE

## );

##

## 4. Quiz Table

## CREATE TABLE quizzes (

## quiz_id INT AUTO_INCREMENT PRIMARY KEY,

## title VARCHAR(150) NOT NULL,

## total_marks INT DEFAULT 0,

## created_by INT,

## created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

## FOREIGN KEY (created_by) REFERENCES admins(admin_id)

## );

##

## 5. Question Table (Composition with Quiz)

## CREATE TABLE questions (

## question_id INT AUTO_INCREMENT PRIMARY KEY,

## quiz_id INT NOT NULL,

## question_text TEXT NOT NULL,

## correct_answer VARCHAR(255) NOT NULL,

## marks INT NOT NULL,

## FOREIGN KEY (quiz_id) REFERENCES quizzes(quiz_id)

## ON DELETE CASCADE

## );

##

## 6. QuizAttempt Table

## CREATE TABLE quiz_attempts (

## attempt_id INT AUTO_INCREMENT PRIMARY KEY,

## student_id INT NOT NULL,

## quiz_id INT NOT NULL,

## score INT DEFAULT 0,

## attempted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

## FOREIGN KEY (student_id) REFERENCES students(student_id),

## FOREIGN KEY (quiz_id) REFERENCES quizzes(quiz_id)

## );

## 7.  Result Table (1-to-1 with QuizAttempt)

## CREATE TABLE results (

## result_id INT AUTO_INCREMENT PRIMARY KEY,

## attempt_id INT UNIQUE NOT NULL,

## grade VARCHAR(20),

## generated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

## FOREIGN KEY (attempt_id) REFERENCES quiz_attempts(attempt_id)

## 	ON DELETE CASCADE

## );

##

## 8.  Streak Table (1-to-1 with Student)

## CREATE TABLE streaks (

## streak_id INT AUTO_INCREMENT PRIMARY KEY,

## student_id INT UNIQUE NOT NULL,

## current_streak INT DEFAULT 0,

## last_activity DATE,

## FOREIGN KEY (student_id) REFERENCES students(student_id)

## 	ON DELETE CASCADE

## );

##

## 9.  Leaderboard Table (Aggregation of Students)

## CREATE TABLE leaderboard (

## leaderboard_id INT AUTO_INCREMENT PRIMARY KEY,

## student_id INT NOT NULL,

## total_score INT DEFAULT 0,

## rank_position INT,

## FOREIGN KEY (student_id) REFERENCES students(student_id)

## );

##

## 10. Notifications Table

## CREATE TABLE notifications (

## notification_id INT AUTO_INCREMENT PRIMARY KEY,

## user_id INT NOT NULL,

## message TEXT NOT NULL,

## is_read BOOLEAN DEFAULT FALSE,

## sent_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

## FOREIGN KEY (user_id) REFERENCES users(user_id)

## 	ON DELETE CASCADE

## );

##

## 11. AI Requests Table

## CREATE TABLE ai_requests (

## request_id INT AUTO_INCREMENT PRIMARY KEY,

## student_id INT NOT NULL,

## question TEXT NOT NULL,

## requested_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

## FOREIGN KEY (student_id) REFERENCES students(student_id)

## 	ON DELETE CASCADE

## );

##

## 12. AI Responses Table (1-to-1)

## CREATE TABLE ai_responses (

## response_id INT AUTO_INCREMENT PRIMARY KEY,

## request_id INT UNIQUE NOT NULL,

## response TEXT NOT NULL,

## responded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

## FOREIGN KEY (request_id) REFERENCES ai_requests(request_id)

## 	ON DELETE CASCADE

## );

## Sequence diagrams

4. Admin Creates a Course

![AdminCreateCourse](LLD_Sequence_AdminCreateCourse.png)

5. Student Views Results
![Student Views Results](LLD_Sequence_StudentViewResults.png)

6. Admin Creates Quiz

![AdminCreateQuiz](LLD_Sequence_AdminCreateQuiz.png)

7. Notification Sent to Student

![NotificationSentToStudent](LLD_Sequence_NotificationSentToStudent.png)

## Error handling and validations

>>>>>>> origin/main
