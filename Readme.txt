
 - Чтобы создать таск от TestNG и использовать при выполнении testng.xml нужно ПКМ на testng.xml -> Create чего-то
   там с иконкой "nTg" - его и запускать.

 - Если тест принадлежит группе, которая не указана в testng.xml, то тест не выполняется.

 - Если тест находится в классе, который не указан в testng.xml, то тест не выполняется.

 - Конфиг в YAML, пример рабочий:
                                    name: Testing1
                                    tests:
                                      - name: testik1
                                        includedGroups:
                                          - firstgroup
                                          - secondgroup
                                    #    excludedGroups: [ broken ]
                                        classes:
                                          - ru.r5am.ASD0101$01
                                          - ru.r5am.ASD0101$02

 - Имена тестов с '$' (первоначально имена были с '_'):
    -- в IDEA в testng.xml не резолвятся имена классов - errors и подсветка красным имён
    -- в IDEA прекращат запускать тесты с иконкой "nTg" - 'java.lang.ClassNotFoundException: ru.r5am.ASD0101'
    -- в IDEA через закладку 'Gradle' тесты и для XML, и для YAML конфигов тесты билдятся
    -- В командной строке Gradle тесты и для XML, и для YAML конфигов отрабатывают не смотря
       на 'java.lang.ClassNotFoundException: ru.r5am.ASD0101'






