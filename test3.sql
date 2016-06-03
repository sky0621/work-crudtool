select SZ_CD,connect_by_root staCD as Tanto_SZ_CD
from (select SZ_CD,OYA_SZ_CD,
      (select b.SZ_CD from Shozoku b,Tanto c
        where b.OYA_SZ_CD = a.SZ_CD
          and b.SZ_CD     = c.SZ_CD) as staCD
        from Shozoku a)
start with staCD is not null
connect by prior SZ_CD = OYA_SZ_CD
       and not (Level >= 2
            and staCD is not null)
 order by SZ_CD;