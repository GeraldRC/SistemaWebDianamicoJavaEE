<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>

<body>


    <select name="cliente" id="cliente">
        <option value="volvo">Volvo</option>
        <option value="saab">Saab</option>
        <option value="mercedes">Mercedes</option>
        <option value="audi">Audi</option>
      </select>


    <form action="" method="post">


        <table>

            <tr>

                <th>id</th>

                <th></th>

                <th>NO CUMPLE</th>

                <th>CUMPLE</th>

                <th>NO APLICA</th>

            </tr>
            <c:forEach items="${cheklist}" var="list">

                <tr>

                    <td>${list.getId()}</td>
                    <td>${list.getChek()}</td>
                    <td><input type="radio" name="${list.getId()}" value="1" ></td>
                    <td><input type="radio" name="${list.getId()}" value="2" ></td>
                    <td><input type="radio" name="${list.getId()}" value="3" ></td>
    
    
                </tr>

            </c:forEach>

        </table>

        <input type="submit" name="enviar" value="Enviar" />

    </form>




  

</body>

</html>