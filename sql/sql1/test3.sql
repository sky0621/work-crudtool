select * from third_table
where
  exists( select 1
    from mst_item where name = 'aaa')