SELECT 
    f.nome AS Filial, 
    SUM(p.preco * e.quantidade) AS Soma_Produtos
FROM 
    filial f
JOIN 
    estoque e ON f.cnpj = e.cnpj_filial
JOIN 
    produto p ON e.id_produto = p.id
GROUP BY 
    f.cnpj
HAVING 
    SUM(p.preco * e.quantidade) > 10000
ORDER BY 
    Soma_Produtos DESC;
