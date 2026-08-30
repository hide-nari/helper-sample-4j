# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this is

A small Java sample implementing FizzBuzz, built to demonstrate Java's pattern matching for `switch` over sealed-ish type hierarchies (`switch` on generic `T` with `case Integer value ->`, `case Double value ->`). Requires Java 25+ (see `pom.xml` compiler source/target).

## Commands

Build:
```
mvn clean package
```

Run tests:
```
mvn test
```

Run the jar:
```
java -jar target/helper-sample-4j-1.0.0.jar
```

## Architecture

- `HelperInterface<T>` — defines the default `fizzBuzz(T number)` method. Uses a `switch` pattern-matching over `Integer`/`Double`, delegating to a private `makeResultString(int)` that returns `"fizz"`/`"buzz"`/`"fizzbuzz"`/the number as a string. Any other type (including `String`, `Boolean`) throws `IllegalArgumentException`.
- `Helper<T>` — the base implementation; just implements `HelperInterface<T>` with no overrides.
- `HelperCustom<T>` — extends `Helper<T>` and overrides `fizzBuzz` to add the "divisible by 30 → uppercase" rule on top of the inherited result.
- `Main` — entry point (`Main-Class` in `pom.xml`/`MANIFEST.MF`), prints `fizzBuzz(i)` for `i` in `[0, 16)` using the base `Helper`.

Note the commented-out method overloads in `HelperInterface` and `HelperCustom` — these show an earlier, overload-based design (separate `fizzBuzz(int)`, `fizzBuzz(double)`, `fizzBuzz(String)`, `fizzBuzz(boolean)` methods) that was replaced by the current single generic method with a type-switch. Leave them as-is unless asked to clean up.

## Tests

Tests are JUnit 5 (`junit-jupiter` 6.1.0-M1), using `@ParameterizedTest` + `@CsvFileSource` against fixture CSVs in `src/test/resources/`:

- `fizzBuzz*ListsCommon.csv` — cases shared between `HelperTest` and `HelperCustomTest` (behavior unchanged by the "divisible by 30" rule).
- `fizzBuzz*ListsOrigin.csv` — cases specific to the base `Helper` (used only by `HelperTest`).
- `fizzBuzz*ListsCustom.csv` — cases specific to `HelperCustom`, i.e. covering the divisible-by-30 uppercase behavior.

There's an Int and a Double variant of each. When adding a new FizzBuzz case that applies to both `Helper` and `HelperCustom`, add it to the `Common` CSVs; if it only exercises the divisible-by-30 override, add it to the `Custom` CSVs instead.

`HelperCustomTest`'s error-case nested class currently constructs a plain `Helper` (not `HelperCustom`) — this looks like a copy-paste artifact from `HelperTest`, not an intentional design decision.
