<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>V.T.A.C</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="css/fonts/awesomeFont.css" rel="stylesheet" type="text/css">
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    <link href='css/portfolio.css' rel='stylesheet' type='text/css'>
    
    <style>
    
    .aditionalInfo {
	padding: 0px 54px;
    margin: 30px auto;
    border-left: solid;
    border-right: solid;
    width: 280px;
}
/* @media (min-width : 720px){   
.aditionalInfo {
	margin: 30px 35% 0;
}
}*/

</style>
    
    
    <!-- Theme CSS -->
    <link href="css/agency.min.css" rel="stylesheet">
    
    <link href="css/timeline.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script async src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script async src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <script>
    var context = "<%=request.getContextPath()%>"; 
    </script>
    
    
	<style>
		img.img-circle.img-responsive{
		height: 156px;
		}
	</style>


</head>

<body id="page-top" class="index">

    <!-- Navigation -->
    
    <%@include file="navbar.jsp" %>

    <!-- Header -->
    
 
    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Contact Us</h2>
				<h3 class="section-subheading text-muted">We would love to hear
					from you! Please fill out this form to contact us and we will get
					in touch with you shortly</h3>
			</div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <form name="sentMessage" id="contactForm" novalidate>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Your Name *" id="name" required data-validation-required-message="Please enter your name.">
                                    <p class="help-block text-danger"></p>
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control" placeholder="Your Email *" id="email" required data-validation-required-message="Please enter your email address.">
                                    <p class="help-block text-danger"></p>
                                </div>
                                <div class="form-group">
                                    <input type="tel" class="form-control" placeholder="Your Phone *" id="phone" required data-validation-required-message="Please enter your phone number.">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <textarea class="form-control" placeholder="Your Message *" id="message" required data-validation-required-message="Please enter a message."></textarea>
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                            <div class="col-lg-12 text-center">
                                <div id="success"></div>
                                <button type="submit" class="btn btn-xl" onsubmit="sendEmail()">Send Message</button>
                            </div>
                        </div>

					<div class="aditionalInfo text-muted">
						<p>
						  <strong>Address:</strong><br> 4404 Baltimore Avenue<br> Bladensburg, MD, 20710
						</p>
						<p>
							<strong>Telephone:</strong> 301-277-9200<br>
						</p>
					</div>

				</form>
                </div>
            </div>
        </div>
    </section>

    
        <%@include file="footer.jsp"%>
    

    <!-- jQuery -->
    <script async src="vendor/jquery/jquery.min.js"></script>
    
    
    <script async src="js/about.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script async src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script async src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script async src="js/jqBootstrapValidation.js"></script>
    <script async src="js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script async src="js/agency.min.js"></script>

</body>

</html>
