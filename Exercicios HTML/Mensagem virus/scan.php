<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $url = $_POST['url'];

    // Simples teste de header HTTP
    $headers = get_headers($url);
    echo "<h2>Headers de $url</h2><pre>";
    print_r($headers);
    echo "</pre>";

    // Adicione mais testes conforme necessário
}
?>
