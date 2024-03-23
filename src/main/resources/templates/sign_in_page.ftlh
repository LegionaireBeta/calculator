<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
            overflow: hidden;
        }

        .container{
            display: flex;
            justify-content: center;
            align-items: center;
            width: 100vw;
            height: 100vh;
            background-color: #3D4141;
        }

        .sign_container{
            display: flex;
            flex-direction: column;
            align-items: start;
            padding: 1rem;
            background-color: #181818;
            border: 2px solid #4CAF50;
            border-radius: 10px;
            font-size: 1.25rem;
            color: white;
        }

        .sign_container form {
            display: flex;
            flex-direction: column;
            align-items: center;
            width: 100%;
        }

        .sign_container div{
            display: flex;
            flex-direction: column;
            margin-bottom: .75rem;
        }

        .sign_container div input {
            margin-top: .5rem;
            padding: .5rem;
            border-radius: 10px;
            font-size: 1.5rem;
            outline: none;
        }

        .sign_container .sbmtButton{
            width: 50%;
            margin-top: .5rem;
            padding: .5rem;
            font-size: 1.25rem;
            border-radius: 10px;
            outline: none;
            cursor: pointer;
            border: none;
            background-color: #4CAF50;
            color: white;
        }

    </style>
</head>
<body>
<div class="container">
    <div class="sign_container">
        <form action="/signIn" method="post">
            <div>
                <label>E-mail</label>
                <input type="email" name="email">
            </div>
            <div>
                <label>Password</label>
                <input type="password" name="password">
            </div>
            <input class="sbmtButton" type="submit" value="SIGN IN">
        </form>
    </div>
</div>
</body>
</html>