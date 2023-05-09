for (var i = 0; i < data.length; i++) {
    var html = `<tr>
                <td align="center">${data[i].photo}</td>
                <td align="center">${data[i].name}</td>
                <td align="center">${data[i].age}</td>
              </tr>`;
    $('#listTable').append(html);
}