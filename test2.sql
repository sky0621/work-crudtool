with  
   view01 as 
      ( select column99, from table99 where column01 = '01' ) , 
   view02 as
      ( select column33 from table88 where table88.column01 = view01.column01 )
  select 
   view02.column33, table01.column77
   from 
    table01, view02
   where
     table01.column33 = view02.column33