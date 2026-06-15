# Marla Security Spark – TODO

## Current Priorities
- [ ] Expand security tip database with categories
- [ ] Add random fact functionality
- [ ] Improve UI and animations
- [ ] Add basic settings screen
- [ ] Implement favorites system

## Technical Tasks
- [ ] Clean up architecture if needed
- [ ] Add local storage for favorites/history (DataStore or Room)
- [ ] Add notification support for daily tips (optional)

## Later / Future
- [ ] Theming options
- [ ] Integration with other Cowlsly apps

---

Keep it simple and focused.

## Completed tasks log (added 2026-06-15)
- Created missing README.txt with phone-friendly build/run instructions, current state summary, and explanation of CI workflow + zip file. This completes the root documentation set and makes the repo easier to understand and contribute to from a Samsung Galaxy Fold.
- **2026-06-15: Completed one documented repo task - Fixed build/config issue in CI workflow (.github/workflows/main.yml). Changed from brittle "unzip MarlaSecuritySpark_v2.zip then build" to standard self-contained Gradle build directly from checked-in `app/` source and root Gradle files. This makes the phone-first GitHub Actions APK download path maintainable without keeping a zip in sync. PR created for review. Non-doc file changed before any doc updates.**

## Last checked date
2026-06-15