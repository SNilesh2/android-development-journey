# Unscramble Game

A simple word puzzle game built with **Jetpack Compose** following the **MVVM (Model-View-ViewModel)** architecture pattern. Players are presented with scrambled words and must guess the original word to earn points.

## Features

* 🎮 Interactive word unscrambling game
* 🔀 Randomly shuffled words
* 🏆 Score tracking system
* ⏭️ Skip word functionality
* ❌ Error indication for incorrect guesses
* 📊 Current word counter
* 🔄 Play Again option after game completion
* 🎨 Modern UI built with Jetpack Compose
* 🏗️ MVVM architecture with StateFlow


## Tech Stack

* Kotlin
* Jetpack Compose
* Material 3
* ViewModel
* StateFlow
* Android Studio

## Project Architecture

The application follows the MVVM architecture pattern:

```text
UI (Compose Screens)
        ↓
    ViewModel
        ↓
    StateFlow
        ↓
     UI State
```

### Components

#### View (UI Layer)

* `MainActivity.kt`
* `GameScreen.kt`

Responsible for displaying the UI and handling user interactions.

#### ViewModel

* `GameViewModel.kt`

Responsible for:

* Managing game logic
* Updating UI state
* Processing user guesses
* Tracking score and progress

#### Model

* `GameUiState.kt`
* `WordsData.kt`

Responsible for:

* Holding UI state
* Providing game data
* Managing constants and word list

## Game Rules

1. A scrambled word is displayed on the screen.
2. Enter the correct word in the text field.
3. Press **Submit** or the keyboard **Done** action.
4. Each correct answer awards **20 points**.
5. Use **Skip** to move to the next word without earning points.
6. The game ends after **10 words**.
7. Your final score is displayed at the end of the game.

## Scoring System

| Action         | Points |
| -------------- | ------ |
| Correct Answer | +20    |
| Skip Word      | 0      |
| Wrong Answer   | 0      |

## Project Structure

```text
app/
└── src/main/java/com/example/unscramble/
    ├── MainActivity.kt
    │
    ├── data/
    │   └── WordsData.kt
    │
    ├── ui/
    │   ├── GameScreen.kt
    │   ├── GameUiState.kt
    │   └── GameViewModel.kt
    │
    └── theme/
        └── Theme Files
```

## Key Concepts Demonstrated

* Jetpack Compose UI Development
* State Management
* State Hoisting
* ViewModel Integration
* StateFlow
* Material Design 3
* Reactive UI Updates
* MVVM Architecture
* Compose Navigation Fundamentals
* Android Lifecycle Awareness

## Installation

1. Clone the repository:

```bash
git clone https://github.com/SNilesh2/unscramble-game.git
```

2. Open the project in Android Studio.

3. Sync Gradle files.

4. Run the application on:

   * Android Emulator
   * Physical Android Device

## Requirements

* Android Studio
* Android SDK 24+
* Kotlin
* Gradle


## Learning Outcomes

This project helped in understanding:

* Declarative UI with Jetpack Compose
* StateFlow and reactive programming
* ViewModel lifecycle management
* MVVM architecture implementation
* State hoisting in Compose
* Material 3 components
* Modern Android development practices

## License

This project is created for learning and educational purposes.

