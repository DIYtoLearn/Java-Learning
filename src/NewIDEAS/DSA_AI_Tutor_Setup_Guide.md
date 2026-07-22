# DSA AI Tutor Setup Guide (Windows 11)

## Goal

Build a personal AI DSA tutor that: - Uses OpenAI models for
reasoning. - Guides instead of giving solutions immediately. - Tracks
mastery, mistakes, and reviews. - Stores data locally in SQLite. -
Integrates with your Java DSA repository.

## Your System

-   CPU: Intel Core i7-13700HX
-   RAM: 16 GB
-   OS: Windows 11 Home 25H2 (64-bit)

This is more than sufficient for the proposed setup.

## Security Recommendation

Use the OpenAI API rather than exposing your repository to random
third-party services.

Good options: 1. OpenAI API (recommended) 2. VS Code with OpenAI API 3.
SQLite for local storage

Avoid uploading personal repositories to unknown AI websites.

------------------------------------------------------------------------

# Prerequisites

Install:

-   Git
-   Python 3.12+
-   VS Code
-   JDK 21
-   Maven (optional)

Verify:

``` powershell
python --version
git --version
java -version
```

------------------------------------------------------------------------

# Repository Layout

``` text
DSA-AI-Tutor/
|
+-- Problems/
+-- Notes/
+-- Progress/
+-- Memory/
+-- prompts/
+-- database/
+-- tutor/
+-- main.py
+-- requirements.txt
+-- .env
```

------------------------------------------------------------------------

# Python Environment

``` powershell
python -m venv .venv
.venv\Scripts\activate
```

Install packages

``` powershell
pip install openai python-dotenv sqlalchemy rich typer pydantic
```

Freeze dependencies

``` powershell
pip freeze > requirements.txt
```

------------------------------------------------------------------------

# OpenAI API

Create an API key from the OpenAI developer platform.

Create `.env`

``` text
OPENAI_API_KEY=YOUR_API_KEY
```

Never commit `.env`.

------------------------------------------------------------------------

# SQLite

Suggested tables:

-   concepts
-   sessions
-   problems
-   reviews
-   mastery
-   mistakes

------------------------------------------------------------------------

# Tutor Workflow

1.  Read problem.
2.  Ask for explanation.
3.  Ask for intuition.
4.  Ask brute force.
5.  Analyze complexity.
6.  Ask for pseudocode.
7.  Review pseudocode.
8.  Ask for Java.
9.  Review code.
10. Suggest optimizations.
11. Update mastery.

------------------------------------------------------------------------

# Tutor Override Prompt

``` text
You are an expert DSA mentor.

Rules:

Never immediately reveal the optimal solution.

Always ask:

1. Explain the problem.

2. Explain your intuition.

3. Describe brute force.

4. Time complexity.

5. Space complexity.

6. Write pseudocode.

Only after reviewing pseudocode may the student write Java.

If prerequisite knowledge is missing:

- identify the exact concept
- explain it
- generate easier prerequisite exercises
- return to the original problem later

Hints must be incremental.

Never skip directly to code unless requested after multiple hints.

After every session produce:

Strengths
Weaknesses
Homework
Concept mastery update
Interview readiness
```

------------------------------------------------------------------------

# Review Prompt

``` text
Review my Java code.

Evaluate:

Correctness

Time complexity

Space complexity

Edge cases

Readability

Naming

Interview quality

Do not rewrite immediately.

Ask guiding questions first.
```

------------------------------------------------------------------------

# Knowledge Gap Prompt

``` text
Determine whether my mistake is conceptual.

If yes:

Identify prerequisite topics.

Generate 3 easier exercises.

Teach the missing concept.

Return to the original problem.
```

------------------------------------------------------------------------

# Daily Session

``` powershell
python main.py
```

Typical flow:

-   Select problem
-   Explain
-   Intuition
-   Brute force
-   Complexity
-   Pseudocode
-   Java
-   Review
-   Optimization
-   Reflection

------------------------------------------------------------------------

# Future Improvements

-   VS Code extension
-   Spaced repetition
-   Flashcards
-   Mock interviews
-   Progress dashboard
-   Local embedding search
-   Voice mode
-   Weekly reports

------------------------------------------------------------------------

# Recommended OpenAI Models

-   GPT-5.5 for tutoring and reasoning
-   Smaller OpenAI model for summaries if cost becomes a concern

## Note about ChatGPT Go

A ChatGPT Go subscription does **not** include OpenAI API usage. API
usage is billed separately through the OpenAI developer platform.
