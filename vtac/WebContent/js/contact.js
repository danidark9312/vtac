function sendEmail(){
	var link = "mailto:danielgm9312@hotmail.com"
        + "?"
        + "subject=" + escape("This is my subject")
        + "&body=" + escape(document.getElementById('message').value)
window.location.href = link;	
}