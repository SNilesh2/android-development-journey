# Navigation Drawer App

A simple Android application built with **Jetpack Compose** that demonstrates how to implement a **Navigation Drawer** using Material 3 components.

## Features

* Material 3 Navigation Drawer
* Custom Drawer Header
* Drawer Menu Items with Icons
* Top App Bar with Hamburger Menu
* Open and Close Drawer using Coroutines
* Toast Messages on Menu Item Selection
* Built entirely with Jetpack Compose


## Tech Stack

* Kotlin
* Jetpack Compose
* Material 3
* Android Studio
* Coroutines

---

## Project Structure

```text
com.example.navigationdrawer
│
├── MainActivity.kt
├── AppBar.kt
├── NavigationHeader.kt
├── MenuItem.kt
│
└── ui
    └── theme
```

### MainActivity.kt

The entry point of the application.

Responsibilities:

* Creates and manages the drawer state.
* Displays the navigation drawer.
* Hosts the top app bar and main content.
* Handles drawer item click events.

### AppBar.kt

Contains the custom Material 3 Top App Bar.

Features:

* Application title.
* Hamburger menu icon.
* Opens the navigation drawer when clicked.

### NavigationHeader.kt

Contains:

#### DrawerHeader()

Displays a custom header at the top of the drawer.

#### DrawerBody()

Displays all navigation menu items using a LazyColumn.

### MenuItem.kt

Data model representing a drawer menu item.

Properties:

* id
* title
* contentDescription
* icon

---

## Drawer Menu Items

The application currently contains:

| Menu Item | Description                 |
| --------- | --------------------------- |
| Home      | Navigate to Home Screen     |
| Settings  | Navigate to Settings Screen |
| Help      | Open Help Section           |

Currently, clicking a menu item displays a Toast message and closes the drawer.

---

## How It Works

### Opening the Drawer

When the user taps the menu icon in the Top App Bar:

```kotlin
scope.launch {
    drawerState.open()
}
```

The Navigation Drawer slides into view.

### Closing the Drawer

After selecting a menu item:

```kotlin
scope.launch {
    drawerState.close()
}
```

The drawer closes automatically.

### Showing Feedback

When a menu item is selected:

```kotlin
Toast.makeText(
    this@MainActivity,
    it.title + " clicked",
    Toast.LENGTH_LONG
).show()
```

A Toast message is displayed.

---

## Running the Project

### Prerequisites

* Android Studio
* Android SDK 24+
* Kotlin

### Steps

1. Clone the repository

```bash
git clone https://github.com/SNilesh2/NavigationDrawer.git
```

2. Open the project in Android Studio.

3. Sync Gradle files.

4. Run the application on an emulator or physical device.

---

## Future Improvements

* Integrate Navigation Compose.
* Add multiple screens.
* Highlight selected drawer item.
* Add user profile section in drawer header.
* Support dark mode customization.
* Add animations and transitions.

---

## Learning Outcomes

This project demonstrates:

* State management in Jetpack Compose.
* Material 3 Navigation Drawer implementation.
* Composable functions and reusable UI components.
* Handling user interactions.
* Using Coroutines with Compose.
* Structuring Compose applications.

---

## Author

Nilesh S

Android Developer | Kotlin | Jetpack Compose

