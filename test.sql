SELECT
  it.*
FROM
  fs_mst_item it
INNER JOIN
  fs_mst_category ct ON ct.category_id = it.category_id
WHERE
  it.value > /*var*/100
ORDER BY
  it.value DESC