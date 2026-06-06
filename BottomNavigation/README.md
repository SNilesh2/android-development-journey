# Bottom Navigation App

A simple Android application built using **Jetpack Compose** and **Navigation Component** that demonstrates how to implement a Bottom Navigation Bar with multiple screens.

## Features

- Built completely with Jetpack Compose
- Material 3 UI Components
- Bottom Navigation Bar
- Navigation Component Integration
- Three Screens:
  - Home Screen
  - Chat Screen
  - Settings Screen
- Dynamic item selection highlighting

## Screenshots

Add your screenshots here.

| Home | Chat | Settings |
|------|------|----------|
| Screenshot | Screenshot | Screenshot |

---

## Project Structure

```
com.example.bottomnavigation
│
├── MainActivity.kt
├── BottomNavItem.kt
│
├── HomeScreen()
├── ChatScreen()
├── SettingsScreen()
│
├── BottomNavigationBar()
└── Navigation()
```

---

## Technologies Used

- Kotlin
- Jetpack Compose
- Material 3
- Navigation Compose
- Android Studio

---

## Dependencies

Add the following dependencies in your `build.gradle.kts` file:

```kotlin
dependencies {

    implementation("androidx.navigation:navigation-compose:2.9.0")

    implementation("androidx.compose.material3:material3")

    implementation("androidx.activity:activity-compose:1.10.1")

}
```

---

## Bottom Navigation Items

| Screen | Route | Icon |
|---------|--------|------|
| Home | home | Home |
| Chat | chat | Notifications |
| Settings | setting | Settings |

---

## Navigation Setup

The application uses `NavHost` and `NavController` to manage navigation between screens.

```kotlin
NavHost(
    navController = navHostController,
    startDestination = "home"
)
```

### Routes

```kotlin
home
chat
setting
```

---

## Running the Project

### Prerequisites

- Android Studio Meerkat or newer
- Android SDK 24+
- Kotlin 2.0+

### Steps

1. Clone the repository

```bash
git clone https://github.com/SNilesh2/bottom-navigation-app.git
```

2. Open the project in Android Studio.

3. Sync Gradle files.

4. Run the application on an emulator or physical device.

---

## Learning Objectives

This project helps developers learn:

- Jetpack Compose Basics
- Scaffold Layout
- Material 3 Components
- Bottom Navigation Implementation
- Navigation Compose
- State Management with Compose

---

## Future Improvements

- Add Badges for Notifications
- Add Animations Between Screens
- Support Dark Mode
- Add Profile Screen
- Implement Deep Linking
- Add ViewModel Integration

---

## Output

### Home Screen

Displays:

```text
Home Screen
```

### Chat Screen

Displays:

```text
Chat Screen
```

### Settings Screen

Displays:

```text
Settings Screen
```

---

## Author

Nilesh S

Android Developer | Kotlin & Jetpack Compose Learner

---

## License

This project is open source and available under the MIT License.
