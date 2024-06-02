<%@page language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="calculator" >
    <h1>Smart Interest Calculator</h1>

    <form id="calcForm" action="simple">        <!-- form to take input -->
        <input type="number" id="p" name="p" placeholder="Enter Principal Amount" required>
        <input type="number" id="r" name="r" placeholder="Enter Annual Interest Rate (%)" required>
        <input type="number" id="t" name="t" placeholder="Enter Time Period (years)" required>
        <select id="i" name="i" onchange="updateFormAction()">  <!-- call this function to update form action -->
            <option value="simple">Simple Interest</option>
            <option value="compound">Compound Interest</option>
        </select>

        <button type="submit">Calculate</button>
    </form>
    <div id="result"></div>
</div>

<script>                            <!-- script to change form action to compound when user chooses compound -->
    function updateFormAction() {
        const i = document.getElementById('i').value;
        const calcForm = document.getElementById('calcForm');
        if (i === 'compound') {
            calcForm.action = 'compound';
        } else {
            calcForm.action = 'simple';
        }

    }
</script>

</body>
</html>
