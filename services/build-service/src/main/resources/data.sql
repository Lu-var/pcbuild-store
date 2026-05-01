-- =========================
-- BUILDS
-- =========================

INSERT INTO build (user_id, name, status, created_at) VALUES
                                                          (1, 'Gaming Beast RTX', 'VALIDATED', '2026-04-30T10:15:00'),
                                                          (2, 'Budget Office PC', 'DRAFT', '2026-04-30T10:20:00'),
                                                          (1, 'Streaming Ryzen Setup', 'INCOMPATIBLE', '2026-04-30T10:25:00'),
                                                          (3, 'Midrange Editing Build', 'VALIDATED', '2026-04-30T10:30:00'),
                                                          (2, 'Test Bench Intel', 'DRAFT', '2026-04-30T10:35:00');

-- =========================
-- BUILD ITEMS
-- =========================

-- Build 1 : Gaming Beast RTX
INSERT INTO build_item (build_id, product_id, quantity) VALUES
                                                            (1, 101, 1), -- CPU
                                                            (1, 102, 1), -- GPU
                                                            (1, 103, 2), -- RAM
                                                            (1, 104, 1), -- Motherboard
                                                            (1, 105, 1), -- PSU
                                                            (1, 106, 1); -- SSD

-- Build 2 : Budget Office PC
INSERT INTO build_item (build_id, product_id, quantity) VALUES
                                                            (2, 107, 1),
                                                            (2, 108, 1),
                                                            (2, 109, 1),
                                                            (2, 110, 1);

-- Build 3 : Streaming Ryzen Setup
INSERT INTO build_item (build_id, product_id, quantity) VALUES
                                                            (3, 111, 1),
                                                            (3, 112, 1),
                                                            (3, 113, 2),
                                                            (3, 114, 1),
                                                            (3, 115, 1);

-- Build 4 : Midrange Editing Build
INSERT INTO build_item (build_id, product_id, quantity) VALUES
                                                            (4, 116, 1),
                                                            (4, 117, 1),
                                                            (4, 118, 2),
                                                            (4, 119, 1),
                                                            (4, 120, 1),
                                                            (4, 121, 1);

-- Build 5 : Test Bench Intel
INSERT INTO build_item (build_id, product_id, quantity) VALUES
                                                            (5, 122, 1),
                                                            (5, 123, 1),
                                                            (5, 124, 1);