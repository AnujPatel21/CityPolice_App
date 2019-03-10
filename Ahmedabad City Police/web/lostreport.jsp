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

</head>

<body style="float: left;margin-left: 30%">
    <br>   
<center> <h1> Lost Report</h1></center>
 

<div>
    <form action="lostreport" method="post" style="margin-left: 30px;">
      
      <h2>Owner Details</h2>
    
    <label for="fname">First Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
   <div class="tooltip"> <input type="text" name="fname"> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <label for="fname">Last Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text" name="lname"><span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <label for="fname">Mobile Number&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text" name="phno"><span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <label for="fname">Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><textarea name="address" rows="5" cols="40"> </textarea><span class="tooltiptext">This Field Required</span></div>
    <br>
    <br>
    <h2>Item Details</h2>
    
    <label for="fname">Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text" name="iname"> <span class="tooltiptext">This Field Required</span></div>
    <br>
    <br>
    <label for="fname">Description&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
    <div class="tooltip"><textarea name="id" rows="5" cols="40"></textarea> <span class="tooltiptext">This Field Optional</span></div>
    <br>
    <br>
    <label for="fname">Lost Date &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text"  name="dt"> <span class="tooltiptext">This Field Optional</span></div>
    <br>
    <br>
     <label for="fname">Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text"  name="ip"> <span class="tooltiptext">This Field Optional</span></div>
    <br>
    <br>
     <label for="fname">Bill/Proof &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
     <div class="tooltip"><input type="file"  name="ib"> <span class="tooltiptext">This Field Optional</span></div>
    <br>
    <br>
    <label for="fname">Image &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
     <div class="tooltip"><input type="file"  name="ipic"> <span class="tooltiptext">This Field Optional</span></div>
    <br>
    <br>
    Item type&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;
  <select  name="itype" style="overflow:scroll">
    <option value="Mobile">Mobile</option>
    <option value="Vehicals">Vehicles</option>
    <option value="Jewellery">Jewellery</option>
        <option value="Purse">Purse</option>
    <option value="Other">Other</option>
  </select>
    <br>
    <br>
    <input type="submit" value="Submit">
  </form>
</div>


   
</body>
</html>
