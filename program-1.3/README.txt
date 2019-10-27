interfaces enable us to use any method of "class X" in "class Y"
via overridable methods which you can create in it.
those methods are "mimic", per se.
"method INT." has to be formally similar to "method X".
"method INT." doesn't have body (definition) within the interface. it gets it in MainFrame.
---------------------------------------------------------------------------------------
RESULT
for each method;
we need to create an interface with a similar method in it (which is gonna be overridden).
---------------------------------------------------------------------------------------
purpose: to use "appendText" method in "Toolbar"

1. we need to use something else (interface object) instead of textPanel within actionPerformed.
so we create an interface (StringListener), and its object inside Toolbar.

2. we need to use appendText.
so we create a similar (to appendText) method (also overridable) inside StringListener
and define it in MainFrame.
