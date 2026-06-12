# Marla Security Spark 🔦

A tiny Android app by Cowlsly: press **Surprise Me** and Marla shows a useful security, privacy, scam-avoidance, Android safety, or technology-learning tip.

This is deliberately small. No login. No Firebase. No analytics. No ads. No network permission. The first version is a little lantern, not a castle.

**Now styled consistently** with the rest of the Cowlsly suite (Collaborate app + website): deep dark navy backgrounds, clean modern typography, and Marla’s signature bright pink accent.

## What the app does

- Shows one main screen.
- Displays a title and a friendly intro.
- Shows a random local tip when you press **Surprise Me**.
- Displays a category label for the current tip.
- Lets you copy the current tip.
- Stores all starter tips locally in Kotlin code.
- Uses no Android permissions.

## Project structure

```text
MarlaSecuritySpark/
├── .github/
│   └── workflows/
│       └── build-debug-apk.yml
├── app/
│   ├── build.gradle.kts
│   ├── proguard-rules.pro
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/cowlsly/securityspark/
│       │   ├── MainActivity.kt
│       │   ├── SecurityTip.kt
│       │   ├── TipsRepository.kt
│       │   └── ui/theme/
│       │       └── SecuritySparkTheme.kt
│       └── res/
│           ├── drawable/
│           │   └── ic_launcher.xml
│           └── values/
│               ├── strings.xml
│               └── styles.xml
├── build.gradle.kts
├── gradle.properties
├── settings.gradle.kts
└── README.md
```

## Styling (updated for suite consistency)

- Dark navy / black backgrounds (`#0F0F1A`)
- Marla’s bright pink as primary accent (`#F472B6`)
- Clean white text on dark surfaces
- Modern sans-serif font
- Matches the aesthetic of the Collaborate app and Cowlsly website

## What each part teaches

**MainActivity.kt** teaches what an Android Activity is. An Activity is the entry point for a screen. Here it starts the app and loads the Compose interface.

**Jetpack Compose** teaches modern Android UI. Instead of editing XML layouts for every screen, you write Kotlin functions that describe what the screen should look like.

**SecurityTip.kt** teaches a Kotlin data class. A data class is a neat little container for structured information. In this app, one tip has an id, category, and text.

**TipsRepository.kt** teaches local data storage in code. The app has a built-in list of tips and does not need the internet.

**Surprise Me button** teaches app state and events. When you tap the button, the app chooses a different random tip index and redraws the screen.

**Copy Tip button** teaches using a safe Android system service. It copies text to the clipboard, but does not read private clipboard content.

**Gradle files** teach how Android builds work. Gradle gathers Kotlin code, Android resources, and dependencies, then builds the APK.

**GitHub Actions workflow** teaches cloud builds. GitHub can build the debug APK for you, which helps when your Samsung Galaxy Z Fold 6 is your main command cockpit.

## Build from GitHub Actions

1. Create a new GitHub repository, for example `marla-security-spark`.
2. Upload these project files to the repository.
3. Open the repository on GitHub.
4. Go to **Actions**.
5. Choose **Build debug APK**.
6. Tap **Run workflow**.
7. When the build finishes, open the workflow run.
8. Download the artifact named **MarlaSecuritySpark-debug-apk**.
9. Unzip the artifact on your phone.
10. Tap the debug APK to install it.

Android may ask you to allow installing unknown apps from your browser or file manager. Only enable that for trusted APKs you built yourself, and turn it off again afterward.

## Mobile-first upload from a Fold 6 using Termux

This is the most reliable phone-only route.

1. Create an empty GitHub repo in your browser first.
2. Download and extract this project ZIP on your phone.
3. Open Termux.
4. Run:

```bash
termux-setup-storage
pkg update
pkg install git unzip
cd ~/storage/downloads
unzip MarlaSecuritySpark.zip
cd MarlaSecuritySpark
git init
git branch -M main
git add .
git commit -m "Create Marla Security Spark starter app"
git remote add origin https://github.com/YOUR_GITHUB_USERNAME/marla-security-spark.git
git push -u origin main
```

GitHub no longer accepts normal account passwords for command-line pushes. Use a GitHub personal access token when prompted for a password, or use GitHub's own mobile/browser upload tools if you prefer.

## Local build command

If you open this project on a PC or a capable Android coding environment with Android SDK and Gradle available, the build command is:

```bash
gradle :app:assembleDebug
```

The APK will be created at:

```text
app/build/outputs/apk/debug/app-debug.apk
```

## Next tiny upgrades

Good next steps, in order:

1. Add a session-only favourite button.
2. Move tips from Kotlin code to a JSON file in assets.
3. Add categories filter.
4. Add a daily tip widget.
5. Add simple persistent favourites using DataStore.

Keep each upgrade small. Tiny sparks first, grand vault doors later.
