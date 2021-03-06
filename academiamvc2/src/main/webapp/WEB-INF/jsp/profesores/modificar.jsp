<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 	prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Modificar Profesor</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.Incluir mi codigo -->
<div class="row">
<div class="col-lg-12">
  <div class="panel panel-default">
            <div class="panel-heading">
                Formulario de Modificacion
            </div>
            <div class="panel-body">
            
                <div class="row">
                    <div class="col-lg-6">
                    	<form:form action="./modificar.html" method="post" modelAttribute="formulario">
                        <form:hidden path="id" />
                        <spring:hasBindErrors name="*"> HAY ERRORRES QUE RESOLVER</spring:hasBindErrors>
                            <div class="form-group">
                                <label>NIF</label>
                                <form:input path="nif" class="form-control"/>
                                <form:errors path="nif" element="div" cssClass="alert alert-danger"/>
                                <p class="help-block"></p>
                            </div>
                            <div class="form-group">
                                <label><spring:message code="profesor.nombre"/></label>
                                <form:input path="nombre" class="form-control"/>
                                <form:errors path="nombre" element="div" cssClass="alert alert-danger"/>
                                <p class="help-block"></p>
                            </div>
                            <div class="form-group">
                                <label><spring:message code="profesor.apellido1"/> </label>
                                <form:input path="apellido1" class="form-control"/>
                                <form:errors path="apellido1" element="div" cssClass="alert alert-danger"/>
                                <p class="help-block"></p>
                            </div>
                            <div class="form-group">
                                <label><spring:message code="profesor.apellido2"/></label>
                                 <form:input path="apellido2" class="form-control"/>
                                <form:errors path="apellido2" element="div" cssClass="alert alert-danger"/>
                                <p class="help-block"></p>
                            </div>
                            <div class="form-group">
                                <label>Telefono</label>
                                 <form:input path="telefono" class="form-control"/>
                                <form:errors path="telefono" element="div" cssClass="alert alert-danger"/>
                                <p class="help-block"></p>
                            </div>
                            <div class="form-group">
                                <label>Correo</label>
                                 <form:input path="correo" class="form-control"/>
                                 <form:errors path="correo" element="div" cssClass="alert alert-danger"/>
                                <p class="help-block"></p>
                            </div>
                            <div class="form-group">
                                <label>Titulación</label>
                                 <form:input path="titulacion" class="form-control"/>
                                 <form:errors path="titulacion" element="div" cssClass="alert alert-danger"/>
                                <p class="help-block"></p>
                            </div>
                            <button type="submit" class="btn btn-default">Enviar</button>
                            <button type="reset" class="btn btn-default">Limpiar</button>
                        </form:form>
                    </div>
                   
                </div>
                <!-- /.row (nested) -->
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->

</div>


</div>