<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            overflow:hidden
        }

        .container{
            width: 100vw;
            height: 100vh;
            background-color: #3D4141;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .calculator{
            padding: 20px;
            background-color: #181818;
            border: 2px solid #4CAF50;
            border-radius: 10px;
        }

        .calculator form input{
            margin: 10px;
            border: 0;
            outline: 0;
            width: 60px;
            height: 60px;
            background: transparent;
            border-radius: 10px;
            box-shadow: -8px -8px 15px rgba(255, 255, 255, 0.1), 5px 5px 15px rgba(0, 0, 0, 0.2);
            font-size: 20px;
            color: #fff;
            cursor: pointer;
        }

        form .display{
            display: flex;
            justify-content: flex-end;
            margin: 20px 0;
        }

        form .display input{
            text-align: right;
            flex: 1;
            font-size: 45px;
            box-shadow: none;
            cursor:default;
        }

        form input.equal{
            width: 300px;
        }
    </style>


</head>
<body>
<div class="container">
    <h1>${userName}</h1>
    <div class="calculator">
        <form action="/calculate" method="post">
            <input type="hidden" name="userId" value="${userId}">
            <div class="display">
                <input type="text" name="operation" value="${opera}">
            </div>
            <div>
                <input type="button" value="AC" onclick="operation.value = ''">
                <input type="button" value="DE" onclick="operation.value = operation.value.toString().slice(0, -1)">
                <input type="button" value="^2" onclick="operation.value += ' ^ '">
                <input type="button" value="sqrt" onclick="operation.value += '√ '">
            </div>
            <div>
                <input type="button" value="7" onclick="operation.value += '7'">
                <input type="button" value="8" onclick="operation.value += '8'">
                <input type="button" value="9" onclick="operation.value += '9'">
                <input type="button" value="/" onclick="operation.value += ' / '">
            </div>
            <div>
                <input type="button" value="4" onclick="operation.value += '4'">
                <input type="button" value="5" onclick="operation.value += '5'">
                <input type="button" value="6" onclick="operation.value += '6'">
                <input type="button" value="*" onclick="operation.value += ' * '">
            </div>
            <div>
                <input type="button" value="1" onclick="operation.value += '1'">
                <input type="button" value="2" onclick="operation.value += '2'">
                <input type="button" value="3" onclick="operation.value += '3'">
                <input type="button" value="-" onclick="operation.value += ' - '">
            </div>
            <div>
                <input type="button" value="00" onclick="operation.value += '00'">
                <input type="button" value="0" onclick="operation.value += '0'">
                <input type="button" value="." onclick="operation.value += '.'">
                <input type="button" value="+" onclick="operation.value += ' + '">
            </div>
            <div>
                <input type="submit" value="=" class="equal">
            </div>
        </form>
    </div>
</div>
</body>
</html>

