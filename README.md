# ProgressTracker

ProgressTracker is an Android app built with Kotlin and Jetpack Compose to help users track their progress in various activities. It integrates with Firebase for authentication (Google Sign-In).

## Features
- Google Sign-In authentication
- Dashboard for tracking progress
- Modern UI with Jetpack Compose

## Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Android device or emulator
- Firebase project with Google Sign-In enabled

### Setup Instructions
1. **Clone the repository:**
   ```sh
   git clone <https://github.com/Sneha-005/ProgressTracker.git>
   cd ProgressTracker
   ```
2. **Open in Android Studio.**
3. **Firebase Configuration:**
   - Download your `google-services.json` from the Firebase Console.
   - Place it in the `app/` directory.
   - Ensure your app's package name matches the Firebase project.
   - Add your SHA-1 fingerprint to Firebase for Google Sign-In.
4. **Build and run the app.**

## Google Sign-In Configuration
- The app uses the Web client ID from Firebase for Google authentication.
- The client ID is stored in `app/src/main/res/values/strings.xml` as `default_web_client_id`.
- Make sure this matches your Firebase project's Web client ID.

## Dependencies
- Jetpack Compose
- Firebase Auth
- Google Play Services Auth

## License
This project is for educational purposes. 