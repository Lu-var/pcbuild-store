SELECT a.id, a.street, a.postal_code, c.name, r.name
FROM address a
JOIN city c ON a.city_id = c.id
JOIN region r ON c.region_id = r.id;
