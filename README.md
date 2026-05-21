# SLT_Gruppe_K

# Git Workflow & Konventionen

## Branch Naming Convention

Jede User Story bekommt einen eigenen Feature-Branch.

### Format

```bash
feature/<story-id>-<short-description>
```

### Beispiele

```bash
feature/us-01-place-symbol
feature/us-02-show-board
feature/us-03-game-result
feature/us-04-restart-game
```

---

## Commit Message Convention

Wir verwenden das **Conventional Commits** Format.

### Format

```bash
<type>(<scope>): <description>
```

### Beispiele

```bash
feat(board.txt): add move validation
feat(game.txt): implement winner detection
fix(board.txt): prevent overwriting occupied square
refactor(game.txt): simplify turn handling
test(game.txt): add unit tests for draw detection
docs(readme.md): add branch strategy documentation
ci(github-actions.yml): add maven build workflow
```

---

## Commit Types

| Type | Beschreibung |
|---|---|
| feat | Neue Funktion |
| fix | Fehlerbehebung |
| refactor | Code verbessern ohne neues Verhalten |
| test | Tests hinzufügen oder ändern |
| docs | Dokumentation |
| ci | CI/CD Änderungen |
| chore | Allgemeine Wartung |

---

# User Stories

| ID | User Story |
|---|---|
| US-01 | As a player, I want to be able to make a move by choosing an empty square, so that I can place my symbol on the board. |
| US-02 | As a player, I want to be able to see the current state of the game, so that I can keep track of the moves made by both myself and my opponent. |
| US-03 | As a player, I want to be notified when the game has ended in a win, loss or draw, so that I can see the result of the game. |
| US-04 | As a player, I want to be able to start a new game after the current game has ended, so that I can play again. |

---

# Projekt Workflow

## Repository Setup

- Public GitHub Repository erstellen
- GitHub Project erstellen
- Kanban Board anlegen
- User Stories ins Board übertragen
- Jede User Story bekommt eine eindeutige ID

---

## Development Workflow

### 1. Neue User Story starten

Branch erstellen:

```bash
git checkout main
git pull
git checkout -b feature/us-01-place-symbol
```

---

### 2. Arbeiten & Committen

Beispiel:

```bash
git add .
git commit -m "feat(board.txt): add player move logic"
```

---

### 3. Pushen

```bash
git push origin feature/us-01-place-symbol
```

---

### 4. Pull Request erstellen

- Pull Request gegen `main`
- CI/CD muss erfolgreich sein
- Danach mergen
