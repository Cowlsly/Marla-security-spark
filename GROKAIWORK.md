# GROKAIWORK.md

Read this file before every scheduled work session in `Cowlsly/Marla-security-spark`.

Work on the default branch unless Shane/Cowy asks otherwise. Make real repo changes, keep them small, and keep work phone-friendly.

Before choosing a task, read `TODO.md`, `ROADMAP.md`, `README.md`, `README.txt`, `GROKCHECKLIST.md`, `WHATS_NEEDED.md`, `CLEANUP.md`, and `VOLUME.md` when present.

Do not commit private credentials.

## Work loop

1. Read the docs.
2. Check `GROKCHECKLIST.md` for work already done.
3. Choose one safe next task.
4. Search for assets before editing.
5. Add missing asset details to `WHATS_NEEDED.md`.
6. Make the smallest useful change.
7. Run or trigger checks where practical.
8. Record only truly completed work in `GROKCHECKLIST.md`.
9. Update `CLEANUP.md` when used.

## Security Spark priority order

1. Keep debug APK builds working.
2. Keep the app small, simple, and privacy-first.
3. Expand the security tip database.
4. Add categories and filters.
5. Add random facts.
6. Move tips from Kotlin code to a JSON asset if useful.
7. Add session-only favourites and local history if useful.
8. Improve UI and animation polish.
9. Add Simple Settings cog instead of building a duplicate local settings screen.
10. Add Account Centre link and shared Cowlsly account state if this app is not exempted.
11. Keep permissions minimal and document any new permission.
12. Add shared Cowlsly UI assets, pressed states, and sounds.
13. Maintain `WHATS_NEEDED.md`, `VOLUME.md`, and `GROKCHECKLIST.md`.

## Asset rule

Before requesting any image, icon, button, sound, frame, indicator, or other asset, search this repo and `cowlsly-web/assets`. If it is missing or incomplete, document it in `WHATS_NEEDED.md` with purpose, path, size, style, state needs, sound needs, and blocking status.
