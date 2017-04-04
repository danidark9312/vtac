<%@page import="com.vtac.parameters.Parameters"%>
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
    <link href="css/common.css" rel="stylesheet">

    <!-- Custom Fonts -->
    
    <link href="css/fonts/awesomeFont.css" rel="stylesheet" type="text/css">
    <link href="css/drainClean.css" rel="stylesheet" type="text/css">
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    
    
    <link href='css/portfolio.css' rel='stylesheet' type='text/css'>
    
    
    
    
    <!-- Theme CSS -->
    <link href="css/agency.min.css" rel="stylesheet">
    
    <link href="css/timeline.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script async src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script async src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
	<style>
		img.img-circle.img-responsive{
		height: 156px;
		}
	
		.container.sideBorder p{
	    font-size: 20px;
	    
	    }
	    
	    .container.sideBorder{
	        border-left: solid gray;
	        border-right: solid gray;
	    }	
	    .reasonsList{
	    font-size: 20px;
    	
	    }
	    .reasonsList ul{
	    border-radius: 18px;
	    background-color: rgb(197, 191, 255);
	    }
	
	</style>


</head>

<body id="page-top" class="index">

<%@include file="include/freeEstimate.jsp" %> 

    <!-- Navigation -->
    
    <%@include file="navbar.jsp" %>

    <!-- Header -->
    

    
    
    <!-- About Section -->
 
    <section id="underpinning" class="bg-light-gray">
    
    <div class="row">
<!--     left news panel -->
		<div class="col-md-2" style="padding-left: 40px;">
			<div class="news">
			<div class="row">
			<div class="col-md-12">
					<img src="img/underpinning/crackedWall.jpg" style="width: 200px">
				</div>
			</div>
			<div class="row">
			<div class="col-md-12">
						<p>V.T.A.C has a process of repairing
								or re-strengthening an existing foundation of a building.
								Basement underpinning is usually referred to as a repair method
								but it is also advised by landscapers for prolonging the
								durability of a residential building. Homeowners planning to
								undertake basement underpinning should have a basic
								understanding of what it entails and its benefits</p>
						<a href="underpinning">More info</a>

					</div>
			</div>
				
				
			</div>
			<div class="news">
			<div class="row">
			<div class="col-md-12">
					<img src="img/underpinning/BasementwBenching.jpg" style="width: 200px">
				</div>
			</div>
			<div class="row">
					<div class="col-md-12">
						<p>Some time ago, basements weren't meant to be used for
							actual "living" space. They were used for storage of coal or
							timber to heat the home, and hundreds of jars of pickles to get
							you through the cold winter months of hibernation.</p>
						<p>That was then, this is now. And nowadays, the basement is
							one of the feature rooms in a new home, and something that buyers
							put a lot of stake into when making a purchase decision, and we can
							make it for you.
							</p>

					</div>
				</div>
				
				
			</div>
			
		</div>
		<!--     main information -->
		<div class="col-md-8">
			<div class="container sideBorder">
				<div class="row">
					
					<div class="col-lg-12 text-center">
						<h2 class="section-heading">Drain Cleaning</h2>
						<h3 class="section-subheading text-muted">Keep your drain and sewer clean</h3>
					</div>

					
						<div class="col-md-6">
							<p>Drains lines were designed to drain water, but water is not the only thing going down the drains.</p>
								<div class="reasonsList"><ul>
								<li>Food Residues</li>
								<li>Paper Products</li>
								<li>Grease</li>
								<li>Human Hair</li>
								<li>Soap Bar</li>
								<li>Tree Roots Intrusion</li>
								</ul>
							</div>
						

						</div>
						<div class="col-md-6 imageCenter">
							<img src="img/drainClean/clogged.png">
						</div>
					
				</div>

				<div class="row">
					<div class="col-md-6 imageCenter">
						<img src="img/drainClean/Sewer-Camera-Inspection1.png">
					</div>
					<div class="col-md-6">
						<p><b>That's why we are here, with a highly qualified team and cutting edge technology.</b></p>
						<p>We have a high definition snake camera recorder, designed to
							supervise and detect some problems or factors that may lead to a
							clogged drain, or detect the cause of a current clogged pipe.</p>
						<h3>
						<a href="contact.jsp">Click to get in contact! </a>
						</h3>
					</div>
				</div>

				<div class="row">
					<div class="col-lg-12 text-center">
						<h3 class="section-heading">Sewer Jetting</h3>
					</div>
				</div>
				
				
				<div class="row">
					<div class="col-md-6 imageCenter">
						<img src="img/drainClean/nuzzle.jpg">
					</div>
					<div class="col-md-6">
						<p>
							In <b>VTAC</b> we have high pressure water jetting, with
							HydroTechnology nuzzle, designed to unclogged the drain lines at
							any level, and with our highly prepared team we make the clearing
							simple, fast and at the best price
						</p>
						<h3>Call now!</h3>
						<h3><%=com.vtac.parameters.Parameters.telephone%></h3>

					</div>
				</div>
				
				
				<div class="row"></div>
			</div>
		</div>

		<!--     right news panel -->
    <div class="col-md-2">
    <div class="news showOnMovil">
			<div class="row">
			<div class="col-md-12">
					<img src="img/underpinning/cracked-foundation.jpg" style="width: 200px">
				</div>
			</div>
			<div class="row">
					<div class="col-md-12">
						<p>A home's foundation is as essential as it sounds. Without a
							proper foundation, a variety of structural issues can plague a
							home that could end up costing you scads of cash to repair. But
							how do you know if a house has foundation problems, and how hard
							are they to fix?</p>
							<h4>
							Call us now !
							</h4>
							<h3>
							<%=com.vtac.parameters.Parameters.telephone%>
							</h3>

					</div>
				</div>
				
				
			</div>
			
    <div class="news showOnMovil">
			<div class="row">
			<div class="col-md-12">
				<img src="img/emergencyPlumber.png" style="width: 100%">
			</div>
			</div>
			<div class="row">
					<div class="col-md-12">
							<h3>Need a hand now ?</h3>
							<h4>Plumbing and HVAC emergency available</h4>
							<h4>Call!</h4>
							<h2>301-277-6200</h2>
					</div>
				</div>
				
				
			</div>
    </div>
    </div>
    
        
    </section>
        <%@include file="footer.jsp"%>
    

    <!-- Portfolio Modal 4 -->
    <div class="portfolio-modal modal fade" id="portfolioModal4" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </div>

    
    <!-- jQuery -->
    
    <script async src="vendor/jquery/jquery.min.js"></script>
    <script async src="js/common.js"></script>
    
    

    <!-- Bootstrap Core JavaScript -->
    <script async src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script async src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script async src="js/jqBootstrapValidation.js"></script>

    <!-- Theme JavaScript -->
    <script async src="js/agency.min.js"></script>

</body>

</html>
