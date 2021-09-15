# Logback filter example
This repo shows how to configure logback to eliminate "expected" exceptions from logs.

This is useful when you're writing unit tests for a library that throws + logs exceptions.

For instance, a test checks that an exception is thrown, and I don't want the test output to be contaminated with "false positive" error logs.
If the test would ever break for a correct reason, it would be hard to find the "true" error among all the "false positives".

## Usage
The project contains 2 logback configuration files:
1. ``main/resources/logback.xml`` -> "production" config. This works as you'd expect, the exception is present in the logs, along with the stacktrace.
2. ``test/resources/logback.xml`` -> "test" config. This excludes the specific "expected" error message from the logs. The other error messages are still present in the logs.
