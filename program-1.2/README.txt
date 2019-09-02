a semi-MVC program.
problem: there is a reference inside Toolbar for TextPanel.

ALGORITHM (IN ORDER)
-------------------------------
-- in class "Toolbar" --

addActionListener(s);
actionPerformed {
textPanel.appendText();
}
-------------------------------
that means, we need an object reference of TextPanel within Toolbar.
.
.
.
