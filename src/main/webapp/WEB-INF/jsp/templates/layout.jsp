
<%--
  Created by IntelliJ IDEA.
  User: jaehoo
  Date: 19/11/12
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/jsp/common/include.jsp"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        <tiles:insertAttribute name="title"/>
    </title>
</head>
<body>


    <div id="block-header" style="width: 100%; background-color: #5CB323; border-style: solid; border-width: 1px; border-color: #5CBF23; color: #FFFFFF;" align="center">
        <tiles:insertAttribute name="header"/>
    </div>


    <div id="block-body" style="width: 74%; background-color: #FFFFFF; border-style: solid; padding: 2px;  color: #000000;" align="justify">
        <tiles:insertAttribute name="body"/>
    </div>


    <div id="block-footer" style="width: 100%; background-color: #5CB323; border-style: solid; border-width: 1px; border-color: #5CBF23; color: #FFFFFF;" align="center">
        <tiles:insertAttribute name="footer"/>
    </div>

</body>
</html>