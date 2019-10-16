a semi-MVC program.
problem: there is a reference to TextPanel in Toolbar.

ALGORITHM (IN ORDER)
-------------------------------
-- inside class "Toolbar" --

addActionListener(s);
actionPerformed {
textPanel.appendText();
}
-------------------------------
that means, we need an object reference to "TextPanel" in the class "Toolbar".
.
.
.
