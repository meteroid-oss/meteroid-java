# Changelog

## [0.31.1](https://github.com/meteroid-oss/meteroid-java/compare/v0.31.0...v0.31.1) (2026-10-30)


### Features

* **api:** add `GET /api/v1/licenses`, `GET /api/v1/licenses/{license_id}`, `GET /api/v1/licenses/{license_id}/activation-code`, `GET /api/v1/licensing/signing-keys`, `POST /api/v1/licenses` and 2 more ([a15284b](https://github.com/meteroid-oss/meteroid-java/commit/a15284b1705fb97ed0fd58b4be3696d87baf3025))
* **api:** update `GET /api/v1/plans`, `GET /api/v1/plans/{plan_id}`, `PATCH /api/v1/plans/{plan_id}`, `POST /api/v1/custom-property-definitions`, `POST /api/v1/plans` and 3 more ([a15284b](https://github.com/meteroid-oss/meteroid-java/commit/a15284b1705fb97ed0fd58b4be3696d87baf3025))
* **api:** update SDKs to meteroid 0.1.0 ([#17](https://github.com/meteroid-oss/meteroid-java/issues/17)) ([a15284b](https://github.com/meteroid-oss/meteroid-java/commit/a15284b1705fb97ed0fd58b4be3696d87baf3025))

## [0.31.0](https://github.com/meteroid-oss/meteroid-java/compare/v0.30.1...v0.31.0) (2026-10-28)


### ⚠ BREAKING CHANGES

* **api:** update SDKs to meteroid 0.1.0 ([#15](https://github.com/meteroid-oss/meteroid-java/issues/15))
* **api:** `GET /api/v1/coupons`: added `#/components/schemas/CreditDiscount` to the `data/items/discount` response property `oneOf` list for the response status `200`
* **api:** `GET /api/v1/coupons/{coupon_id}`: added `#/components/schemas/CreditDiscount` to the `discount` response property `oneOf` list for the response status `200`
* **api:** `GET /api/v1/plans`: added `#/components/schemas/CreditPlanFee` to the `data/items/price_components/items/fee/oneOf[#/components/schemas/Fee]/` response property `oneOf` list for the response status `200`
* **api:** `GET /api/v1/plans/{plan_id}`: added `#/components/schemas/CreditPlanFee` to the `price_components/items/fee/oneOf[#/components/schemas/Fee]/` response property `oneOf` list for the response status `200`
* **api:** `GET /api/v1/products`: added `#/components/schemas/CreditFeeStructure` to the `data/items/fee_structure` response property `oneOf` list for the response status `200`
* **api:** `GET /api/v1/products/{product_id}`: added `#/components/schemas/CreditFeeStructure` to the `fee_structure` response property `oneOf` list for the response status `200`
* **api:** `GET /api/v1/subscriptions/{subscription_id}`: added `#/components/schemas/CreditDiscount` to the `applied_coupons/items/coupon/discount` response property `oneOf` list for the response status `200`
* **api:** `GET /api/v1/subscriptions/{subscription_id}`: added `#/components/schemas/CreditFee` to the `add_ons/items/fee` response property `oneOf` list for the response status `200`
* **api:** `GET /api/v1/subscriptions/{subscription_id}`: added `#/components/schemas/CreditFee` to the `components/items/fee` response property `oneOf` list for the response status `200`
* **api:** `PATCH /api/v1/coupons/{coupon_id}`: added the new required request property `discount/oneOf[#/components/schemas/CouponDiscount]/oneOf[#/components/schemas/FixedDiscount]/type`
* **api:** 90 more breaking changes

### Features

* **api:** `GET /api/v1/coupons/{coupon_id}`: added `#/components/schemas/CreditDiscount` to the `discount` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `GET /api/v1/coupons`: added `#/components/schemas/CreditDiscount` to the `data/items/discount` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `GET /api/v1/plans/{plan_id}`: added `#/components/schemas/CreditPlanFee` to the `price_components/items/fee/oneOf[#/components/schemas/Fee]/` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `GET /api/v1/plans`: added `#/components/schemas/CreditPlanFee` to the `data/items/price_components/items/fee/oneOf[#/components/schemas/Fee]/` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `GET /api/v1/products/{product_id}`: added `#/components/schemas/CreditFeeStructure` to the `fee_structure` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `GET /api/v1/products`: added `#/components/schemas/CreditFeeStructure` to the `data/items/fee_structure` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `GET /api/v1/subscriptions/{subscription_id}`: added `#/components/schemas/CreditDiscount` to the `applied_coupons/items/coupon/discount` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `GET /api/v1/subscriptions/{subscription_id}`: added `#/components/schemas/CreditFee` to the `add_ons/items/fee` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `GET /api/v1/subscriptions/{subscription_id}`: added `#/components/schemas/CreditFee` to the `components/items/fee` response property `oneOf` list for the response status `200` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** `PATCH /api/v1/coupons/{coupon_id}`: added the new required request property `discount/oneOf[#/components/schemas/CouponDiscount]/oneOf[#/components/schemas/FixedDiscount]/type` ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** 90 more breaking changes ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** update SDKs to meteroid 0.1.0 ([#15](https://github.com/meteroid-oss/meteroid-java/issues/15)) ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))
* **api:** update the API definitions ([85c2348](https://github.com/meteroid-oss/meteroid-java/commit/85c23480c8ea2b9cacc74d0ab91ad5046035945a))

## [0.30.1](https://github.com/meteroid-oss/meteroid-java/compare/v0.30.0...v0.30.1) (2026-10-16)


### Bug Fixes

* **api:** update SDKs to meteroid 0.1.0 ([#13](https://github.com/meteroid-oss/meteroid-java/issues/13)) ([0f3969a](https://github.com/meteroid-oss/meteroid-java/commit/0f3969a45602afde06e17069265bcc47a2a98284))

## [0.30.0](https://github.com/meteroid-oss/meteroid-java/compare/v0.29.0...v0.30.0) (2026-10-09)


### ⚠ BREAKING CHANGES

* **api:** update SDKs to meteroid 0.1.0 ([#11](https://github.com/meteroid-oss/meteroid-java/issues/11))
* **api:** `POST /api/v1/events/ingest`: the `events/items/timestamp` request property `type/format` changed from `string` to `string, null/date-time`

### Features

* **api:** `POST /api/v1/events/ingest`: the `events/items/timestamp` request property `type/format` changed from `string` to `string, null/date-time` ([9dc3820](https://github.com/meteroid-oss/meteroid-java/commit/9dc38204efd508ca39e31ae63f32fc6364841b1c))
* **api:** add `DELETE /api/v1/webhooks/endpoints/{endpoint_id}` ([9dc3820](https://github.com/meteroid-oss/meteroid-java/commit/9dc38204efd508ca39e31ae63f32fc6364841b1c))
* **api:** update `GET /api/v1/plans` and 1029 more ([9dc3820](https://github.com/meteroid-oss/meteroid-java/commit/9dc38204efd508ca39e31ae63f32fc6364841b1c))
* **api:** update SDKs to meteroid 0.1.0 ([#11](https://github.com/meteroid-oss/meteroid-java/issues/11)) ([9dc3820](https://github.com/meteroid-oss/meteroid-java/commit/9dc38204efd508ca39e31ae63f32fc6364841b1c))

## [0.29.0](https://github.com/meteroid-oss/meteroid-java/compare/v0.28.0...v0.29.0) (2026-10-08)


### ⚠ BREAKING CHANGES

* **api:** update SDKs to meteroid 0.1.0 ([#9](https://github.com/meteroid-oss/meteroid-java/issues/9))

### Features

* **api:** update SDKs to meteroid 0.1.0 ([#9](https://github.com/meteroid-oss/meteroid-java/issues/9)) ([0fdc3a3](https://github.com/meteroid-oss/meteroid-java/commit/0fdc3a348183a87ca1e8431cc72ede67fd8c42f4))

## [0.28.0](https://github.com/meteroid-oss/meteroid-java/compare/v0.27.1...v0.28.0) (2026-10-07)


### ⚠ BREAKING CHANGES

* **api:** update SDKs to meteroid 0.1.0 ([#7](https://github.com/meteroid-oss/meteroid-java/issues/7))

### Features

* **api:** update SDKs to meteroid 0.1.0 ([#7](https://github.com/meteroid-oss/meteroid-java/issues/7)) ([822b081](https://github.com/meteroid-oss/meteroid-java/commit/822b081fc714b1b725fe67b3db6aecfcf8cf53d1))

## [0.27.1](https://github.com/meteroid-oss/meteroid-java/compare/v0.27.0...v0.27.1) (2026-10-06)


### Bug Fixes

* **api:** update SDKs to meteroid 0.1.0 ([#3](https://github.com/meteroid-oss/meteroid-java/issues/3)) ([c5162f9](https://github.com/meteroid-oss/meteroid-java/commit/c5162f9855cc5e98e8181756f16814001abb1957))

## [0.27.0](https://github.com/meteroid-oss/meteroid-java/compare/v0.1.0...v0.27.0) (2026-10-06)


### Features

* **api:** update SDKs to meteroid 0.1.0 ([#1](https://github.com/meteroid-oss/meteroid-java/issues/1)) ([b71917e](https://github.com/meteroid-oss/meteroid-java/commit/b71917e260474330cccc755ef6167ecc0bd01b67))
