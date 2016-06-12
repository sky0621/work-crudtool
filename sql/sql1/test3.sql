select * from third_table
where
  exists( select 1
    from exitable where name = 'aaa')