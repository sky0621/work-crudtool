SELECT DISTINCT
  item.K_ID,
  item.K_NAME,
  t.V_VAL
FROM
  mst_item item
INNER JOIN
  tmp_tmp t ON item.V_ID = t.V_ID
WHERE
  t.V_ORDER
