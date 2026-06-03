# Courses App

A simple Android application built using **Kotlin** and **Jetpack Compose** that displays a collection of course topics in a responsive grid layout. Each topic is presented as a card containing an image, topic name, and the number of available courses.

## Features

* Built entirely with Jetpack Compose
* Displays course categories in a two-column grid
* Uses Material 3 components
* Efficient rendering with `LazyVerticalGrid`
* Responsive card-based UI
* Resource-based images and strings

## Screenshots

*Add screenshots of the application here.*

## Tech Stack

* Kotlin
* Jetpack Compose
* Material 3
* Android Studio

## Project Structure

```text
app/
├── data/
│   └── DataSource.kt
├── model/
│   └── Topic.kt
├── ui/
│   └── theme/
├── MainActivity.kt
└── res/
    ├── drawable/
    └── values/
```

## Components

### Topic Model

Represents a course topic with:

* Topic name
* Topic image
* Available course count

### DataSource

Provides a list of topics displayed in the grid.

### TopicCard

Displays:

* Topic image
* Topic name
* Number of available courses

### TopicGrid

Uses `LazyVerticalGrid` to efficiently render course cards in a two-column layout.

## Getting Started

### Prerequisites

* Android Studio
* Android SDK 24+
* Kotlin

### Installation

1. Clone the repository:

```bash
git clone <repository-url>
```

2. Open the project in Android Studio.

3. Sync Gradle dependencies.

4. Run the application on an emulator or physical device.

## Learning Objectives

This project demonstrates:

* Composable functions
* Layouts using Row, Column, and Box
* Material 3 Cards
* Image and String Resources
* LazyVerticalGrid
* State-independent UI design
* Android resource management

## Future Improvements

* Search functionality
* Course detail screen
* Navigation between screens
* Dark mode support
* Dynamic data from API or database

## Author

Nilesh S.

Android Developer | Kotlin | Jetpack Compose

