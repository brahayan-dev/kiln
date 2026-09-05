# Kiln

Scala project to study data structures and algorithms.

Scala 3 playground. Each data structure and algorithm lives in its own file
under `src/main/scala/kiln/`, with a matching `*Suite.scala` test in the same
package under `src/test/scala/`.

## Run

```sh
# run tests
sbt test

# run formatter
sbt scalafmtAll
```

## Layout

```
src/main/scala/kiln/
├── list/ math/

src/test/scala/kiln/   (mirrors the tree above)
```
