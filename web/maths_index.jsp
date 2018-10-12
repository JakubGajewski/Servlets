<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>maths index</h1>
<h3>addition</h3>

<form action="/maths" method="POST">
    <input type="radio" name="action" value="addition" checked="checked">Random addition<br>
    <input type="radio" name="action" value="subtraction">Random subtraction<br>
    Number: <input type="number" name="number" required step="0.01"><br>
    <button type="submit">OK</button>
</form>

<p></p>
<p>For number ${number} and action ${action} the result is: ${result}</p>

</body>
</html>