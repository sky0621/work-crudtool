A SELECT /*+ ORDERED  NO_INDEX(c pop90_idx) */
       c.city, pop90,
       sdo_nn_distance (1) distance_in_miles
FROM geod_interstates i,
     geod_cities c
WHERE i.highway = 'I170'
  AND sdo_nn(c.location, i.geom,
            'sdo_batch_size=10 unit=mile', 1) = 'TRUE'
  AND c.pop90 > 300000
  AND rownum < 6
ORDER BY distance_in_miles;