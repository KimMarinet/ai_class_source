<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/member/join" />

<h1>회원가입</h1>

<spring:message code="LOGIN_MSG" arguments="사용자01,user01@test.org" />

<spring:message code="LOGIN_MSG">
    <spring:argument value="사용자01" />
    <spring:argument value="user01@test.org" />
</spring:message>

<form:form action="${action}" modelAttribute="requestJoin">
    <dl>
        <dt>
            <spring:message code="email" />
        </dt>
        <dd>
            <form:input path="email" />
            <form:errors path="email" element="div" delimeter=""/>
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="password" />
        </dt>
        <dd>
            <form:password path="password" />
            <form:errors path="password" element="div" delimeter=""/>
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="confirmPassword" />
        </dt>
        <dd>
            <form:password path="confirmPassword" />
            <form:errors path="confirmPassword" element="div" delimeter=""/>
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="name" />
        </dt>
        <dd>
            <form:input path="name" />
            <form:errors path="name" element="div" delimeter=""/>
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="mobile" />
        </dt>
        <dd>
            <form:input path="mobile" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="termsAgree" />
        </dt>
        <dd>
            <form:checkbox path="agree" label="회원가입 약관에 동의합니다." value="true" />
            <form:errors path="agree" element = "div" delimeter = "" />
        </dd>
    </dl>
    <button type="submit">가입하기</button>
</form:form>