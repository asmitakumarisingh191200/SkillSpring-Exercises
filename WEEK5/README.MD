# Cognizant SkillSpring - ReactJS Hands-On Labs & Exercises

This repository contains all the hands-on lab exercises and projects implemented using **ReactJS** as part of the Cognizant SkillSpring Program.

---

## 🚀 Overview of React Applications & Labs Developed

### 1. Week 5: React Fundamentals & Styling Labs

* **Lab 5: Cohort Tracker App (`cohortstracker`)**
  * **Concepts Covered:** CSS Modules, inline styles, tag selectors, and conditional styling.
  * **Details:** Built a dashboard component displaying cohort details (`.net`, `java`) using a custom CSS Module (`CohortDetails.module.css`), applying box styles (`display: inline-block`, borders, padding, border-radius), tag-level `dt` styling, and dynamic inline text colors (`green` for ongoing cohorts, `blue` for others).

* **Lab 9: Cricket Score & Team Management App**
  * **Concepts Covered:** Components, props, array destructuring, ES6 spread operator, and conditional rendering via flags.
  * **Details:** Implemented player lists, filtered players with scores below 70, split Indian team players into Odd and Even position lists using array destructuring (`[first, , third...]`), and merged multiple player arrays using the spread operator (`...`).

* **Lab 10: Office Space Rental App (`officespacerentalapp`)**
  * **Concepts Covered:** JSX syntax, elements, custom attributes (`jsxatt`), objects, and dynamic inline CSS.
  * **Details:** Developed an application displaying office space details (Name, Rent, Address) with an office image attribute. Implemented dynamic conditional styling where the rent text turns **Red** if it is below/equal to 60,000 and **Green** if it is above.

* **Lab 11: Event Examples App (`eventexamplesapp`)**
  * **Concepts Covered:** React Events, event handlers, synthetic events, multi-method invocation, and state management.
  * **Details:** 
    * Created an interactive counter with Increment (invoking multiple methods: count update + alert) and Decrement buttons.
    * Added a "Say welcome" button passing arguments.
    * Implemented a synthetic event handler (`OnPress`) to display click alerts.
    * Built a **CurrencyConvertor** form component to convert Indian Rupees to Euros dynamically on form submission (`handleSubmit`).

* **Lab 12: Ticket Booking App (`ticketbookingapp`)**
  * **Concepts Covered:** Conditional rendering, element variables, user authentication flow, and component switching.
  * **Details:** Built a conditional ticketing view containing `LoginButton`, `LogoutButton`, `UserGreeting` ("Welcome back"), and `GuestGreeting` ("Please sign up.") components managed dynamically via component state (`isLoggedIn`).

* **Lab 13: Blogger App (`bloggerapp`)**
  * **Concepts Covered:** Rendering multiple components, lists, keys, `map()` function, and advanced layout styling.
  * **Details:** Developed a structured dashboard displaying **Course Details**, **Book Details** (using array mapping with unique `key` attributes), and **Blog Details** separated cleanly with vertical CSS dividers.

---

## 🛠️ Tech Stack & Prerequisites
* **Node.js & npm**
* **ReactJS** (Functional & Class Components, State & Props)
* **Visual Studio Code**
* **HTML5 / CSS3 / CSS Modules**