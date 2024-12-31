# HappyBirthday App 🎉
HappyBirthday is a simple Android application with two screens: a Splash Screen and a Main Screen. The app plays a unique video and audio on each screen, creating a personalized celebration experience.

## Features
#### Splash Screen:
  - Displays a video with accompanying audio as a warm-up to the main event.
  - Automatically transitions to the main screen once the splash video finishes.
#### Main Screen:
  - Displays another video and plays a complementary audio track.
  - Automatically closes the app once the main video ends.
#### Seamless Transitions:
  - The app smoothly transitions from the splash screen to the main screen without user intervention.

## How It Works
#### Splash Screen:
  1. Plays a video (splash_video1.mp4) and audio (audio1.mp3).
  2. On completion, transitions to the main screen.
#### Main Screen:
  1. Plays a video (main_video.mp4) and audio (audio2.mp3).
  2. Closes the app automatically when the video finishes.
## Screenshots
#### Splash Screen:
![WhatsApp Image 2024-12-31 at 16 09 45_1571d4aa](https://github.com/user-attachments/assets/3c568c00-a22f-4a62-8430-63a77d3e5e39)

#### Main Screen:
![WhatsApp Image 2024-12-31 at 16 09 45_f53e22e0](https://github.com/user-attachments/assets/c28b27c2-1039-4e36-aa8d-bf0447f40613)

## Code Structure
### Splash Screen (SplashScreenActivity)
  - VideoView: Displays the splash video (R.raw.splash_video1).
  - MediaPlayer: Plays the audio file (R.raw.audio1).
  - Transition: Automatically navigates to MainActivity when the splash video ends.
### Main Screen (MainActivity)
  - VideoView: Displays the main video (R.raw.main_video).
  - MediaPlayer: Plays the audio file (R.raw.audio2).
  - Exit Behavior: Closes the app when the video ends.

## Setup and Installation
1. Clone or download the repository.
2. Open the project in Android Studio.
3. Place your media files in the res/raw folder:
  - splash_video1.mp4
  - main_video.mp4
  - audio1.mp3
  - audio2.mp3
4. Build and run the app on an emulator or physical device.

## Dependencies
#### AndroidX Libraries:
```
androidx.appcompat:appcompat
androidx.constraintlayout:constraintlayout
```
#### Media Playback:
Built-in Android MediaPlayer and VideoView classes.

## Contributing
Feel free to fork this repository, make changes, and submit a pull request. Suggestions and improvements are always welcome!

## License
This project is licensed under the MIT License. See the LICENSE file for more details.


## Acknowledgments
Inspired by the joy of celebrations!<br>
Designed as a fun way to experiment with Android development concepts like media playback, video transitions, and app lifecycle.
