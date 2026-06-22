# GROKTOOLS.md

Cowlsly GitHub tool map for Grok and future repo agents.

Last updated: 2026-06-22
Owner: Shane / Cowy
Scope: Cowlsly GitHub repositories only, unless Shane/Cowy explicitly expands the task.

## First instruction for every Grok run

Before doing any repo work, read this file first.

Then read the repo guidance files if they exist:

- README.md
- TODO.md
- ROADMAP.md
- GROKAIWORK.md
- GROKCHECKLIST.md
- WHATS_NEEDED.md
- CLEANUP.md
- GROK_SCHEDULE_STATE.md

This file exists so Grok does not forget that he has tools. Use the tools. Do not merely tell Shane/Cowy what to do if the task can be performed with the available GitHub, shell, build, test, or repo tools.

## Owner permission

Shane/Cowy gives Grok permission to use the available GitHub tools on Cowlsly repositories to inspect, edit, repair, validate, commit, and report real work.

This permission includes meaningful implementation work, risky work when needed, direct commits to the default branch, workflow inspection, build/test repair, file cleanup, and repo maintenance.

This permission does not include leaking secrets, exposing private credentials, damaging accounts, deleting important files without a clear reason, changing billing/payment/security settings without explicit instruction, or claiming work is complete when it is not.

Risk is allowed. Recklessness is not.

## Default operating rule

- No branches unless Shane/Cowy explicitly asks.
- No pull requests unless Shane/Cowy explicitly asks.
- Work directly on the default branch for small focused changes.
- Every change must be small, understandable, reversible, and reported with a restore point SHA.
- If a job is too large, split it into one small useful task per run.

## Runtime discovery

At the start of a session, discover what tools are actually available in the environment.

Useful discovery commands:

```bash
gh --version
gh help
gh auth status
gh repo view --json nameWithOwner,defaultBranchRef,visibility,description
which git || true
which gh || true
which npm || true
which node || true
which python || true
which gradle || true
which ./gradlew || true
```

If a specific command is unavailable, use another available tool: GitHub connector, GitHub CLI, git, REST API through `gh api`, local shell, or manual file inspection.

## GitHub CLI tools Grok should remember

GitHub CLI is available as `gh` in many agent and Codespaces environments. It can authenticate using `gh auth login`, existing credentials, or `GITHUB_TOKEN`/enterprise tokens when configured.

Important command families:

### Repo tools

Use these to inspect and manage repositories.

```bash
gh repo view
gh repo list
gh repo clone
gh repo read-file
gh repo read-dir
gh repo sync
gh repo edit
gh repo rename
gh repo archive
gh repo unarchive
```

Owner rule: do not rename, archive, unarchive, transfer, or delete repos unless Shane/Cowy explicitly asks.

### File and code search tools

Use these before editing so the change is based on real repo state.

```bash
gh search code
gh search commits
gh search issues
gh search prs
gh search repos
rg "search text" .
grep -R "search text" .
find . -maxdepth 3 -type f
```

### Issue tools

Use these to inspect, create, update, comment on, and close issues when useful.

```bash
gh issue list
gh issue view
gh issue create
gh issue edit
gh issue comment
gh issue close
gh issue reopen
gh issue status
```

### Pull request tools

Use PR tools for inspection, diff reading, and repair context. Do not create PRs unless Shane/Cowy explicitly asks.

```bash
gh pr list
gh pr view
gh pr diff
gh pr checks
gh pr status
gh pr comment
gh pr review
gh pr close
gh pr reopen
gh pr revert
```

Owner rule: no PR creation by default. No branch creation by default.

### GitHub Actions and workflow tools

Use these to inspect CI, builds, failed runs, logs, and artifacts.

```bash
gh workflow list
gh workflow view
gh workflow run
gh workflow enable
gh workflow disable
gh run list
gh run view
gh run watch
gh run rerun
gh run cancel
gh run download
gh run delete
```

Owner rule: workflow disable/delete/cancel/rerun is allowed only when it clearly helps the task and is reported. Do not disable important automation casually.

### Release tools

Use these for releases and release assets when asked or when the repo’s task clearly requires it.

```bash
gh release list
gh release view
gh release create
gh release edit
gh release upload
gh release download
gh release verify
gh release delete
gh release delete-asset
```

Owner rule: do not publish production releases unless the task explicitly asks for release work.

### Secret and variable tools

Use extreme care.

```bash
gh secret list
gh secret set
gh secret delete
gh variable list
gh variable get
gh variable set
gh variable delete
```

Owner rule: never print secret values. Do not delete or replace secrets unless Shane/Cowy explicitly asks. If a secret appears exposed, stop and report the suspected exposure.

### API tool

Use `gh api` when there is no direct CLI command.

Examples:

```bash
gh api repos/:owner/:repo
gh api repos/:owner/:repo/contents/PATH
gh api repos/:owner/:repo/commits
gh api repos/:owner/:repo/actions/runs
gh api repos/:owner/:repo/actions/runs/RUN_ID/jobs
gh api repos/:owner/:repo/actions/jobs/JOB_ID/logs
gh api repos/:owner/:repo/code-scanning/alerts
gh api repos/:owner/:repo/dependabot/alerts
gh api repos/:owner/:repo/secret-scanning/alerts
```

Use API reads freely for inspection. Use API writes only when they are safer than local edits and the task requires it.

### Codespaces tools

If Codespaces tools are available, they can help inspect, run, and validate projects.

```bash
gh codespace list
gh codespace view
gh codespace logs
gh codespace ssh
gh codespace ports
gh codespace ports forward
gh codespace rebuild
gh codespace stop
```

Owner rule: do not delete Codespaces unless Shane/Cowy explicitly asks.

## Git tools Grok should remember

Use normal git tools for local repo work.

```bash
git status
git branch --show-current
git log --oneline -n 10
git show --stat HEAD
git diff
git diff --stat
git ls-files
git grep "search text"
git add PATH
git restore PATH
git commit -m "type: short real change"
git push
```

Before editing, record:

```bash
git rev-parse HEAD
```

That SHA is the restore point.

No branch creation unless Shane/Cowy explicitly asks.

## Validation tools Grok should try

Use the best lightweight validation available for the repo.

Common checks:

```bash
npm install
npm test
npm run build
npm run lint
node --check file.js
python -m py_compile file.py
python -m json.tool file.json
./gradlew test
./gradlew build
gradle test
gradle build
shellcheck script.sh
markdownlint "**/*.md"
```

If no command exists, do manual inspection and say so honestly.

## GitHub connector style tools Grok may have

If Grok has a GitHub connector or app tools, he should look for functions equivalent to:

- search installed repositories
- get repository metadata
- search files/code in a repo
- fetch file contents
- create file
- update file
- delete file
- search commits
- fetch commit and diff
- compare commits
- get commit status/checks
- search issues
- fetch issue and comments
- create/update/comment/close issues
- search pull requests
- fetch PR metadata
- fetch PR diff/patch
- list changed PR files
- fetch PR comments/reviews
- inspect workflow runs
- inspect workflow jobs and logs
- download workflow artifacts

Use these connector tools when they are safer or more direct than shell commands.

## Real-work rule

A valid Grok run must do real work. Examples:

- repair broken code
- fix a broken link or route
- improve UI behavior
- fix workflow/build/test issues
- add a small missing feature requested in project docs
- remove clear duplication
- improve validation scripts
- add useful tests
- clarify docs that are blocking development

Low-value work is forbidden by itself:

- timestamp-only edits
- rotation-only logs
- checklist-only commits
- repeated maintenance notes
- claiming a feature is complete when only docs changed

## Safety rules

Never expose, print, commit, or copy secrets.

Never touch these unless Shane/Cowy explicitly asks:

- passwords
- API keys
- tokens
- signing keys
- production payment settings
- production auth settings
- DNS ownership settings
- billing settings
- repo deletion/transfer/archive settings

If risky work is required, do it in the smallest safe step and keep a restore point.

## Required final report

Every run must end with this report:

```text
Repo:
Default branch:
Restore point SHA:
Task chosen:
Why this task:
Tools used:
Files changed:
Validation/check run:
Result:
New commit SHA:
Central state updated:
Rollback note:
Next target repo:
Next recommended task:
Blocked items:
```

## Official references

- GitHub CLI manual: https://cli.github.com/manual/
- GitHub REST API documentation: https://docs.github.com/en/rest
- GitHub Actions documentation: https://docs.github.com/en/actions

Use the current installed tool help as the source of truth at runtime, because the actual tool set can vary by environment.
