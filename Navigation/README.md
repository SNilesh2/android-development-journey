# Navigation App using Jetpack Compose

A simple Android application built using **Kotlin**, **Jetpack Compose**, and **Navigation Compose**. This project demonstrates how to navigate between screens and pass arguments from one screen to another using the Navigation Component in Jetpack Compose.

## 📱 Features

* Built entirely with Jetpack Compose
* Uses Navigation Compose for screen navigation
* Demonstrates passing data between screens
* State management using `remember` and `mutableStateOf`
* Clean and beginner-friendly code structure

## 🚀 Project Overview

The application contains two screens:

### Main Screen

* Displays a TextField for user input
* Allows the user to enter their name
* Contains a button to navigate to the Detail Screen

### Detail Screen

* Receives the name entered on the Main Screen
* Displays a personalized greeting message

## 🛠️ Tech Stack

* Kotlin
* Jetpack Compose
* Navigation Compose
* Material 3

## 📂 Project Structure

```text
com.example.navigation
│
├── MainActivity.kt
├── Navigation.kt
└── Screen.kt
```

### MainActivity.kt

Application entry point that loads the Navigation composable.

### Navigation.kt

Contains:

* Navigation graph
* NavHost
* NavController
* MainScreen composable
* DetailScreen composable

### Screen.kt

Defines application routes using a sealed class and provides a helper function for passing arguments.

## 🔄 Navigation Flow

```text
App Launch
     │
     ▼
Main Screen
     │
User enters name
     │
User clicks button
     ▼
Detail Screen
     │
Displays:
Hello <name>
```

## 📋 How It Works

### Step 1: Start Destination

The NavHost starts with:

```kotlin
startDestination = Screen.MainScreen.route
```

This displays the Main Screen when the app launches.

### Step 2: User Input

The user enters a name into the TextField.

```kotlin
var text by remember {
    mutableStateOf("")
}
```

### Step 3: Navigation

When the button is clicked:

```kotlin
navController.navigate(
    Screen.DetailScreen.withArgs(text)
)
```

The route becomes:

```text
DetailScreen/Nilesh
```

### Step 4: Argument Extraction

The Detail Screen receives the argument:

```kotlin
backEntry.arguments?.getString("name")
```

### Step 5: Display Result

The Detail Screen displays:

```text
Hello Nilesh
```

## 📸 Sample Output

### Main Screen

```text
+----------------------------+
|                            |
| Enter your name            |
|                            |
| [Go to Detail Screen]      |
|                            |
+----------------------------+
```

### Detail Screen

```text
+----------------------------+
|                            |
|       Hello Nilesh         |
|                            |
+----------------------------+
```

## 📦 Dependencies

Add Navigation Compose dependency:

```kotlin
implementation("androidx.navigation:navigation-compose:<latest-version>")
```

## 🎯 Learning Outcomes

Through this project, I learned:

* Jetpack Compose fundamentals
* Navigation Compose setup
* Creating navigation routes
* Passing arguments between screens
* Managing UI state with Compose
* Using sealed classes for route management

## ▶️ Getting Started

1. Clone the repository

```bash
git clone https://github.com/SNilesh2/navigation.git
```

2. Open the project in Android Studio

3. Sync Gradle dependencies

4. Run the application on an emulator or physical device

## 👨‍💻 Author

Nilesh S.

Android Development Learning Journey using Kotlin and Jetpack Compose.

