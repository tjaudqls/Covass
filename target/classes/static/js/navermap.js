<script>
		/* <![CDATA[ */
			
		var HOME_PATH = window.HOME_PATH || '.';
		var position = new naver.maps.LatLng(37.3939898,126.9593967);

		var map = new naver.maps.Map('map', {
		    center: position,
		    zoom: 11
		});
  
  var defaultMarker1 = new naver.maps.Marker({
	    position: new naver.maps.LatLng(37.3939898,126.9593967),
	    map: map,
	    icon: {
	      content: '<div style="position:absolute;left:0;top:0;width:70px;background-color:#F2F0EA;text-align:center;border:2px solid #6C483B;">'
						+ '<img id = "img2" src="images/vertical_both_turn_left.png" style="width: 30px; height:30px">'
						+ '</br>'
						+ '<span id="cycle1" style="font-weight: bold;">  </span>'
						+ '</div>',
	      size: new naver.maps.Size(22, 35),
	      anchor: new naver.maps.Point(11, 35)
	    }
	  });

  var defaultMarker = new naver.maps.Marker({
    position: new naver.maps.LatLng(37.3925103,126.9551044),
    map: map,
    icon: {
      content: '<div style="position:absolute;left:0;top:0;width:70px;background-color:#F2F0EA;text-align:center;border:2px solid #6C483B;">'
					+ '<img id = "img1" src="images/vertical_both_turn_left.png" style="width: 30px; height:30px">'
					+ '</br>'
					+ '<span id="cycle2" style="font-weight: bold;">  </span>'
					+ '</div>',
      size: new naver.maps.Size(22, 35),
      anchor: new naver.maps.Point(11, 35)
    }
  });
/* ]]> */
</script>