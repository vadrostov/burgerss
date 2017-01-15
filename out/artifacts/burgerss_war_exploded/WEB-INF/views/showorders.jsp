<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: vad
  Date: 15.01.2017
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .prokrutka {
            height: 480px; /* высота нашего блока */
            width: 415px; /* ширина нашего блока */
            background: #fff; /* цвет фона, белый */
            border: 0px solid #C1C1C1; /* размер и цвет границы блока */

            overflow-y: scroll; /* прокрутка по вертикали */
        }

        .button {
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }

        .button1 {
            background-color: white;
            color: black;
            border: 2px solid #4CAF50;
        }
    </style>
    <meta charset="utf-8">
    <title>Документ без названия</title>
</head>


<body bgcolor=#000000>
<header><img src="http://i.imgur.com/iNRugon.png" width="1200" height="244" alt=""/></header>
<table align="left" valign="top" width="1200" border="0" cellspacing="0">
    <tbody>
    <tr>
        <td bgcolor="#000000"><table align="left" valign="top"  width="770" height="1000" border="0" cellspacing="0">
            <tbody>
            <tr>
                <td bgcolor="#000000" align="center" valign="top" width="769" height="92"><table width="769" border="0" cellspacing="0">
                    <tbody><span style="color: #f0ffff; "/>
                    <tr>
                        <td bgcolor="#043214" width="255" height="92">
                            <a href="${pageContext.request.contextPath}/menu/burger"><img src="http://i.imgur.com/nQra2Fa.png"  width="255" height="92"  alt=""/></a></td>
                        <td   width="255" height="92"><a href="${pageContext.request.contextPath}/menu/potato"><img src="http://i.imgur.com/2UcingV.png"  width="255" height="92"  alt=""/></a></td>
                        <td  width="255" height="92"><a href="${pageContext.request.contextPath}/menu/drinks"><img src="http://i.imgur.com/zIQTn0r.png"  width="255" height="92"    alt=""/></a></td>
                    </tr>
                    </tbody>
                </table></td>
            </tr>
            <tr align="center" valign="top">
                <td bgcolor="#000000"  ><table width="760" border="0" cellspacing="0" align="center" valign="top">
                    <tbody>
                    <span style="color: #f0ffff; "/>
                    <c:forEach items="${orderlist}" var="order">
                        <table width="550" border="0" cellspacing="0" align="left" valign="top">
                            <tbody>
                            <span style="color: #f0ffff; "/><td>${order.date}</td><td>${order.name} </td> <td><a href="/admin/orders/${order.id}">Изменить</a></td>

                            </tbody></table>
                    </c:forEach>


                    </tbody>
                </table></td>
            </tr>
            </tbody>
        </table>
        </td>
        <td align="left" valign="top" bgcolor="#000000  "><table width="424" border="0" cellspacing="0">
            <tbody>
            <tr>
                <td bgcolor="#000000"><img src="http://i.imgur.com/JFI22EC.png" width="415" height="102" alt=""/></td>
            </tr>
            <tr>




                <td bgcolor="#000000"><div class="prokrutka"> <c:forEach items="${bgorder.list}" var="orderlists">

                    <c:out value="${orderlists.name}  -  ${orderlists.cost}"/> </br>


                </c:forEach></div></td>
            </tr>
            <tr>
                <td bgcolor="#FFFFFF">Итого: ${bgorder.price} </td>
            </tr>
            <tr>
                <td bgcolor="#000000"><a href="${pageContext.request.contextPath}/order_done"><img src="http://i.imgur.com/JFI22EC.png" width="415" height="102" alt=""/></a>     </td>
            </tr>
            </tbody>
        </table>
        </td>
    </tr>
    </tbody>
</table>
<footer><table width="1200" border="0" align="left" cellspacing="0">
    <tbody>
    <tr>
        <td width="400" align="center">(c)</td>
        <td width="400" align="center">Login</td>
        <td align="center">Registration</td>
    </tr>
    </tbody>
</table>
</footer>
</body>

</html>

