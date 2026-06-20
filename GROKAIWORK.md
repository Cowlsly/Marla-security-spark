# GROKAIWORK.md

## Purpose

This is the never-ending scheduled work prompt for Grok inside `Cowlsly/Marla-security-spark`.

Read this file before every scheduled work session. Check what is already complete, choose one safe task, make a real change, record it, then continue next scheduled run.

## Operating mode

Work on the default branch unless Shane/Cowy asks otherwise. Keep work small, safe, phone-friendly, and easy to inspect.

Do not commit private credentials or live provider configuration.

## Required reading

Read these files when present:

- `GROKAIWORK.md`
- `GROKCHECKLIST.md`
- `TODO.md`
- `ROADMAP.md`
- `README.md`
- `README.txt`
- `WHATS_NEEDED.md`
- `CLEANUP.md`
- `VOLUME.md`
- `to-delete/README.md`

## Work loop

1. Read the docs.
2. Check `GROKCHECKLIST.md`.
3. Check TODO, roadmap, README files, and source markers.
4. Choose one safe task.
5. Search this repo and `cowlsly-web/assets` for needed assets.
6. Record missing assets in `WHATS_NEEDED.md`.
7. Make the smallest useful change.
8. Run or trigger checks where practical.
9. Record only real completed work in `GROKCHECKLIST.md`.
10. Use `to-delete/` as the recycle bin for uncertain removals.

## Cross-repo tasks that apply here

- Keep docs accurate and phone-readable.
- Keep debug APK builds healthy.
- Maintain `GROKCHECKLIST.md`, `WHATS_NEEDED.md`, `CLEANUP.md`, `VOLUME.md`, and `to-delete/` rules.
- Never hard-remove uncertain files; move or list them in `to-delete/`.
- Search for assets before requesting or creating new ones.
- Use shared Cowlsly UI assets from `cowlsly-web` where possible.
- Add Account Centre link and shared account state if this app is not exempted.
- Add Simple Settings cog once `simple-settings` exists.
- Do not build a duplicate ordinary settings screen if Simple Settings owns it.
- Add pressed states, button sounds, and warning sounds where needed.
- Record missing assets and sounds in the ledgers.
- Keep legal/about/version/patch notes aligned with the Cowlsly ecosystem where needed.

## Security Spark-specific task list

### Build and project health

- Keep APK build green.
- Fix any failing workflow.
- Keep the app lightweight and privacy-first.
- Confirm permissions remain minimal.
- Document any new permission before adding it.
- Add phone-friendly install notes.
- Keep README/TODO/ROADMAP aligned with actual app state.

### Security tips and content

- Expand the security tip database.
- Add categories.
- Add filters.
- Add random facts.
- Move tips from Kotlin code to a JSON asset if useful.
- Add search if useful.
- Add copy current tip action if missing.
- Add session-only favourites.
- Add local favourite/history storage if useful.
- Add optional daily tip widget only if it fits the app.
- Keep tips clear and non-alarmist.

### UI and interaction

- Improve layout polish.
- Improve animations.
- Implement or refine the app theme.
- Use Cowlsly shared colours.
- Add empty/loading/error states where needed.
- Add Account Centre link if the app uses Cowlsly account state.
- Add Simple Settings cog once available.
- Avoid duplicate general settings.
- Add accessibility labels.

### Assets and audio

- Inventory current assets.
- Search `cowlsly-web/assets` before adding new assets.
- Add icons/buttons for categories, random tip, copy, favourites, history, settings, and Account Centre if needed.
- Add pressed states.
- Add button sounds.
- Add warning sounds if needed.
- Add background music only if appropriate and document default volume.
- Record missing assets in `WHATS_NEEDED.md`.
- Record audio in `VOLUME.md`.

### Cleanup and safety

- Use `to-delete/` as the recycle bin.
- Do not remove source, docs, workflows, or assets without review.
- Move uncertain cleanup candidates to `to-delete/` with notes.

## Completion rule

Only mark a task complete in `GROKCHECKLIST.md` when this repo actually contains the finished work. Planned, partial, blocked, demo-only, or unverified work is not complete.
