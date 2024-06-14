
-- ----------------------------
-- Records of dwd_dz_gj_ryjghxx_damo_v2_di_20240509
-- ----------------------------

-- ----------------------------
-- Table structure for test_pg
-- ----------------------------
DROP TABLE IF EXISTS "test"."test_pg";
CREATE TABLE "test"."test_pg" (
                                 "id" int4 NOT NULL,
                                 "name" varchar(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of test_pg
-- ----------------------------
INSERT INTO "test"."test_pg" VALUES (1, 'pg');