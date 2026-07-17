{
  "info": {
    "_postman_id": "d6b3dff7-cdc1-4e56-b722-db1a3ee6011b",
    "name": "Udemy-Master-Microservices-with-Spring-Boot-and-Spring-Cloud",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
    "_exporter_id": "11976050"
  },
  "item": [
    {
      "name": "section3",
      "item": [
        {
          "name": "Hello World",
          "item": [
            {
              "name": "Hello World",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/hello-world",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "hello-world"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "Good Morning NL",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "Accept-Language",
                    "value": "nl",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/hello-world/internationalized",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "hello-world",
                    "internationalized"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "Good Morning EN",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "Accept-Language",
                    "value": "en",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/hello-world/internationalized",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "hello-world",
                    "internationalized"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "Good Morning FR",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "Accept-Language",
                    "value": "fr",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/hello-world/internationalized",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "hello-world",
                    "internationalized"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "Good Morning DE",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "Accept-Language",
                    "value": "de",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/hello-world/internationalized",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "hello-world",
                    "internationalized"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "Hello World Bean",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/hello-world/bean",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "hello-world",
                    "bean"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "Hello World Path Variable",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/hello-world/path-variable/plebeu",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "hello-world",
                    "path-variable",
                    "plebeu"
                  ]
                }
              },
              "response": []
            }
          ]
        },
        {
          "name": "Users",
          "item": [
            {
              "name": "get one",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/my-users/132",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "my-users",
                    "132"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "get one - HATEOAS",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/my-users/hateoas/1",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "my-users",
                    "hateoas",
                    "1"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "delete user",
              "request": {
                "method": "DELETE",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/my-users/1",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "my-users",
                    "1"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "get all",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "Acc",
                    "value": "",
                    "type": "text",
                    "disabled": true
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/my-users",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "my-users"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "get all xml",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "Accept",
                    "value": "application/xml",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/my-users",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "my-users"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "create new user",
              "request": {
                "method": "POST",
                "header": [],
                "body": {
                  "mode": "raw",
                  "raw": "{\r\n    \"name\":\"Test new User\",\r\n    \"birthDate\":\"2998-07-09\"\r\n}",
                  "options": {
                    "raw": {
                      "language": "json"
                    }
                  }
                },
                "url": {
                  "raw": "http://localhost:8080/my-users",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "my-users"
                  ]
                }
              },
              "response": []
            }
          ]
        },
        {
          "name": "Versioning",
          "item": [
            {
              "name": "Spring Boot Versioning",
              "item": [
                {
                  "name": "PersonV1 URI",
                  "request": {
                    "method": "GET",
                    "header": [],
                    "url": {
                      "raw": "http://localhost:8080/1.0.0/person-sbi",
                      "protocol": "http",
                      "host": [
                        "localhost"
                      ],
                      "port": "8080",
                      "path": [
                        "1.0.0",
                        "person-sbi"
                      ]
                    }
                  },
                  "response": []
                },
                {
                  "name": "PersonV1 params",
                  "request": {
                    "method": "GET",
                    "header": [],
                    "url": {
                      "raw": "http://localhost:8080/person-sbi?version=1.0.0",
                      "protocol": "http",
                      "host": [
                        "localhost"
                      ],
                      "port": "8080",
                      "path": [
                        "person-sbi"
                      ],
                      "query": [
                        {
                          "key": "version",
                          "value": "1.0.0"
                        }
                      ]
                    }
                  },
                  "response": []
                },
                {
                  "name": "PersonV2 URI",
                  "request": {
                    "method": "GET",
                    "header": [],
                    "url": {
                      "raw": "http://localhost:8080/2.0.0/person-sbi",
                      "protocol": "http",
                      "host": [
                        "localhost"
                      ],
                      "port": "8080",
                      "path": [
                        "2.0.0",
                        "person-sbi"
                      ]
                    }
                  },
                  "response": []
                },
                {
                  "name": "PersonV2 params",
                  "request": {
                    "method": "GET",
                    "header": [],
                    "url": {
                      "raw": "http://localhost:8080/person-sbi?version=2.0.0",
                      "protocol": "http",
                      "host": [
                        "localhost"
                      ],
                      "port": "8080",
                      "path": [
                        "person-sbi"
                      ],
                      "query": [
                        {
                          "key": "version",
                          "value": "2.0.0"
                        }
                      ]
                    }
                  },
                  "response": []
                },
                {
                  "name": "PersonV2 headers",
                  "request": {
                    "method": "GET",
                    "header": [
                      {
                        "key": "X-API-VERSION",
                        "value": "2.0.0",
                        "type": "text"
                      }
                    ],
                    "url": {
                      "raw": "http://localhost:8080/person-sbi",
                      "protocol": "http",
                      "host": [
                        "localhost"
                      ],
                      "port": "8080",
                      "path": [
                        "person-sbi"
                      ]
                    }
                  },
                  "response": []
                },
                {
                  "name": "PersonV2 media type",
                  "request": {
                    "method": "GET",
                    "header": [
                      {
                        "key": "Accept",
                        "value": "application/json;version=2",
                        "type": "text"
                      }
                    ],
                    "url": {
                      "raw": "http://localhost:8080/person-sbi",
                      "protocol": "http",
                      "host": [
                        "localhost"
                      ],
                      "port": "8080",
                      "path": [
                        "person-sbi"
                      ]
                    }
                  },
                  "response": []
                }
              ]
            },
            {
              "name": "PersonV1",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/person/v1",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "person",
                    "v1"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "PersonV1 params",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/person?version=1",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "person"
                  ],
                  "query": [
                    {
                      "key": "version",
                      "value": "1",
                      "type": "text"
                    }
                  ]
                }
              },
              "response": []
            },
            {
              "name": "PersonV1 headers",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "X-API-VERSION",
                    "value": "1",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/person",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "person"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "PersonV1 media type",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "Accept",
                    "value": "application/vnd.company.app-v1+json",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/person",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "person"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "PersonV2",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/person/v2",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "person",
                    "v2"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "PersonV2 params",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/person?version=2",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "person"
                  ],
                  "query": [
                    {
                      "key": "version",
                      "value": "2",
                      "type": "text"
                    }
                  ]
                }
              },
              "response": []
            },
            {
              "name": "PersonV2 headers",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "X-API-VERSION",
                    "value": "2",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/person",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "person"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "PersonV2 media type",
              "request": {
                "method": "GET",
                "header": [
                  {
                    "key": "Accept",
                    "value": "application/vnd.comp-v2+json",
                    "type": "text"
                  }
                ],
                "url": {
                  "raw": "http://localhost:8080/person",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "person"
                  ]
                }
              },
              "response": []
            }
          ]
        },
        {
          "name": "JSON Filtering",
          "item": [
            {
              "name": "static filtering",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/static-filtering",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "static-filtering"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "dynamic filtering with view",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/dynamic-filtering",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "dynamic-filtering"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "static filtering list",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/static-filtering-list",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "static-filtering-list"
                  ]
                }
              },
              "response": []
            },
            {
              "name": "dynamic filtering with view list",
              "request": {
                "method": "GET",
                "header": [],
                "url": {
                  "raw": "http://localhost:8080/dynamic-filtering-list",
                  "protocol": "http",
                  "host": [
                    "localhost"
                  ],
                  "port": "8080",
                  "path": [
                    "dynamic-filtering-list"
                  ]
                }
              },
              "response": []
            }
          ]
        }
      ]
    }
  ]
}