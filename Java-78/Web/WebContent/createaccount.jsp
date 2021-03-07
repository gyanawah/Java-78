<jsp:useBean id="acc" class="co.edureka.bindings.Account"></jsp:useBean>
<jsp:setProperty property="*" name="acc"></jsp:setProperty>
<h2>
A/C No: <jsp:getProperty property="acno" name="acc"/> <br>
Name: <jsp:getProperty property="name" name="acc"/> <br>
Balance: <jsp:getProperty property="bal" name="acc"/>
<hr>
<jsp:setProperty property="name" name="acc" value="Sunil Joseph"/>
Name: <jsp:getProperty property="name" name="acc"/> <br>
<!--  using EL -->
Name: ${acc.name}
</h2>