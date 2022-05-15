package payments;

public class paymentDetails {
	<form id="formItem" name="formItem" method="post" action="items.jsp">
	 Item code: 
	<input id="itemCode" name="amount" type="text"
	 class="form-control form-control-sm">
	<br> Item name: 
	<input id="itemName" name="cardName" type="text" 
	 class="form-control form-control-sm">
	<br> Item price: 
	<input id="itemPrice" name="cardNumber" type="text" 
	 class="form-control form-control-sm">
	<br> Item description: 


	</form>
	
	


public String readItems() 
{ 
String output = ""; 
try
{ 
Connection con = connect(); 
if (con == null) 
{ 
return "Error while connecting to the database for reading."; 
} 
// Prepare the html table to be displayed
output = "<table border=\"1\"><tr><th>Item Code</th> "
<th>amount</th><th>cardName</th>
<th>cardNumber</th> 
<th>Update</th><th>Remove</th> </tr>"; 
String query = "select * from items"; 
Statement stmt = con.createStatement(); 
ResultSet rs = stmt.executeQuery(query); 
// iterate through the rows in the result set
while (rs.next()) 
{ 
String amount = Integer.toString(rs.getInt("amount")); 
String cardName = rs.getString("cardName"); 
String cardNumber = rs.getString("cardNumber"); 

// Add into the html table
output += "<tr><td><input id='hidItemIDUpdate' 
name='hidItemIDUpdate' 
type='hidden' value='" + itemID + "'>"
+ itemCode + "</td>"; 
output += "<td>" + amount + "</td>"; 
output += "<td>" + cardName + "</td>"; 
output += "<td>" +cardNumber + "</td>"; 
// buttons
output += "<td><input name='btnUpdate' 
type='button' value='Update' 
class=' btnUpdate btn btn-secondary'></td>
<td><form method='post' action='items.jsp'>
<input name='btnRemove' type='submit' 
value='Remove' class='btn btn-danger'>
<input name='hidItemIDDelete' type='hidden' 
value='" + itemID + "'>" + "</form></td></tr>"; 
} 
con.close(); 
// Complete the html table
output += "</table>"; 
} 
4
catch (Exception e) 
{ 
output = "Error while reading the items."; 
System.err.println(e.getMessage()); 
} 
return output; 
}

function validateItemForm() 
{ 
//CODE
if ($("#amount").val().trim() == "") 
{ 
return "Insert amount."; 
} 
//NAME
if ($("#cardName").val().trim() == "") 
{ 
return "Insert card Name."; 
} 
//PRICE-------------------------------
if ($("#cardNumber").val().trim() == "") 
{ 
return "Insert card Number. "; 
}

} 
return true; 
}
$(document).ready(function() );s
{ 
if ($("#alertSuccess").text().trim() == "") 
{ 
$("#alertSuccess").hide(); 
} 
$("#alertError").hide(); 
}); 
//SAVE ============================================
$(document).on("click", "#btnSave", function(event) 
{ 
//Clear alerts---------------------
$("#alertSuccess").text(""); 
$("#alertSuccess").hide(); 
$("#alertError").text(""); 
$("#alertError").hide(); 
//Form validation-------------------
var status = validateItemForm(); 
if (status != true) 
{ 
$("#alertError").text(status); 
$("#alertError").show(); 
return; 
} 
//If valid------------------------
$("#formItem").submit(); 
}); 
//UPDATE==========================================
$(document).on("click", ".btnUpdate", function(event) 
{ 
$("#hidItemIDSave").val($(this).closest("tr").find('#hidItemIDUpdate').val()); 
$("#itemCode").val($(this).closest("tr").find('td:eq(0)').text()); 
$("#itemName").val($(this).closest("tr").find('td:eq(1)').text()); 
$("#itemPrice").val($(this).closest("tr").find('td:eq(2)').text()); 
$("#itemDesc").val($(this).closest("tr").find('td:eq(3)').text()); 
}); 
//CLIENT-MODEL================================================================
function validateItemForm() 
{ 
//CODE
if ($("#itemCode").val().trim() == "") 
{ 
return "Insert Item Code."; 
} 
//NAME
if ($("#itemName").val().trim() == "") 
{ 
return "Insert Item Name."; 
} 
9
//PRICE-------------------------------
if ($("#itemPrice").val().trim() == "") 
{ 
return "Insert Item Price."; 
} 
//is numerical value
var tmpPrice = $("#itemPrice").val().trim(); 
if (!$.isNumeric(tmpPrice)) 
{ 
return "Insert a numerical value for Item Price."; 
} 
//convert to decimal price
$("#itemPrice").val(parseFloat(tmpPrice).toFixed(2)); 
//DESCRIPTION------------------------
if ($("#itemDesc").val().trim() == "") 
{ 
return "Insert Item Description."; 
} 
return true; 
}

}



