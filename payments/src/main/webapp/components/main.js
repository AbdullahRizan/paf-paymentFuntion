$(document).ready(function() 
{ 
 $("#alertSuccess").hide(); 
 $("#alertError").hide(); 
}); 
$(document).on("click", "#btnSave", function(event) 
{ 
});
$("#alertSuccess").text(""); 
$("#alertSuccess").hide(); 
$("#alertError").text(""); 
$("#alertError").hide();

// Form validation-------------------
var status = validateItemForm(); 
// If not valid
if (status != true) 
{ 
 $("#alertError").text(status); 
 $("#alertError").show(); 
return; 
}
// If valid
var payments = getpaymentCard($("#txtamount").val().trim(),  
 $("#ddlType").val()); 
$("#colStudents").append(student);

$("#alertSuccess").text("Saved successfully."); 
$("#alertSuccess").show(); 
 
$("#formStudent")[0].reset();

function validateItemForm() 
{ 
 if ($("#txtamount").val().trim() == "") 
{ 
return "Insert payment amount."; 
}
if ($("#txtCardName").val().trim() == "") 
{ 
return "Insert payment card number."; 
}
if ($("#ddlType").val() == "0") 
{ 
return "Select type."; 
}

 return true; 
}
function getpaymentCard(amount, cardType, cardNumber) 
{ 
var title = (type == "visa") ; 
var cardTypeNumber = ""; 
switch (cardType) 
 { 
case "1": 
 cardTypeNumber = "visa"; 
 break; 
case "2": 
 cardTypeNumber = "Master"; 
 break; 
 
 } 
var payment = ""; 
 payment += "<div class=\"payment card bg-light m-2\" 
 style= \ "max-width: 10rem; float: left;\">"; 
payment += "<div class=\"card-body\">"; 
payment += title + " " + name + ","; 
payment += "<br>"; 
payment += cardTypeNumber + " year"; 
payment += "</div>"; 
payment += "<input type=\"button\" value=\"Remove\" 
 class= \"btn btn-danger remove\">"; 
 student += "</div>"; 
return student; 
}

$(this).closest(".payment").remove();
$(document).on("click", ".remove", function() 
{ 
 $(this).closest(".payment").remove(); 
 
 $("#alertSuccess").text("Removed successfully."); 
 $("#alertSuccess").show(); 
});
