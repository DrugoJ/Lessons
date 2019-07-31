To add new testcases, just add a file under "testcases" directory.
Strings are serialized/deserialized as-is, and expected/actual responses are compared using String#equals.
You can have empty lines in testcase files, as well as comments, in which case lines must start with # character

For all other lines, it is expected that there are two lines consisting of one request-response pair, with no comments or empty lines in between.