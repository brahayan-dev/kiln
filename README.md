# Kiln

Scala project to study data structures and algorithms.

Scala 3 playground. Each data structure and algorithm lives in its own file
under `src/main/scala/kiln/`, with a matching `*Suite.scala` test in the same
package under `src/test/scala/`.

## Run

```sh
sbt test
```

## Layout

Packages are singular, full-word, no `org.` prefix. One public type per file.

```
src/main/scala/kiln/
├── list/      stack/    queue/    tree/
├── heap/      graph/    sorting/  searching/
├── recursion/ dynamic/  math/     util/

src/test/scala/kiln/   (mirrors the tree above)
```
