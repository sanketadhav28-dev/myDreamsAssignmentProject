# myDreamsAssignmentProject
Overview
This project is a UI Functional Test Automation framework developed using Selenium with Java and TestNG.

It was built as part of a QA Automation assignment to validate the functionality of the Dream Portal web application:

🔗 https://arjitnigam.github.io/myDreams/

The framework follows Page Object Model (POM) design pattern and includes cross-page validation logic, multi-window handling, and structured test execution.

🛠 Tech Stack
Java

Selenium WebDriver

TestNG

Maven

ChromeDriver

📁 Project Structure
myDreamAssignmentProject
│
├── base        → Browser setup and configuration (BaseTest)
├── pages       → Page Object classes (HomePage, DiaryPage, TotalPage)
├── tests       → Test classes (HomeTest, DiaryTest, TotalTest)
├── pom.xml     → Project dependencies
├── testng.xml  → Test suite configuration
The framework maintains clear separation between:

Test logic

Page actions

WebDriver setup

✅ Test Coverage
🏠 index.html — Dream Portal Home
Verified loading animation appears and disappears

Validated main content visibility

Validated "My Dreams" button visibility

Verified clicking "My Dreams" opens:

dreams-diary.html

dreams-total.html

Implemented multi-window handling

📖 dreams-diary.html — Dream Log Table
Validated exactly 10 dream entries

Verified dream types are only “Good” or “Bad”

Checked all rows contain:

Dream Name

Days Ago

Dream Type

Counted Good Dreams (6)

Counted Bad Dreams (4)

Implemented recurring dream logic using HashMap

📊 dreams-total.html — Summary Page
Verified:

Good Dreams: 6

Bad Dreams: 4

Total Dreams: 10

Recurring Dreams: 2

Cross-validated recurring logic with data from dreams-diary.html

Asserted recurring dreams:

“Flying over mountains”

“Lost in maze”

▶ How to Run the Tests
Run Individual Test
Right click any test class →
Run As → TestNG Test

Run Complete Test Suite
Right click testng.xml →
Run As → TestNG Suite

🎯 Framework Highlights
Page Object Model (POM) implementation

Clean and structured folder hierarchy

TestNG assertions for validation

Multi-window handling

Dynamic table validation

Cross-page data verification

Reusable WebDriver setup using BaseTest

Maven project structure
