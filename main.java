<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Payment Gateway Example</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 50px;
    }
    .payment-form {
      max-width: 400px;
      margin: auto;
    }
    .form-group {
      margin-bottom: 15px;
    }
  </style>
</head>
<body>

<div class="payment-form">
  <h2>Payment Details</h2>
  <div class="form-group">
    <label for="cardNumber">Card Number:</label>
    <input type="text" id="cardNumber" placeholder="Card Number">
  </div>
  <div class="form-group">
    <label for="expiry">Expiry Date:</label>
    <input type="text" id="expiry" placeholder="MM/YY">
  </div>
  <div class="form-group">
    <label for="cvv">CVV:</label>
    <input type="text" id="cvv" placeholder="CVV">
  </div>
  <button onclick="processPayment()">Submit Payment</button>
</div>

<script>
  function processPayment() {
    const cardNumber = document.getElementById('cardNumber').value;
    const expiry = document.getElementById('expiry').value;
    const cvv = document.getElementById('cvv').value;

    // Perform validation and processing here
    // In a real-world scenario, you would integrate with a payment gateway service to handle the payment processing.
    console.log('Payment processed successfully!');
  }
</script>

</body>
</html>
