# Smart Study Assistant (GeniusGuide)

**An academic software engineering project exploring an AI-assisted e-learning platform.**

Smart Study Assistant, also referred to as **GeniusGuide**, is an academic project focused on designing a learning platform that aims to help students manage their learning activities through quizzes, AI-assisted questions, progress tracking, learning streaks, and leaderboards.

The repository contains software requirements documentation, system architecture diagrams, UML diagrams, Java class models, implementation experiments, and JUnit tests.

> **Project status:** Academic prototype and software design project. The complete e-learning platform described in the documentation has not yet been implemented.

## Project Objectives

The proposed system aims to:

- Support student learning through quizzes and educational resources.
- Explore AI-assisted question answering.
- Track student learning progress and quiz performance.
- Encourage consistent learning through streaks and points.
- Provide leaderboard-based student ranking.
- Give administrators tools for managing users, learning materials, and quizzes.

## Proposed System Modules

The project documentation describes the following modules:

| Module | Intended responsibility |
|---|---|
| User Management | User accounts, authentication, and password recovery |
| Student | Student learning activities and dashboard |
| Administration | User, quiz, and learning material management |
| Quiz Management | Quiz creation and question management |
| Quiz Attempts | Recording attempts and calculating scores |
| Results | Grade and pass/fail result generation |
| AI Assistant | Sending student questions and receiving AI responses |
| Streak Tracking | Tracking consecutive learning activity |
| Leaderboard | Ranking students based on points |
| Notifications | Communicating information to users |

These are proposed system responsibilities, not a claim that every module is fully operational.

## Current Java Prototype

The repository contains Java classes representing several of the proposed system entities.

Examples include:

- `User`
- `Student`
- `Admin`
- `Quiz`
- `Question`
- `QuizAttempt`
- `Result`
- `AIRequest`
- `AIResponse`
- `Leaderboard`
- `Streak`
- `Notification`

Some implemented logic includes:

- Adding questions to a quiz.
- Calculating quiz total marks using a one-mark-per-question rule.
- Validating answers using trimmed, case-insensitive comparison.
- Basic administrator login-state handling.
- Basic input validation and object field management.

Several methods remain placeholders, including student authentication, AI question processing, quiz attempts, score calculation, leaderboard updates, streak updates, and notification delivery.

## Software Design and Documentation

A substantial part of this project focuses on software engineering design and documentation.

The repository includes:

### Requirements and System Design
- Software Requirements Specification (SRS).
- High-Level Design (HLD).
- System architecture diagram.
- Module diagram.
- Data Flow Diagram (DFD).
- High-level database schema.

### UML and Modeling
- Use case diagrams.
- Class diagrams.
- Activity diagrams.
- Sequence diagrams.
- Reverse-engineered class diagram.

### Project Documentation
- Phase 2 documentation.
- Phase 3 implementation report.
- Phase 5 design and implementation report.
- Phase 6 JUnit testing report.

The diagrams and reports document proposed workflows such as course creation, quiz creation, student quiz attempts, AI questions, notifications, and result viewing.

## Technology and Tools

| Technology / Tool | Use in the repository |
|---|---|
| Java | Prototype classes and business-logic experiments |
| JUnit 5 | Unit testing |
| UML | System and object-oriented design |
| Draw.io | Architecture and design diagrams |
| PDF / DOCX / Markdown | Project documentation |

**Note:** The repository does not currently contain a Maven or Gradle build configuration. A complete running application and its full technology stack cannot be verified from the available implementation.

## Testing

The Phase 6 report records the following JUnit test results:

| Metric | Reported result |
|---|---:|
| Tests found | 45 |
| Tests started | 45 |
| Tests successful | 45 |
| Tests failed | 0 |

These results demonstrate that the reported test suite completed successfully. However, many tests verify basic object behavior and placeholder methods rather than complete e-learning workflows.

## Repository Structure

```text
smart-study-assistant/
│
├── README.md
├── SRS_GeniusGuide_G3.pdf
│
├── docs/
│   ├── Phase_2.docx
│   ├── phase_3_Report.md
│   ├── phase_5_report.md
│   ├── Architecture Diagrams
│   ├── UML Diagrams
│   ├── Activity Diagrams
│   ├── Sequence Diagrams
│   └── Project Screenshots
│
└── src/
    ├── AIRequest.java
    ├── AIResponse.java
    ├── Admin.java
    ├── Leaderboard.java
    ├── Notification.java
    ├── Question.java
    ├── Quiz.java
    ├── QuizAttempt.java
    ├── Result.java
    ├── Streak.java
    ├── Student.java
    ├── User .java
    │
    ├── Main/
    │   └── Java prototype classes
    │
    ├── Test/
    │   └── JUnit 5 test classes
    │
    └── phase_6_report.md
```

## Project Limitations

The current repository should be understood as a design-oriented academic prototype rather than a completed e-learning application.

Important limitations include:

- No complete runnable application interface.
- No integrated database implementation.
- AI request and response processing are placeholders.
- Student login and quiz-taking workflows are not implemented.
- Quiz-attempt score calculation is not implemented.
- Leaderboard, streak, notification, and result operations are largely incomplete.
- No Maven or Gradle build configuration is included.
- Some classes appear in duplicate locations, reflecting different stages of development.
