
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
    <title> Customer Confirmation </title>
    <style>
        .error{color:red}
    </style>
</head>
<body>
<br>
Customer Detail: ${customer.firstName} ${customer.lastName}
<br>
Postal Code : ${customer.postalCode}
<br>
Free Passes: ${customer.freePasses}
<br>
Course Code: ${customer.courseCode}

</body>

</html>