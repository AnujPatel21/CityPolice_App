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
   
<center> <h1> First Information Report</h1></center>
    <center><h2>(Under Section 154 Cr.P.C)</h2></center>

<div>
    <form action="addfir" method="post" style="margin-left: 30px;">
      
      <h2>Formal Details</h2>
      
  
   Police Station&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;
  <select  name="ps" style="overflow:scroll">
    <option value="Vatva GIDC">Vatva GIDC</option>
    <option value="Nikol">Nikol</option>
    <option value="Paldi">Paldi</option>
        <option value="River Front West">River Front West</option>
    <option value="Vejalpur">Vejalpur</option>
    <option value="Vastrapur">Vastrapur</option>
        <option value="Shahpur">Shahpur</option>
    <option value="Shekarkotda">Shekarkotda</option>
    <option value="Sadarnagar">Sadarnagar</option>
        <option value="Ranip">Ranip</option>
    <option value="Rakhiyal">Rakhiyal</option>
    <option value="Navrangpura">Navrangpura</option>
        <option value="Naranpura">Naranpura</option>
    <option value="Maninagar">Maninagar</option>
    <option value="Khokhra">Khokhra</option>
        <option value="Karanj">Karanj</option>
    <option value="Kagdapith">Kagdapith</option>
    <option value="Haveli">Haveli</option>
        <option value="Gomtipur">Gomtipur</option>
    <option value="Ellisbridge">Ellisbridge</option>
    <option value="Danilimda">Danilimda</option>
    <option value="Bapunagar">Bapunagar</option>
    <option value="Aanandnagar">Aanandnagar</option>
    <option value="Sarkhej">Sarkhej</option>
    <option value="Krsnanagar">Krsnanagar</option>
    <option value="River Front East">River Front East</option>
    <option value="Vadaj">Vadaj</option>
        <option value="Vatva">Vatva</option>
    <option value="Sola">Sola</option>
    <option value="Sahibaug">Sahibaug</option>
        <option value="Satellite">Satellite</option>
    <option value="Sabarmati">Sabarmati</option>
    <option value="Ramol">Ramol</option>
        <option value="Odhav">Odhav</option>
    <option value="Naroda">Naroda</option>
    <option value="Meghaninagar">Meghaninagar</option>
        <option value="Madhavpur">Madhavpur</option>
    <option value="Khadia">Khadia</option>
    <option value="kalupur">kalupur</option>
        <option value="Ishanpur">Ishanpur</option>
    <option value="Gujarat University">Gujarat University</option>
    <option value="Ghatlodia">Ghatlodia</option>
        <option value="Dariyapur">Dariyapur</option>
    <option value="Chandkheda">Chandkheda</option>
    <option value="Amraiwadi">Amraiwadi</option>
  </select>

  <div class="tooltip"><span class="tooltiptext">This Field Required</span></div>
    <br>
    
    
    <label for="fname">Date&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
    <div class="tooltip"> <input type="text" name="date" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <label for="fname">Year&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text" name="year" required><span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <h2>Legal Act</h2>
    
    <label for="fname">Act i &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text" name="act1" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <label for="fname">Act ii&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
    <div class="tooltip"><input type="text" name="act2"> <span class="tooltiptext">This Field Optional</span></div>
    <br>
    
    <label for="fname">Act iii &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <div class="tooltip"><input type="text"  name="act3"> <span class="tooltiptext">This Field Optional</span></div>
    <br>
    <h2>Occurrence of Offense</h2>
    
    <label for="fname">Day &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
   <div class="tooltip"> <input type="text"  name="day"> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Date From &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
   <div class="tooltip"> <input type="text"  name="datefrom" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Date To &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
   <div class="tooltip"> <input type="text"  name="dateto" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Time From  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
   <div class="tooltip"> <input type="text"  name="timefrom" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Time To &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
   <div class="tooltip"> <input type="text"  name="timeto" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <h2>Place of Occurance</h2>
    
    <label for="fname">Direction From Police Station   </label>
   <div class="tooltip"> <input type="text"   name="direction" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <label for="fname">Distance From Police Station    </label>
   <div class="tooltip"> <input type="text"   name="distance" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
        
    <label for="fname">Place of Occurrence  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
   <div class="tooltip"> <input type="text"   name="place" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <h2>Complainant/Informant</h2>
    
     <label for="fname">Your Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
   <div class="tooltip"> <input type="text"   name="name" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Fathers Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>
   <div class="tooltip"> <input type="text"   name="father" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Date of Birth  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
   <div class="tooltip"> <input type="text"   name="dob" required> <span class="tooltiptext">This Field Required      </span></div>
    <br>
    
     <label for="fname">Nationality  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
   <div class="tooltip"> <input type="text"   name="nationality" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Passport Number &nbsp;  </label>
   <div class="tooltip"> <input type="text"   name="passport" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Occurrence  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
   <div class="tooltip"> <input type="text"   name="occurrence" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
     <label for="fname">Mobile Number  &nbsp;&nbsp;&nbsp; </label>
   <div class="tooltip"> <input type="text"   name="mobile" required> <span class="tooltiptext">This Field Required</span></div>
    <br>
    
    <input type="submit" value="Submit">
  </form>
</div>


   
</body>
</html>
