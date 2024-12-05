SELECT 
    f.nome AS Fornecedor, 
    SUM(p.preco) AS Soma_Preço
FROM 
    produto p
JOIN 
    fornecedor f ON p.id_fornecedor = f.id
GROUP BY 
    f.id
HAVING 
    SUM(p.preco) > 500
ORDER BY 
    Soma_Preço DESC;
