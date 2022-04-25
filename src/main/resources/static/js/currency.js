$(function() {
    let rublesInUsd;

    $.ajax({
        url: '/currency?code=USD',
        type: 'GET',
        success: function (data) {
            rublesInUsd = data.value;
            console.log('Текущий курс доллара в рублях ' + rublesInUsd);
        }
    });

    $('#calculateButton').click(function (){
        let currency = $('#currencyValue').val();
        let currencyAsNumber;
        if (!currency || isNaN(currencyAsNumber = parseFloat(currency)) || currencyAsNumber < 0){
            $('#result').text('Произошла ошибка во время расчета');
            alert('Введенное значение некорректно!');
            return;
        }
        $('#currencyValue').val(currencyAsNumber);
        currencyAsNumber *= rublesInUsd;
        console.log('Результат вычисления ' + currencyAsNumber);
        $('#result').text('Результат конвертации: ' + currencyAsNumber + ' рублей');
    })
});