UnicodeNumbers
========================================================
Unicode Numbers formatters/converters.

Note! Some characters might be bigger or smaller depending on the used font.

PositiveCircleFormatter
------------------------------
Numbers that has single-character equivalent: 0-50.

```java
PositiveCircleFormatter formatter = new PositiveCircleFormatter();
System.out.println(formatter.format(21)); // output: ㉑
```

NegativeCircleFomatter
------------------------------
Numbers that has single-character equivalent: 1-20.

```java
NegativeCircleFomatter fullFormatter = new NegativeCircleFomatter();
System.out.println(fullFormatter.format(1)); // output: ➊
```

ParenthesizedFomatter
------------------------------
Numbers that has single-character equivalent: 1-20.

```java
ParenthesizedFomatter bracketFormatter = new ParenthesizedFomatter();
System.out.println(bracketFormatter.format(1)); // output: ⑴
```

Copyright
========================================================
The MIT License (MIT)
------------------------------
Copyright (c) 2016 Maciej Nux Jaros

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
