<html>
<head>
<style>
    
.dropbtn {
    background-color: lightsteelblue;
    color: lightgoldenrodyellow;
    padding: 10px;
    font-size: 20px;
    border: 10%;
    cursor: pointer;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    left: 0;
    position: relative;
    background-color: lightblue;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: inline-block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}    

input[type=text]:focus 

{
    border: 3px solid #555;
}
    
input[type=text], select {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 8px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 80%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 5px;
}

.tooltip 

{
    position: relative;
    display: inline-block;
 
}

.tooltip .tooltiptext 

{
    visibility: hidden;
    width: 300px;
    background-color: lightgreen;
    color: #fff;
    text-align: center;
    border-radius: 1px;
    padding: 10px 5px;

    /* Position the tooltip */
    //position: absolute;
   // z-index: 1;
}

.tooltip:hover .tooltiptext

{
    visibility: visible;
}

select 

{
    width: 30%;
    padding: 16px 20px;
    border: none;
    border-radius: 4px;
    background-color: #f1f1f1;
}
</style>
<script type="text/javascript">

function checkWholeForm(theForm)
{
var why = "";

why += checkname(theForm.username, "user name");
why += checkPassword(theForm.password);
if ( theForm.password.value != theForm.password2.value )
{
why += "The two passwords do not match. Please enter the same password twice.\n";
}
why += checkname(theForm.firstname, "first name");
why += checkname(theForm.lastname, "last name");
why += checkEmail(theForm.email);
why += checkPhone(theForm.phno);
why += checkDate(theForm.dt);

if (why != "")
{
alert(why);
return false;
}
return true;
}

function checkname(fld, name)
{
var val = fld.value;
if ( val.length < 3 || val.length > 10 )
{
fld.focus();
return "You must enter a " + name + " minimum 3 characters long.\n";
}

return "";
}

function checkPassword(fld)
{
var val = fld.value;
if ( val.length < 4 || val.length > 10 )
{
fld.focus();
return "You must enter a password that is atleast 5 characters long.\n";
}

return "";
}
function checkDate(fld)
{
   var re =/^\d{1,2}\/\d{1,2}\/\d{4}$/;


if ( fld.value != '' && !fld.value.match(re)  )
{
fld.focus();
return "Invalid Date format it should be dd/mm/yyyy.\n";
}

return "";
}

function checkEmail(fld)
{
var val = fld.value;
//relational algebra standard for checking the emails
var emailFilter=/^[\w\-\'\.]+\@([\w\-\']+\.)+[a-z]{2,6}$/i;
if ( ! (emailFilter.test(val)) )
{
fld.focus();
return "Please enter a valid email address.\n";
}
return "";
}

function checkPhone(fld)
{
var val = fld.value;

// strip out ALL non-numeric characters
var ph = val.replace(/[^\d]/g, "");


if ( ph.length != 10 )
{
fld.focus();
return "The phone number must contain 10 digits.\n";
}

return "";
}
</script>
</head>

<body style="float: left;margin-left: 30%">
    <br>   
<center> <h1>Item Found</h1></center>
 

<div>
    <form action="foundreport" method="post" style="margin-left: 30px;" onsubmit="return checkWholeForm(this);">
      
      <h2>Item Details</h2>
     <label for="fname">Image &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
     <div class="tooltip"><input type="file"  name="ipic"> <span class="tooltiptext">This Field Optional</span></div>
     <br>
     <br>
     <label for="fname">Description&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
     <div class="tooltip"><textarea name="id" rows="5" cols="40"></textarea> <span class="tooltiptext">This Field Optional</span></div>
     <br>
     <br>
     <label for="fname">Location&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
     <div class="tooltip"><textarea name="location" rows="5" cols="40"></textarea> <span class="tooltiptext">This Field Optional</span></div>
     <br>
     <br>
     <label for="fname">Date&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
   <div class="tooltip"> <input type="text" name="dt"> <span class="tooltiptext">This Field Required</span></div>
    <br>
    <br>
    
    <h2>Other Details</h2>
    
    <label for="fname">First Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
   <div class="tooltip"> <input type="text" name="fname"> <span class="tooltiptext">This Field Required</span></div>
    <br>
  
    <label for="fname">Last Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text" name="lname"><span class="tooltiptext">This Field Required</span></div>
    <br>
   
    <label for="fname">Mobile Number&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text" name="phno"><span class="tooltiptext">This Field Required</span></div>
    <br>
    <br>
    <br>
    <input type="submit" value="Submit">
  </form>
</div>


   
</body>
</html>
