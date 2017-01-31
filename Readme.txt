
 - Чтобы создать таск от TestNG и использовать при выполнении testng.xml нужно ПКМ на testng.xml -> Create чего-то
   там с иконкой "nTg" - его и запускать.

 - Если тест принадлежит группе, которая не указана в testng.xml, то тест не выполняется.

 - Если тест находится в классе, который не указан в testng.xml, то тест не выполняется.

 - Конфиг в YAML:
    name: Testing1
    tests:
      - name: testik1
        includedGroups:
          - firstgroup
          - secondgroup
    #    excludedGroups: [ broken ]
        classes:
          - ru.r5am.ASD0101_01
          - ru.r5am.ASD0101_02

 - Имена тестов с '$':




