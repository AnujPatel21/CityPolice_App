<html>
<head>
<script src='https://maps.googleapis.com/maps/api/js?v=3.exp'>
</script>
<div style='overflow:hidden;height:800px;width:1500px;'>
<div id='gmap_canvas' style='height:800px;width:1500px;'>
</div>
<style>#gmap_canvas img{max-width:none!important;background:none!important}</style>
</div>
<script type='text/javascript'>
    function init_map()
    {
        var myOptions = {zoom:17,center:new google.maps.LatLng(23.01643216979776,72.58759482895812),mapTypeId: google.maps.MapTypeId.ROADMAP};
        map = new google.maps.Map(document.getElementById('gmap_canvas'), myOptions);
        marker = new google.maps.Marker({map: map,position: new google.maps.LatLng(23.01643216979776,72.58759482895812)});
        google.maps.event.addListener(marker, 'click', function(){infowindow.open(map,marker);});
        infowindow.open(map,marker);
    }
google.maps.event.addDomListener(window, 'load', init_map);
</script>
</head>

<body>
</body>

</html>