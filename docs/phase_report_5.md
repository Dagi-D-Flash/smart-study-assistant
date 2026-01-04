## system architecture diagrams

## Module Diagram

![Module Diagram](<GeniusGuide - Module Diagram.drawio (2) (2).png>)

## Data flow Diagram

![Data flow diagram](<Data Flow Diagram .drawio.png>)

## High Level Database Schema

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

7. Result
   generateResult(score)
   INPUT score
   IF score >= passMark THEN
   grade = "Pass"
   passed = true
   ELSE
   grade = "Fail"
   passed = false
   END IF
   STORE result
   RETURN grade

8. Streak
   updateStreak()
   IF lastActiveDate == yesterday THEN
   currentStreak = currentStreak + 1
   ELSE
   currentStreak = 1
   END IF

UPDATE lastActiveDate
SAVE streak data

9. Leaderboard
   updateRanking(student)
   FETCH all students and scores
   SORT students by totalPoints descending
   UPDATE ranking positions
   SAVE leaderboard data

10. Notification
    sendNotification()
    INPUT message, userId
    CHECK if user exists
    SEND notification to user
    STORE notification record

11. AIRequest
    sendRequest()
    SEND question to AI Service
    WAIT for response
    FORWARD response to AIResponse

12. AIResponse
    getResponse()
    RECEIVE response from AI Service
    RETURN AI-generated answer

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

## Sequence diagrams

3. student ask AI Assistant
   ![Student Ask AI Assistant](<LLD_Sequence_student asks AI assistant.jpg>)
4. Admin Creates a Course

![AdminCreateCourse](LLD_Sequence_AdminCreateCourse.png)

6. Admin Creates Quiz

![AdminCreateQuiz](LLD_Sequence_AdminCreateQuiz.png)

7. Notification Sent to Student

![NotificationSentToStudent](LLD_Sequence_NotificationSentToStudent.png)

## Error handling and validations
