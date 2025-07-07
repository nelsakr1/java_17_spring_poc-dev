<%@page import="com.nrs.portal.tjx.crossdock.constants.ControllerConstants"%>
<%@page import="com.nrs.portal.tjx.crossdock.constants.RequestParamConstants"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<script
        src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous">
</script>
<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" media="screen" />
<link href="${pageContext.request.contextPath}/static/css/jquery-ui.theme.css" rel="stylesheet" type="text/css" media="screen" />
<link href="${pageContext.request.contextPath}/static/css/jquery-ui.structure.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/javascript/jquery-ui.js"></script>

<%
    String message = null;
    Object obj = request.getAttribute(RequestParamConstants.ADMIN_MESSAGE);
    if (obj != null) {
        message = (String) obj;
    }

    String action = request.getContextPath() + ControllerConstants.ACT_AS + ControllerConstants.EXTENSION;

    if(message != null){
%>
<div id="message" class="alert alert-success">
    <%=request.getAttribute(RequestParamConstants.ADMIN_MESSAGE)%>
</div>
<%
    }
%>


<div class="even">
    <div id="actas"></div>
</div>


<div class="odd">
    <label><input type="radio" id="FirstNameRadioButton" name="processByFirstName" value="firstName"> User's First Name &nbsp; &nbsp;</label>
    <input class="form-control" id="FirstName" onkeydown="selectRadioButton(this);"
           type="text" name="FirstName" size="40" onkeypress="selectRadioButton(this);" />

</div>

<div class="odd" style="margin-top: 15px;">
    <label><input type="radio" id="UsernameRadioButton" name="processByFirstName" value="userName"> Username</label>
    <input class="form-control" id="Username" onkeydown="selectRadioButton(this);"
           type="text" name="Username" size="40" onkeypress="selectRadioButton(this);" />

</div>


<div class="even" style="margin-top: 15px;">
    <label>&nbsp;</label>
    <div>
        <input id="_csrf" type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <input class="btn btn-primary" id="ActAsUser"
               type="submit" name="ActAsUser" value="Act as this User" /> </div>

</div>



<%
    String url = ControllerConstants.ACT_AS + ControllerConstants.EXTENSION;
%>

<c:url value="<%= url %>" var="actUrl"/>

<script type="text/javascript">


    function selectRadioButton(object){
        if(object.name == 'FirstName'){
            var radioObject = document.getElementById('FirstNameRadioButton');
            radioObject.checked = true;
            //document.getElementById('Username').disabled = true;
            $("#Username").val("");
        }else if(object.name == 'Username'){
            var radioObject = document.getElementById('UsernameRadioButton');
            radioObject.checked = true;
            $("#FirstName").val("");
            //document.getElementById('FirstName').disabled = true;
        }
    }

    function split(val) {
        return val.split(/,\s*/);
    }
    function extractLast(term) {
        return split(term).pop();
    }

    $(document).ready(function() {

        $( "#FirstName" ).autocomplete({
            source: '${pageContext.request.contextPath}/get_firstname_list'
        });

    });



    $("#ActAsUser").click(function() {
        $("#actas").text('Please wait!!!');
        $("#message").replaceWith('<div id="message"></div>');
        // Call a URL and pass two arguments
        // Also pass a call back function
        // See http://api.jquery.com/jQuery.post/
        // See http://api.jquery.com/jQuery.ajax/
        // You might find a warning in Firefox: Warning: Unexpected token in attribute selector: '!'
        // See http://bugs.jquery.com/ticket/7535
        $.post("${actUrl}",
            { 	_csrf:  $("#_csrf").val(),
                FirstName:  $("#FirstName").val(),
                Username:  $("#Username").val() },
            function(data){
                // data contains the result
                // Assign result to the sum id
                $("#actas").replaceWith('<div id="actas" class="alert alert-success"> <span class="glyphicon glyphicon-info-sign"></span>&nbsp; &nbsp;  '+ data + '</div>');
                $("#actasoccarrier").hide().html(data).fadeIn('fast');
            });
    });


</script>