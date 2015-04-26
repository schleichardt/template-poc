package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Data {
    public static JsonNode products() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readTree("{\"offset\": 0, \"count\": 5, \"total\": 5, \"results\": [\n" +
                "  {\n" +
                "    \"id\": \"f3b17f52-9ab1-478f-899c-e3d2d5c74579\",\n" +
                "    \"version\": 2,\n" +
                "    \"productType\": {\n" +
                "      \"typeId\": \"product-type\",\n" +
                "      \"id\": \"da5dd5e7-c5e4-4ccd-a753-d92013414cd9\"\n" +
                "    },\n" +
                "    \"catalogs\": [],\n" +
                "    \"masterData\": {\n" +
                "      \"current\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"SAPPHIRE\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"b6c9c274-3637-41d4-b40e-e4e10a62ef67\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"sapphire1374314429721\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_SAPPHIRE_variant1_1374314429721\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 2800\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/252542005_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"staged\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"SAPPHIRE\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"b6c9c274-3637-41d4-b40e-e4e10a62ef67\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"sapphire1374314429721\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_SAPPHIRE_variant1_1374314429721\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 2800\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/252542005_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"published\": true,\n" +
                "      \"hasStagedChanges\": false\n" +
                "    },\n" +
                "    \"catalogData\": {},\n" +
                "    \"taxCategory\": {\n" +
                "      \"typeId\": \"tax-category\",\n" +
                "      \"id\": \"6a9a275f-cc37-46ec-bf65-df86cff150c3\"\n" +
                "    },\n" +
                "    \"lastVariantId\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"54e625a3-fb88-4593-82eb-28d1e52a7200\",\n" +
                "    \"version\": 2,\n" +
                "    \"productType\": {\n" +
                "      \"typeId\": \"product-type\",\n" +
                "      \"id\": \"da5dd5e7-c5e4-4ccd-a753-d92013414cd9\"\n" +
                "    },\n" +
                "    \"catalogs\": [],\n" +
                "    \"masterData\": {\n" +
                "      \"current\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"GIRLS HARTBREAK CREW\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"870b3e14-94c1-420e-b830-452a4b0f86a3\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"girls-hartbreak-crew1374314429744\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_GIRLS_HARTBREAK_CREW_variant1_1374314429744\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 3400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/253234387_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"staged\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"GIRLS HARTBREAK CREW\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"870b3e14-94c1-420e-b830-452a4b0f86a3\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"girls-hartbreak-crew1374314429744\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_GIRLS_HARTBREAK_CREW_variant1_1374314429744\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 3400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/253234387_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"published\": true,\n" +
                "      \"hasStagedChanges\": false\n" +
                "    },\n" +
                "    \"catalogData\": {},\n" +
                "    \"taxCategory\": {\n" +
                "      \"typeId\": \"tax-category\",\n" +
                "      \"id\": \"6a9a275f-cc37-46ec-bf65-df86cff150c3\"\n" +
                "    },\n" +
                "    \"lastVariantId\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"11e9c8de-f851-4c3d-bd2b-091edcf3c6df\",\n" +
                "    \"version\": 2,\n" +
                "    \"productType\": {\n" +
                "      \"typeId\": \"product-type\",\n" +
                "      \"id\": \"da5dd5e7-c5e4-4ccd-a753-d92013414cd9\"\n" +
                "    },\n" +
                "    \"catalogs\": [],\n" +
                "    \"masterData\": {\n" +
                "      \"current\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"WB ATHLETIC TANK\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"d312c586-7edf-4d85-a07e-3b3d18c998b1\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"wb-athletic-tank1374314429773\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_WB_ATHLETIC_TANK_variant1_1374314429773\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 8400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/253265444_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"staged\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"WB ATHLETIC TANK\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"d312c586-7edf-4d85-a07e-3b3d18c998b1\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"wb-athletic-tank1374314429773\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_WB_ATHLETIC_TANK_variant1_1374314429773\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 8400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/253265444_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"published\": true,\n" +
                "      \"hasStagedChanges\": false\n" +
                "    },\n" +
                "    \"catalogData\": {},\n" +
                "    \"taxCategory\": {\n" +
                "      \"typeId\": \"tax-category\",\n" +
                "      \"id\": \"6a9a275f-cc37-46ec-bf65-df86cff150c3\"\n" +
                "    },\n" +
                "    \"lastVariantId\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"5becc121-1bbe-45f3-9f67-04208b476b3e\",\n" +
                "    \"version\": 2,\n" +
                "    \"productType\": {\n" +
                "      \"typeId\": \"product-type\",\n" +
                "      \"id\": \"da5dd5e7-c5e4-4ccd-a753-d92013414cd9\"\n" +
                "    },\n" +
                "    \"catalogs\": [],\n" +
                "    \"masterData\": {\n" +
                "      \"current\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"MB SOFTSHELL LINER\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"b6c9c274-3637-41d4-b40e-e4e10a62ef67\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"mb-softshell-liner1374314429797\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_MB_SOFTSHELL_LINER_variant1_1374314429797\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 10000\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/254391631_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"staged\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"MB SOFTSHELL LINER\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"b6c9c274-3637-41d4-b40e-e4e10a62ef67\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"mb-softshell-liner1374314429797\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_MB_SOFTSHELL_LINER_variant1_1374314429797\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 10000\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/254391631_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"published\": true,\n" +
                "      \"hasStagedChanges\": false\n" +
                "    },\n" +
                "    \"catalogData\": {},\n" +
                "    \"taxCategory\": {\n" +
                "      \"typeId\": \"tax-category\",\n" +
                "      \"id\": \"6a9a275f-cc37-46ec-bf65-df86cff150c3\"\n" +
                "    },\n" +
                "    \"lastVariantId\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"336c316d-7cf2-456d-a178-8e6bfeaede69\",\n" +
                "    \"version\": 2,\n" +
                "    \"productType\": {\n" +
                "      \"typeId\": \"product-type\",\n" +
                "      \"id\": \"da5dd5e7-c5e4-4ccd-a753-d92013414cd9\"\n" +
                "    },\n" +
                "    \"catalogs\": [],\n" +
                "    \"masterData\": {\n" +
                "      \"current\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"MB PREMIUM TECH T\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"870b3e14-94c1-420e-b830-452a4b0f86a3\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"mb-premium-tech-t1374314429824\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_MB_PREMIUM_TECH_T_variant1_1374314429824\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 10000\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/253245821_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"staged\": {\n" +
                "        \"name\": {\n" +
                "          \"en\": \"MB PREMIUM TECH T\"\n" +
                "        },\n" +
                "        \"description\": {\n" +
                "          \"en\": \"Sample description\"\n" +
                "        },\n" +
                "        \"categories\": [\n" +
                "          {\n" +
                "            \"typeId\": \"category\",\n" +
                "            \"id\": \"870b3e14-94c1-420e-b830-452a4b0f86a3\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"slug\": {\n" +
                "          \"en\": \"mb-premium-tech-t1374314429824\"\n" +
                "        },\n" +
                "        \"masterVariant\": {\n" +
                "          \"id\": 1,\n" +
                "          \"sku\": \"sku_MB_PREMIUM_TECH_T_variant1_1374314429824\",\n" +
                "          \"prices\": [\n" +
                "            {\n" +
                "              \"value\": {\n" +
                "                \"currencyCode\": \"EUR\",\n" +
                "                \"centAmount\": 10000\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"images\": [\n" +
                "            {\n" +
                "              \"url\": \"https://sphere.io/cli/data/253245821_1.jpg\",\n" +
                "              \"dimensions\": {\n" +
                "                \"w\": 1400,\n" +
                "                \"h\": 1400\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"attributes\": []\n" +
                "        },\n" +
                "        \"variants\": []\n" +
                "      },\n" +
                "      \"published\": true,\n" +
                "      \"hasStagedChanges\": false\n" +
                "    },\n" +
                "    \"catalogData\": {},\n" +
                "    \"taxCategory\": {\n" +
                "      \"typeId\": \"tax-category\",\n" +
                "      \"id\": \"6a9a275f-cc37-46ec-bf65-df86cff150c3\"\n" +
                "    },\n" +
                "    \"lastVariantId\": 1\n" +
                "  }\n" +
                "]}\n");
    }
}
